
package ejemploprogrfuncional;

import java.util.ArrayList;
import java.util.List;


public class EjemploProgrFuncional {

    public static void main(String[] args) {
        
        List<Integer> listaNumeros= new ArrayList<>();
        listaNumeros.add(35);
        listaNumeros.add(26);
        listaNumeros.add(64);
        
        //a la antigua
        System.out.println("----clasico----");
        duplicarNumeros(listaNumeros);
        
        //simplificado con lambdas
        System.out.println("----lambdas----");
        listaNumeros.forEach(numero->System.out.println(numero*2));
        
    }
    
    public static void duplicarNumeros (List<Integer>listaNumeros){
        for (int numero:listaNumeros){
            System.out.println(numero*2);
        }
    }
    
}
