
package vectoresejercicio;

import java.util.Scanner;


public class VectoresEjercicio {

    public static void main(String[] args) {
        
        int numeros[] = new int[5];
        int contarSietes = 0;

            System.out.println ("Ingrese numeros enteros positivos para registrar: ");
            Scanner teclado = new Scanner(System.in);
            
            
            for(int i=0;i<numeros.length;i++){
                numeros[i]= teclado.nextInt();
                
                if (numeros[i] == 7) {
                contarSietes++;
            }
                
            }
        
        System.out.println("El número 7 se cargo " + contarSietes + " veces.");
            
    }
    
}
