
package acumularnumeros;

import java.util.Scanner;


public class AcumularNumeros {

    
    public static void main(String[] args) {
        
        System.out.print("Ingrese un numero entero: ");
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int suma = 0;
                
        while (num>0) {
            
            System.out.print("Ingresa un numero: ");
            num=teclado.nextInt();
            
            suma = suma + num;
            
        }
        
        
        System.out.print("La suma total de los numeros  es: " + suma);
        
    }
    
}
