
package logica;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pelicula implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String director;
    private int duracion;
    
    @ManyToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "horario_id")
    private Horario Horario;

    public Pelicula() {
    }

    public Pelicula(Long id, String titulo, String director, int duracion, Horario Horario) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.Horario = Horario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Horario getUnHorario() {
        return Horario;
    }

    public void setUnHorario(Horario unHorario) {
        this.Horario = unHorario;
    }
    
    
   
    
}
