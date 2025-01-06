
package persistencia;

import logica.Festival;
import logica.Horario;
import logica.Pelicula;
import logica.Sala;


public class ControladoraPersisitencia {
    
    FestivalJpaController festivalJpa = new FestivalJpaController();
    HorarioJpaController horarioJpa = new HorarioJpaController();
    PeliculaJpaController peliculaJpa = new PeliculaJpaController();
    SalaJpaController salaJpa = new SalaJpaController();
    
    public void crearFestival (Festival festival){
        festivalJpa.create(festival);
    }
    
    public void crearSala (Sala sala) {
        salaJpa.create(sala);
    }
    
    public void crearPelicula (Pelicula pelicula){
        peliculaJpa.create(pelicula);
    }
    
    public void crearHorario (Horario horario){
        horarioJpa.create(horario);
    } 
    
    
}
