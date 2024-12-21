
package tablademultiplicar;

import java.util.Scanner;


public class TablaDeMultiplicar {

    
    public static void main(String[] args) {
        
        System.out.println("Ingrese un numero entero: ");
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
                
        for (int i = 1; i <= 10; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
       
        }
        
        
    }
    
}
