
package ejerciciogenericsconcesionariadia4;

import java.util.List;
import logica.Auto;
import logica.InventarioAutos;

public class EjercicioGenericsConcesionariaDia4 {

    public static void main(String[] args) {

        InventarioAutos inventario = new InventarioAutos();

        Auto auto1 = new Auto("Toyota", "Corola", 2015, 150000);
        Auto auto2 = new Auto("Honda", "Civic", 2016, 160000);
        Auto auto3 = new Auto("Mazda", "3", 2018, 140000);
        
        inventario.agregarAuto(auto1);
        inventario.agregarAuto(auto2);
        inventario.agregarAuto(auto3);
        
        System.out.println("----------------------");

        List<Auto> busquedaAnio = inventario.buscarAnio(2016);
        busquedaAnio.forEach(System.out::println);
        
        System.out.println("----------------------");
        
        List<Auto> busquedaModelo = inventario.buscarModelo("3");
        busquedaModelo.forEach(System.out::println);
        
        System.out.println("----------------------");
        
        inventario.calcularValor();
        

    }

}
