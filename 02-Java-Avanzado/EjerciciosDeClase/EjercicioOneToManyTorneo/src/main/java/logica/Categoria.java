
package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categoria implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCategoria;
    
    @ManyToOne
    @JoinColumn(name="torneo_id")
    private Torneo torneo;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "categoria")
    private List<Inscripcion>listaInscripciones;

    public Categoria(Long id, String nombreCategoria, Torneo torneo, List<Inscripcion> listaInscripciones) {
        this.id = id;
        this.nombreCategoria = nombreCategoria;
        this.torneo = torneo;
        this.listaInscripciones = listaInscripciones;
    }

    public Categoria() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public List<Inscripcion> getListaInscripciones() {
        return listaInscripciones;
    }

    public void setListaInscripciones(List<Inscripcion> listaInscripciones) {
        this.listaInscripciones = listaInscripciones;
    }
    
    

    
    
    
    
    
}
