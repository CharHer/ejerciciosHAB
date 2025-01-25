
package ejemplorefmetodoestatico;

import java.util.function.Function;


public class EjemploRefMetodoEstatico {

    
    public static void main(String[] args) {

        
        //referencia a metodos
        //String::valueOf;
        
        //Function<Integer, String> convertidor = (num) ->String.valueOf(num);

        Function<Integer, String> convertidor = String::valueOf;
        System.out.println("El valor de salida es " + convertidor.apply(35));
        
        
        //normal
        String resultado = String.valueOf(35);
        System.out.println("El valor de salida es: " + resultado);
        
    }
    
}
