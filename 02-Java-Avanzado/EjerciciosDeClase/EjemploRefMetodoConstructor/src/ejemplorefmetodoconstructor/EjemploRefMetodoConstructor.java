
package ejemplorefmetodoconstructor;

import java.util.function.BiFunction;
import logica.Persona;


public class EjemploRefMetodoConstructor {

    
    public static void main(String[] args) {
        
        //referencia al costructor de Persona
        BiFunction<String, Integer, Persona>constructor = Persona::new;
        
        Persona pers = constructor.apply("Luisina", 33);
        System.out.println(pers);
        
        //forma normal
        Persona pers1= new Persona("Luisina", 33);
        System.out.println(pers1);
        
    }
    
}
