
package ejemploencapsulamiento;

import logica.Mascota;

public class EjemploEncapsulamiento {

    public static void main(String[] args) {
        
        //LOS ATIBUTOS SON POR DEFECTO PRIVADOS
        //LOS METODOS SON POR DEFECTO PUBLICOS
        Mascota masco = new Mascota();
        
        masco.setNombre("Ibra");
        masco.getNombre();
        
        
        
        
        
    }
    
}
