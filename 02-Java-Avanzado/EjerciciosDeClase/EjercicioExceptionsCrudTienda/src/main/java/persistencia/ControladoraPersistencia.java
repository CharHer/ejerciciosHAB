
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Producto;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {

    ProductoJpaController productoJpa = new ProductoJpaController();
    public void  crearProducto(Producto producto){
        productoJpa.create(producto);
    }
      
    public void borrarProducto(int id) {

        try {
            productoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    public Producto traerProducto(int id) {
        return productoJpa.findProducto(id);
    }
    
    public List<Producto> traerProductos(){
        return productoJpa.findProductoEntities();
    }
    
    public void modificarProducto (Producto producto){
      try {
          productoJpa.edit(producto);
      } catch (Exception ex) {
          Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
      }
    } 


      
 

    
}
