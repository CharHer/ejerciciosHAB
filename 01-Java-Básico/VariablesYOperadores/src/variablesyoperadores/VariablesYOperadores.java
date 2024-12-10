
package variablesyoperadores;

import java.util.Scanner;


public class VariablesYOperadores {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un valor para la base: ");
        double base = teclado.nextDouble();
        
        System.out.println("Ingresa un valor para la altura: ");
        double altura = teclado.nextDouble();
        
        double area = (base*altura)/2;
        
        System.out.println("El area de un triangulo de base " + base + " y altura " + altura + " es: " + area);
        
        
    }
    
}
