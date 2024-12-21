
package ejemploclase;

import java.time.LocalDate;
import logica.Persona;


public class EjemploClase {


    public static void main(String[] args) {
        
        Persona person = new Persona();
        Persona person2 = new Persona(1, "Carlos", "Herrera",
                LocalDate.of(2024,12,11), "hola 123");
        
       
        
    }
    
}
