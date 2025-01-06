
package persistencia;

import logica.Categoria;
import logica.Inscripcion;
import logica.Programador;
import logica.Torneo;


public class ControladoraPersistencia {
    
    TorneoJpaController torneoJpa = new TorneoJpaController();
    CategoriaJpaController categoriaJpa = new CategoriaJpaController();
    InscripcionJpaController inscripcionJpa = new InscripcionJpaController();
    ProgramadorJpaController programadorJpa = new ProgramadorJpaController();
    
    //crear
    public void crearCategoria(Categoria categoria) {

        categoriaJpa.create(categoria);

    }
    
    public void crearInscripcion(Inscripcion inscripcion) {

        inscripcionJpa.create(inscripcion);

    }
    
    public void crearProgramador(Programador programador) {

        programadorJpa.create(programador);

    }
    
    public void crearTorneo(Torneo torneo) {

        torneoJpa.create(torneo);

    }
    
    
    //llamar
    
    
    
    //actualizar
    
    
    
    //borrar
}
