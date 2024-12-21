
package com.hackaboss.ejerciciocrudrestaurantedia7;

import java.util.List;
import logica.Platillo;
import persistencia.ControladoraPersistencia;


public class EjercicioCrudRestauranteDia7 {

    public static void main(String[] args) {
        
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //crear
        controlPersis.crearPlatillo(new Platillo(1, "milanesa a la napolitana", 7));
        controlPersis.crearPlatillo(new Platillo(2, "tacos", 2));
        controlPersis.crearPlatillo(new Platillo(3, "pizza", 10));
        
        System.out.println("---Antes---");
        List<Platillo> listaPlatillos= controlPersis.traerPlatillos();
        for(Platillo plat:listaPlatillos){
            System.out.println(plat.toString());
        }        
        
        //borrar
        controlPersis.borrarPlatillo(2);
        
        controlPersis.modificarPlatillo(new Platillo(3, "pizza", 12));
        
        
        System.out.println("---Despues---");
        for(Platillo plat:listaPlatillos){
            System.out.println(plat.toString());
        }
                
        
        
    }
}
