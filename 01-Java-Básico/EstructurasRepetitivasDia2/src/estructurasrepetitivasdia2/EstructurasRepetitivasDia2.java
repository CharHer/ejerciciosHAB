
package estructurasrepetitivasdia2;

import java.util.Scanner;


public class EstructurasRepetitivasDia2 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
         int cont=1;
         double total=0;
                  
         System.out.println("Precio del articulo "+cont+": ");
         double precio = teclado.nextDouble();
         
         while (precio>0){ 
             
            total=total+precio;
            cont++;
            System.out.println(" Precio del articulo "+cont);     
            precio=teclado.nextDouble();
               
    }
         System.out.println("Total: $" + total);
    }

        
}
    

