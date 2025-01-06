
package persistencia;

import logica.Carro;
import logica.Propietario;

public class ControladoraPersistencia {
    
    CarroJpaController carroJpa = new CarroJpaController();
    PropietarioJpaController propJpa = new PropietarioJpaController();
    
    //metodos CRUD
    
    //create
    
    public void crearCarro(Carro carro){
        carroJpa.create(carro);
    }
    
    public void crearPropietario(Propietario prop){
        propJpa.create(prop);
    }
    
    //read
    
    //update
    
    //delete
    
}
