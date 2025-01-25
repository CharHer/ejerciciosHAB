
package logica;

import java.util.ArrayList;
import java.util.List;
import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearEmpleado (String nombre, String apellido, String domicilio, String telefono) {
        Empleado emple = new Empleado(nombre, apellido, domicilio, telefono);
        this.mosrarEmpleado(emple);
    }
    
    public void mosrarEmpleado(Empleado emple){
        emple.toString();
    }
    
    public List<Empleado> traerEmpleados(){
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Juan", "Perez", "hola 123", "546832158"));
        listaEmpleados.add(new Empleado("Jose", "del Monte", "hola 1568", "4278578"));
        listaEmpleados.add(new Empleado("Delfina", "del Mar", "hola 444", "351845165"));
        return listaEmpleados;
        
    }
    
}
