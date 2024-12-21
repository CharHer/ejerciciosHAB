package ejerciciocollectionselectronicos;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Producto;

public class EjercicioCollectionsElectronicos {

    public static void main(String[] args) {
        
        ArrayList<Producto> listaElectronico = new ArrayList<Producto>();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los productos (escriba FIN para terminar):\n");
        String nombre = "";
        
        
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Ingrese el nombre del producto: ");
            nombre = teclado.nextLine();
            
            
            if (nombre.equalsIgnoreCase("FIN")) {
                break; 
            }
            
            Producto electro = new Producto();
            electro.setNombre(nombre);
            
            System.out.println("Ingrese la marca del producto: ");
            String marca = teclado.nextLine();
            electro.setMarca(marca);
            
            System.out.println("Ingrese el costo del producto: ");
            double costo = 0.0;
            
            // Validación del costo
            while (true) {
                try {
                    costo = Double.parseDouble(teclado.nextLine());
                    break; // Salir del bucle si el costo es válido
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, ingrese un número válido para el costo.");
                }
            }
            
            electro.setPrecio(costo);
            listaElectronico.add(electro);
        }
    
        System.out.println("Ingrese el nombre del producto que desea buscar:");
        String nombreBusqueda = teclado.nextLine();
        
        boolean encontrado = false;
        for (Producto p : listaElectronico) {
            if (p.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("Producto encontrado: " + p.getNombre() + ", Marca: " + p.getMarca() + ", Precio: " + p.getPrecio());
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("El producto no está en la lista.");
        }
    }
}