package ejercicioexceptionsinventariodia1;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Producto;

public class EjercicioExceptionsInventarioDia1 {

    public static void main(String[] args) {

        ArrayList<Producto> listaProducto = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("\nBienvenido al sistema de inventario\n");

        System.out.println("Para agregar un nuevo producto, llene el siguiente formulario:\n");

        // Validar nombre
        String nombre = null;
        boolean nombreValido = false;
        
        while (nombreValido != true) {
            try {
                System.out.print("Nombre del producto: ");
                nombre = teclado.nextLine();
                validarNombre(nombre);
                nombreValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Validar precio
        double precio = 0;
        boolean precioValido = false;
        
        while (precioValido != true) {
            try {
                System.out.print("Precio del producto: ");
                String precioIngresado = teclado.nextLine(); //Se ingresa como String para calidar que no esta vacia
                 if (precioIngresado.trim().isEmpty()) {
                    throw new IllegalArgumentException("El campo de 'precio' no puede estar vacio");
                }
                precio=Double.parseDouble(precioIngresado);// se transforma el string a double para validar que sea un numero valido
                validarPrecio(precio);
                precioValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Validar cantidad
        int cantidad = 0;
        boolean cantidadValida = false;
        
        while (!cantidadValida) {
            try {
                System.out.print("Indique la cantidad ingresada de producto: ");
                String cantidadIngresada = teclado.nextLine();
                if (cantidadIngresada.trim().isEmpty()){
                    throw new IllegalArgumentException("El campo de 'cantidad' no puede estar vacio");
                }
                cantidad=Integer.parseInt(cantidadIngresada);// se transforma el string a int para validar que sea un numero valido
                validarCantidad(cantidad);
                cantidadValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Crear el producto
        Producto nuevoProducto = new Producto(nombre, precio, cantidad);
        listaProducto.add(nuevoProducto);
        System.out.println("\nSe agregó " + nuevoProducto);
        
        

    }

    private static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Por favor, ingrese un nombre en este campo");
        }
    }

    private static void validarPrecio(double precio) {
        if (precio <= 0 ) {
            throw new IllegalArgumentException("Por favor, ingrese un precio válido (mayor a 0)");
        }
    }

    private static void validarCantidad(int cantidadIngresada) {
        if (cantidadIngresada <= 0) {
            throw new IllegalArgumentException("Por favor, ingrese una cantidad válida (mayor a 0)");
        }
    }
}
