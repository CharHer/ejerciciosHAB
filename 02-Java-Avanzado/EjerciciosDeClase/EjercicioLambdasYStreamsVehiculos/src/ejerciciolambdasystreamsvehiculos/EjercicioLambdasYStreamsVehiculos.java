
package ejerciciolambdasystreamsvehiculos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import logica.Vehiculo;



public class EjercicioLambdasYStreamsVehiculos {

    
    public static void main(String[] args) {
        
        
        //Crea una clase con el método main para representar un escenario donde se crea una lista de vehículos según la siguiente tabla:
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Vehiculo("Ford", "Fiesta", 1000));
        vehiculos.add(new Vehiculo("Ford", "Focus", 1200));
        vehiculos.add(new Vehiculo("Ford", "Explorer", 2500));
        vehiculos.add(new Vehiculo("Fiat", "Uno", 500));
        vehiculos.add(new Vehiculo("Fiat", "Cronos", 1000));
        vehiculos.add(new Vehiculo("Fiat", "Torino", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Aveo", 1250));
        vehiculos.add(new Vehiculo("Chevrolet", "Spin", 2500));
        vehiculos.add(new Vehiculo("Toyota", "Corolla", 1200));
        vehiculos.add(new Vehiculo("Toyota", "Fortuner", 3000));
        vehiculos.add(new Vehiculo("Renault", "Logan", 950));
        
        //Haciendo uso del método sort en la lista de Vehículos con expresiones lambda, obtén una lista de vehículos ordenados por precio de menor a mayor, 
        //imprime por pantalla el resultado.
        List<Vehiculo> ordenadosMenorAMayor = vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        
        System.out.println("Vehiculos ordenados de menor a mayor costo: \n");
        ordenadosMenorAMayor.forEach(System.out::println);
        System.out.println("-----------------------------");
        
        List<Vehiculo> ordenadosMayorAMenor = vehiculos.stream()
                .sorted(Comparator.comparingDouble(Vehiculo::getCosto).reversed())
                .collect(Collectors.toList());
        
        System.out.println("Vehiculos ordenados de mayor a menor costo: \n");
        ordenadosMayorAMenor.forEach(System.out::println);
        System.out.println("-----------------------------");

        //De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
        List<Vehiculo> ordenadosMarcaPrecio = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca)
                .thenComparingDouble(Vehiculo::getCosto))
                .collect(Collectors.toList());
        
        System.out.println("Vehiculos ordenados por marca y precio: \n");
        ordenadosMarcaPrecio.forEach(System.out::println);
        System.out.println("-----------------------------");

        //Se desea extraer una lista de vehículos con precio no mayor a 1000, luego otra con precios mayor o igual 1000 y por último, 
        //obtén el promedio total de precios de toda la lista de vehículos.
        List<Vehiculo> precioMenor1000 = vehiculos.stream()
                .filter(vehi->vehi.getCosto()<=1000)
                .collect(Collectors.toList());
        
        System.out.println("Vehiculos con precio menor a 1000: \n");
        precioMenor1000.forEach(System.out::println);
        System.out.println("-----------------------------");
        
        List<Vehiculo> precioMayor1000 = vehiculos.stream()
                .filter(vehi->vehi.getCosto()>1000)
                .collect(Collectors.toList());
        
        System.out.println("Vehiculos con precio mayor a 1000: \n");
        precioMayor1000.forEach(System.out::println);
        System.out.println("-----------------------------");
        
        double promedioCostos = vehiculos.stream()
                .mapToDouble(Vehiculo::getCosto)
                .average()
                .orElse(0);
        
        System.out.println("El promedio de costos es: " + promedioCostos + "\n");
        System.out.println("-----------------------------");
        

        //Haz un filtro que muestre únicamente los autos de Marca Chevrolet y Fiat.
        List<Vehiculo> filtroChevroletFiat = vehiculos.stream()
                .filter(vehi->vehi.getMarca().equals("Chevrolet") || vehi.getMarca().equals("Fiat"))
                .collect(Collectors.toList());

        System.out.println("Vehículos de las marcas Chevrolet y Fiat: \n");
        filtroChevroletFiat.forEach(System.out::println);
        System.out.println("-----------------------------");

        //Muestra todos los autos cuyo modelo contenga al menos una letra c.
        List<Vehiculo> filtroC = vehiculos.stream()
                .filter(vehi->vehi.getModelo().toLowerCase().contains("c"))
                .collect(Collectors.toList());
        
        System.out.println("Marcas que contienen al menos una letra 'c': \n");
        filtroC.forEach(System.out::println);
        
    }
    
}
