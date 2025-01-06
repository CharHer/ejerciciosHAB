
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Carro;
import logica.Propietario;
import persistencia.exceptions.NonexistentEntityException;


public class CarroJpaController implements Serializable {
    
    public CarroJpaController() {
        emf = Persistence.createEntityManagerFactory("CarroPropietarioPU");
    }

    public CarroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carro carro) {
         EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(carro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Carro carro) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carro persistentCarro = em.find(Carro.class, carro.getNum_motor());
            Propietario unPropietarioOld = persistentCarro.getUnPropietario();
            Propietario unPropietarioNew = carro.getUnPropietario();
            if (unPropietarioNew != null) {
                unPropietarioNew = em.getReference(unPropietarioNew.getClass(), unPropietarioNew.getId());
                carro.setUnPropietario(unPropietarioNew);
            }
            carro = em.merge(carro);
            if (unPropietarioOld != null && !unPropietarioOld.equals(unPropietarioNew)) {
                unPropietarioOld.setCarro(null);
                unPropietarioOld = em.merge(unPropietarioOld);
            }
            if (unPropietarioNew != null && !unPropietarioNew.equals(unPropietarioOld)) {
                Carro oldCarroOfUnPropietario = unPropietarioNew.getCarro();
                if (oldCarroOfUnPropietario != null) {
                    oldCarroOfUnPropietario.setUnPropietario(null);
                    oldCarroOfUnPropietario = em.merge(oldCarroOfUnPropietario);
                }
                unPropietarioNew.setCarro(carro);
                unPropietarioNew = em.merge(unPropietarioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = carro.getNum_motor();
                if (findCarro(id) == null) {
                    throw new NonexistentEntityException("The carro with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Carro carro;
            try {
                carro = em.getReference(Carro.class, id);
                carro.getNum_motor();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The carro with id " + id + " no longer exists.", enfe);
            }
            Propietario unPropietario = carro.getUnPropietario();
            if (unPropietario != null) {
                unPropietario.setCarro(null);
                unPropietario = em.merge(unPropietario);
            }
            em.remove(carro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Carro> findCarroEntities() {
        return findCarroEntities(true, -1, -1);
    }

    public List<Carro> findCarroEntities(int maxResults, int firstResult) {
        return findCarroEntities(false, maxResults, firstResult);
    }

    private List<Carro> findCarroEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Carro.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Carro findCarro(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Carro.class, id);
        } finally {
            em.close();
        }
    }

    public int getCarroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Carro> rt = cq.from(Carro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
