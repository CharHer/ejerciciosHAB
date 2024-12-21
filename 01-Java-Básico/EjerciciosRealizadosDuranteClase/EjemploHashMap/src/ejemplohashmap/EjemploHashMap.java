
package ejemplohashmap;

import java.util.HashMap;
import java.util.Map;


public class EjemploHashMap {

    public static void main(String[] args) {
        
        //crear un HashMap
        Map<Integer, Double> estaturas = new HashMap<>();
        
        /*primitivo            Clase especial
        
        int                         Integer
        double                      Double
        boolean                     Boolean
        -                           String*/
        
        // Agregar valores
        estaturas.put(1, 1.79);
        estaturas.put(2, 1.67);
        estaturas.put(3, 1.58);
        estaturas.put(4, 1.95);
        
        //Busqueda para obtener un dato que se que esta
        double estatura = estaturas.get(3);
        
        //Busqueda por key o por valor
        boolean estaONo = estaturas.containsValue("1.54");
        
        System.out.println(estaturas);

            
    }
    
}
