
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Inscripcion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Categoria;
import persistencia.exceptions.NonexistentEntityException;


public class CategoriaJpaController implements Serializable {
    
    public CategoriaJpaController() {
        emf = Persistence.createEntityManagerFactory("TorneoPU");
    }

    public CategoriaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Categoria categoria) {
        if (categoria.getListaInscripciones() == null) {
            categoria.setListaInscripciones(new ArrayList<Inscripcion>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Inscripcion> attachedListaInscripciones = new ArrayList<Inscripcion>();
            for (Inscripcion listaInscripcionesInscripcionToAttach : categoria.getListaInscripciones()) {
                listaInscripcionesInscripcionToAttach = em.getReference(listaInscripcionesInscripcionToAttach.getClass(), listaInscripcionesInscripcionToAttach.getNumInscripcion());
                attachedListaInscripciones.add(listaInscripcionesInscripcionToAttach);
            }
            categoria.setListaInscripciones(attachedListaInscripciones);
            em.persist(categoria);
            for (Inscripcion listaInscripcionesInscripcion : categoria.getListaInscripciones()) {
                Categoria oldCategoriaOfListaInscripcionesInscripcion = listaInscripcionesInscripcion.getCategoria();
                listaInscripcionesInscripcion.setCategoria(categoria);
                listaInscripcionesInscripcion = em.merge(listaInscripcionesInscripcion);
                if (oldCategoriaOfListaInscripcionesInscripcion != null) {
                    oldCategoriaOfListaInscripcionesInscripcion.getListaInscripciones().remove(listaInscripcionesInscripcion);
                    oldCategoriaOfListaInscripcionesInscripcion = em.merge(oldCategoriaOfListaInscripcionesInscripcion);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Categoria categoria) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Categoria persistentCategoria = em.find(Categoria.class, categoria.getId());
            List<Inscripcion> listaInscripcionesOld = persistentCategoria.getListaInscripciones();
            List<Inscripcion> listaInscripcionesNew = categoria.getListaInscripciones();
            List<Inscripcion> attachedListaInscripcionesNew = new ArrayList<Inscripcion>();
            for (Inscripcion listaInscripcionesNewInscripcionToAttach : listaInscripcionesNew) {
                listaInscripcionesNewInscripcionToAttach = em.getReference(listaInscripcionesNewInscripcionToAttach.getClass(), listaInscripcionesNewInscripcionToAttach.getNumInscripcion());
                attachedListaInscripcionesNew.add(listaInscripcionesNewInscripcionToAttach);
            }
            listaInscripcionesNew = attachedListaInscripcionesNew;
            categoria.setListaInscripciones(listaInscripcionesNew);
            categoria = em.merge(categoria);
            for (Inscripcion listaInscripcionesOldInscripcion : listaInscripcionesOld) {
                if (!listaInscripcionesNew.contains(listaInscripcionesOldInscripcion)) {
                    listaInscripcionesOldInscripcion.setCategoria(null);
                    listaInscripcionesOldInscripcion = em.merge(listaInscripcionesOldInscripcion);
                }
            }
            for (Inscripcion listaInscripcionesNewInscripcion : listaInscripcionesNew) {
                if (!listaInscripcionesOld.contains(listaInscripcionesNewInscripcion)) {
                    Categoria oldCategoriaOfListaInscripcionesNewInscripcion = listaInscripcionesNewInscripcion.getCategoria();
                    listaInscripcionesNewInscripcion.setCategoria(categoria);
                    listaInscripcionesNewInscripcion = em.merge(listaInscripcionesNewInscripcion);
                    if (oldCategoriaOfListaInscripcionesNewInscripcion != null && !oldCategoriaOfListaInscripcionesNewInscripcion.equals(categoria)) {
                        oldCategoriaOfListaInscripcionesNewInscripcion.getListaInscripciones().remove(listaInscripcionesNewInscripcion);
                        oldCategoriaOfListaInscripcionesNewInscripcion = em.merge(oldCategoriaOfListaInscripcionesNewInscripcion);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = categoria.getId();
                if (findCategoria(id) == null) {
                    throw new NonexistentEntityException("The categoria with id " + id + " no longer exists.");
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
            Categoria categoria;
            try {
                categoria = em.getReference(Categoria.class, id);
                categoria.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The categoria with id " + id + " no longer exists.", enfe);
            }
            List<Inscripcion> listaInscripciones = categoria.getListaInscripciones();
            for (Inscripcion listaInscripcionesInscripcion : listaInscripciones) {
                listaInscripcionesInscripcion.setCategoria(null);
                listaInscripcionesInscripcion = em.merge(listaInscripcionesInscripcion);
            }
            em.remove(categoria);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Categoria> findCategoriaEntities() {
        return findCategoriaEntities(true, -1, -1);
    }

    public List<Categoria> findCategoriaEntities(int maxResults, int firstResult) {
        return findCategoriaEntities(false, maxResults, firstResult);
    }

    private List<Categoria> findCategoriaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Categoria.class));
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

    public Categoria findCategoria(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Categoria.class, id);
        } finally {
            em.close();
        }
    }

    public int getCategoriaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Categoria> rt = cq.from(Categoria.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
