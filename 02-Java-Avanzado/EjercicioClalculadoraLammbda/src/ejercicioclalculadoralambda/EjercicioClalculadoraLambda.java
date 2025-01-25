
package ejercicioclalculadoralambda;

import java.util.Scanner;
import logica.Operador;


public class EjercicioClalculadoraLambda {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculadora 'a+b'");
        System.out.println("Ingrese primer numero entero: ");
        int a = teclado.nextInt();
        System.out.println("Ingrese segundo numero entero: ");
        int b = teclado.nextInt();
        
        
        //Clase anonima
        Operador resultadoAnonimo = new Operador(){
            @Override
            public void operacion(int a, int b) {
                int resultado = a+b;
                System.out.println("El resultado desde Clase Anonima es: " + resultado + "\n");
            }
        
    };
        
      resultadoAnonimo.operacion(a, b);
        
        //Expresion lambda
        
        Operador resultadoLambda = (x,y) -> { 
            int resultado = x + y;
            System.out.println("El resultado desde Lambda es: " + resultado + "\n");};
        
        resultadoLambda.operacion(a, b);
        
        
    }
    
}
