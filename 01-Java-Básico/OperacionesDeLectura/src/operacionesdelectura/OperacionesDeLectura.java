
package operacionesdelectura;

import java.util.Scanner;


public class OperacionesDeLectura {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un primer numero entero: ");
        int num1 = teclado.nextInt();
        
        
        System.out.println("Ingrese un segundo numero entero: ");
        int num2 = teclado.nextInt();
                
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("La suma de " + num1 + " mas " + num2 + " es: " + suma);
        System.out.println("La resta de " + num1 + " menos " + num2 + " es: " + resta);
        System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es: " + multiplicacion);
        System.out.println("La division de " + num1 + " entre " + num2 + " es: " + division);
        
        System.out.println("Gracias por participar!");
                
    }
    
}
