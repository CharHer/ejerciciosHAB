
package logica;

import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearInsumo (String codigo_insumo, String nombre, String cantidad, String fechaCaducidad) {
    
        Insumo insum = new Insumo (codigo_insumo,nombre,cantidad,fechaCaducidad); 
        this.mostrarInsumo(insum);
    }
    
    public void mostrarInsumo(Insumo insum) {
        insum.toString();
    }
    
}
