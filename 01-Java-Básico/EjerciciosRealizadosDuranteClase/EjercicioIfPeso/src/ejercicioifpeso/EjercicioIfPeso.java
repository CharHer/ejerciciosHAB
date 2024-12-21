
 
package ejercicioifpeso;

import java.util.Scanner;


public class EjercicioIfPeso {


    public static void main(String[] args) {
              
        Scanner teclado = new Scanner(System.in);
            
            
        System.out.println("Por favor, ingrese su peso: ");
            double peso = teclado.nextDouble();
            
        if (peso <=100){
            System.out.println("Bienvenido, disfrute del juego!");
        } else {
            
            Double diferencia =peso-100;
            
            
            System.out.println("Una disculpa, usted esta "+ diferencia + " kg por encima del limite de seguridad");
        
        }
            

    }
    
}
