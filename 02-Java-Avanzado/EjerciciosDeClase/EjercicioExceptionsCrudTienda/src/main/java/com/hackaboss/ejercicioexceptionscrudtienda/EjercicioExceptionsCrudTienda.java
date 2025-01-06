package com.hackaboss.ejercicioexceptionscrudtienda;


import java.util.Scanner;
import logica.Producto;
import persistencia.ControladoraPersistencia;

public class EjercicioExceptionsCrudTienda {

    public static void main(String[] args) {

        ControladoraPersistencia controlPersis = new ControladoraPersistencia();

        int opcion;
        boolean salir = false;

        System.out.println("Bienvenido al sistema\n");
        Scanner teclado = new Scanner(System.in);

        while (!salir) {

            mostrarMenu();
            System.out.println("Indique la operacion que desea realizar");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1: //Crear
                    
                    System.out.println("Ingrese la informacion del nuevo porducto");
                    Producto producto = new Producto();

                    System.out.print("Nombre del producto: ");
                    String nombre = teclado.nextLine().trim();
                    producto.setNombreProducto(nombre);
                    teclado.nextLine();

                    System.out.print("Precio del producto: ");
                    double precio = teclado.nextDouble();
                    producto.setPrecioProducto(precio);
                    teclado.nextLine();

                    System.out.print("Stock: ");
                    int stock = teclado.nextInt();
                    producto.setStock(stock);
                    teclado.nextLine();

                    break;

                case 2: // Listar

                    break;

                case 3: //actualizar
                    ;

                    break;

                case 4: //eliminar

                    break;

                case 5: //salir

                    break;

            }

        }
        

    }

    public static void mostrarMenu() {
        System.out.println("1. Crear producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
    }

}
