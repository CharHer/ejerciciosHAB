
package ejemploifanidado;

import java.util.Scanner;


public class EjemploIfAnidado {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
            System.out.println("Ingrese el precio del articulo: ");
            
            double precio= teclado.nextDouble();
        
        if (precio < 50) {
        
            System.out.println("Es un producto economico");
        
        } 
        else {
            if (precio >= 50 && precio <=100) {
                
                System.out.println("Es un producto accesible");
            
            }
            else {
                if (precio>100 && precio <=200) {
                    
                    System.out.println("Es un producto estandar");
                    
                }
                else {
                
                System.out.println("Es un producto premium");
                
                }
                            
            }
        
        }        
    }
    
}
