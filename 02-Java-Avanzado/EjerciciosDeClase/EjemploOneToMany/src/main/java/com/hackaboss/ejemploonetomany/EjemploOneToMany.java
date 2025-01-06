
package com.hackaboss.ejemploonetomany;

import java.util.ArrayList;
import java.util.List;
import logica.Carrito;
import logica.Item;
import persistencia.ControladoraPersistencia;

public class EjemploOneToMany {

    public static void main(String[] args) {
        
        //1. crear productos
        //2. crear carrito
        //3. agregar el producto
        
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        
        //Se crea la lista
        List<Item>listaItems=new ArrayList<>();
        
        Carrito carrito = new Carrito(456L, "Carrito 1", listaItems);
        carrito.agregar(new Item(1L, "Arroz", carrito));
        carrito.agregar(new Item(2L, "Fideo", carrito));
        
        controlPersis.crearCarrito(carrito);
        
    }
}
