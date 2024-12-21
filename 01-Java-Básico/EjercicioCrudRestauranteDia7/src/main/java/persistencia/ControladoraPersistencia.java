
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Platillo;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

  PlatilloJpaController platilloJpa = new PlatilloJpaController();
  
  //crear un platillo
  public void  crearPlatillo(Platillo platillo){

      platilloJpa.create(platillo);
      
  }
  
    //borrar un platillo
    public void borrarPlatillo(int id) {

        try {
            platilloJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    // busqueda
    public Platillo traerPlatillo(int id) {
        return platilloJpa.findPlatillo(id);
    }
    
    //lista completa
    public List<Platillo> traerPlatillos(){
        return platilloJpa.findPlatilloEntities();
    }
    
    //modificar un platillo
    public void modificarPlatillo (Platillo platillo){
      try {
          platilloJpa.edit(platillo);
      } catch (Exception ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    

}
