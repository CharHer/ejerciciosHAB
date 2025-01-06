
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Sala;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Festival;
import persistencia.exceptions.NonexistentEntityException;


public class FestivalJpaController implements Serializable {
    
    public FestivalJpaController() {
        emf = Persistence.createEntityManagerFactory("FestivalCinePU");
    }

    public FestivalJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Festival festival) {
        if (festival.getListaSalas() == null) {
            festival.setListaSalas(new ArrayList<Sala>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Sala> attachedListaSalas = new ArrayList<Sala>();
            for (Sala listaSalasSalaToAttach : festival.getListaSalas()) {
                listaSalasSalaToAttach = em.getReference(listaSalasSalaToAttach.getClass(), listaSalasSalaToAttach.getId());
                attachedListaSalas.add(listaSalasSalaToAttach);
            }
            festival.setListaSalas(attachedListaSalas);
            em.persist(festival);
            for (Sala listaSalasSala : festival.getListaSalas()) {
                Festival oldFestivalOfListaSalasSala = listaSalasSala.getFestival();
                listaSalasSala.setFestival(festival);
                listaSalasSala = em.merge(listaSalasSala);
                if (oldFestivalOfListaSalasSala != null) {
                    oldFestivalOfListaSalasSala.getListaSalas().remove(listaSalasSala);
                    oldFestivalOfListaSalasSala = em.merge(oldFestivalOfListaSalasSala);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Festival festival) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Festival persistentFestival = em.find(Festival.class, festival.getId());
            List<Sala> listaSalasOld = persistentFestival.getListaSalas();
            List<Sala> listaSalasNew = festival.getListaSalas();
            List<Sala> attachedListaSalasNew = new ArrayList<Sala>();
            for (Sala listaSalasNewSalaToAttach : listaSalasNew) {
                listaSalasNewSalaToAttach = em.getReference(listaSalasNewSalaToAttach.getClass(), listaSalasNewSalaToAttach.getId());
                attachedListaSalasNew.add(listaSalasNewSalaToAttach);
            }
            listaSalasNew = attachedListaSalasNew;
            festival.setListaSalas(listaSalasNew);
            festival = em.merge(festival);
            for (Sala listaSalasOldSala : listaSalasOld) {
                if (!listaSalasNew.contains(listaSalasOldSala)) {
                    listaSalasOldSala.setFestival(null);
                    listaSalasOldSala = em.merge(listaSalasOldSala);
                }
            }
            for (Sala listaSalasNewSala : listaSalasNew) {
                if (!listaSalasOld.contains(listaSalasNewSala)) {
                    Festival oldFestivalOfListaSalasNewSala = listaSalasNewSala.getFestival();
                    listaSalasNewSala.setFestival(festival);
                    listaSalasNewSala = em.merge(listaSalasNewSala);
                    if (oldFestivalOfListaSalasNewSala != null && !oldFestivalOfListaSalasNewSala.equals(festival)) {
                        oldFestivalOfListaSalasNewSala.getListaSalas().remove(listaSalasNewSala);
                        oldFestivalOfListaSalasNewSala = em.merge(oldFestivalOfListaSalasNewSala);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = festival.getId();
                if (findFestival(id) == null) {
                    throw new NonexistentEntityException("The festival with id " + id + " no longer exists.");
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
            Festival festival;
            try {
                festival = em.getReference(Festival.class, id);
                festival.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The festival with id " + id + " no longer exists.", enfe);
            }
            List<Sala> listaSalas = festival.getListaSalas();
            for (Sala listaSalasSala : listaSalas) {
                listaSalasSala.setFestival(null);
                listaSalasSala = em.merge(listaSalasSala);
            }
            em.remove(festival);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Festival> findFestivalEntities() {
        return findFestivalEntities(true, -1, -1);
    }

    public List<Festival> findFestivalEntities(int maxResults, int firstResult) {
        return findFestivalEntities(false, maxResults, firstResult);
    }

    private List<Festival> findFestivalEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Festival.class));
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

    public Festival findFestival(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Festival.class, id);
        } finally {
            em.close();
        }
    }

    public int getFestivalCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Festival> rt = cq.from(Festival.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
