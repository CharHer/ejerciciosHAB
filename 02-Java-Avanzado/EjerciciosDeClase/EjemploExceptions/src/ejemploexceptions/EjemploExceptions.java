
package ejemploexceptions;

import java.util.Scanner;
import logica.ExcepcionDatoIncorrecto;

public class EjemploExceptions {

    public static void main(String[] args) throws ExcepcionDatoIncorrecto {
        
        int dato = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entre 1 y 10");
        dato=teclado.nextInt();
        
        if (dato <=0 || dato >=11){
            throw new ExcepcionDatoIncorrecto("Ingreso dato incorrecto");
        }
        
    }
    
}
