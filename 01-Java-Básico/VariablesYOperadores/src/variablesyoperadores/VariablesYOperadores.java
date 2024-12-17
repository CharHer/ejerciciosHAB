
package variablesyoperadores;

import java.util.Scanner;


public class VariablesYOperadores {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresa un valor para la base: ");
        float base = teclado.nextFloat();
        
        System.out.println("Ingresa un valor para la altura: ");
        float altura = teclado.nextFloat();
        
        float area = (base*altura)/2;
        
        System.out.println("El area de un triangulo de base " + base + " y altura " + altura + " es: " + area);
        
        
    }
    
}
