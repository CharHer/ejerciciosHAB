
package logica;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class InventarioAutos {
    
    private List<Auto> inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    public <T extends Auto> void agregarAuto(T auto){
        inventario.add(auto);
        System.out.println(auto + " agregado exitosamente");
    }
    
    public <T extends Auto> List<Auto> buscarModelo (String modelo){
        return inventario.stream()
                .filter(auto->auto.getModelo().equalsIgnoreCase(modelo))
                .collect(Collectors.toList());
     
    }
    
    public <T extends Auto> List<Auto> buscarAnio (int anio){
        return inventario.stream()
                .filter(auto->auto.getAnio()==anio)
                .collect(Collectors.toList());
    }
    
    public <T extends Auto> void calcularValor(){
        double valorTotal = inventario.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
        
        System.out.println("El valor total del inventario es de: " + valorTotal);
    }
    
        
}
