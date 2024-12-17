
package estructurascondicionalesdia2;

import java.util.Scanner;


public class EstructurasCondicionalesDia2 {

    
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
                
        System.out.println("Por favor, indique su edad: ");
        
        int edad=teclado.nextInt();
        
        if (edad>=18){
        
            System.out.println("Bienvenido, puede pasar a tomar su lugar");
            
        } else {
            System.out.println("Disculpe la molestia, no cumple con el minimo de edad para ingresar");
        }
        
        
    }
    
}
