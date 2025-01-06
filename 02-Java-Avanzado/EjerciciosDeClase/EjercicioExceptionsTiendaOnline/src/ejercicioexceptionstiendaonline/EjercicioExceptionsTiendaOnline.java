package ejercicioexceptionstiendaonline;

import java.util.Scanner;
import logica.MontoInvalidoException;

public class EjercicioExceptionsTiendaOnline {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Solicitud de datos
        String numeroTarjeta = null;
        boolean numValido = false;

        while (numValido != true) {

            try {
                System.out.println("Ingrese el numero de tarjeta (16 digitos): ");
                numeroTarjeta = teclado.nextLine();
                //validar si el numero de tarjeta es correcto
                validarTarjeta(numeroTarjeta);
                numValido = true; // se cambia la bandera si no encuentra la exception
            } catch (NumberFormatException e) {
                System.out.println("El numero de tarjeta es invalido");
            }

        }

        //solicitud y validacion de monto
        double montoCompra = 0;
        boolean montoValido = false;

        while (montoValido != true) {

            try {
                System.out.println("Ingrese el monto de la compra: ");
                montoCompra = Double.parseDouble(teclado.nextLine());// convierte el String a doble
                //validar si el monto es correcto
                validarMonto(montoCompra);
                montoValido = true; // se cambia la bandera si no encuentra la exception
            } catch (MontoInvalidoException e) {
                System.out.println(e.getMessage()); //de esa excepcion, trae el mensaje
            }

        }
        //solicitu de nombre
        String nombre = null;
        boolean nombreValido = false;

        while (nombreValido != true) {

            try {
                System.out.println("Ingrese el nombre del cliente: ");
                nombre = teclado.nextLine();
                //validar si el monto es correcto
                validarNombre(nombre);
                nombreValido = true; // se cambia la bandera si no encuentra la exception
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); //de esa excepcion, trae el mensaje
            }
        }

    }

    //METODOS
    // excepcion propia de java
    private static void validarTarjeta(String numeroTarjeta) { //sean num 0-9 y tiene que haber exactos 16
        if (numeroTarjeta.length() != 16 || !numeroTarjeta.matches("\\d{16}")) {
            throw new NumberFormatException();
        }
    }

    private static void validarMonto(double montoCompra) throws MontoInvalidoException { //lleva throws porque es una excepcion personalizada y hay que darle la indicacion
        if (montoCompra <= 0) {
            throw new MontoInvalidoException("El monto ingresado es invalido, debe ser mayor a cero");
        }
    }

    private static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) { //si el nombre es nulo o si el nombre sacando los espacios esta vacio
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        
    }    
}
        
