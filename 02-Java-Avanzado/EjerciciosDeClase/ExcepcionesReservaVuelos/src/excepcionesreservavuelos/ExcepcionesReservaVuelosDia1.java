package excepcionesreservavuelos;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import logica.ReservaInvalidaException;
import logica.Usuario;

public class ExcepcionesReservaVuelosDia1 {

    public static void main(String[] args) {

        int asientosVuelo = 10;
        int asientosComprados = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de compra de boletos de avion");

        while (asientosVuelo > asientosComprados) {

            int asientosDisponibles = asientosVuelo - asientosComprados;

            System.out.println("\nActualmente disponemos de " + asientosDisponibles + " asientos disponibles\n");
            System.out.println("Complete el siguiente formulario para adquirir sus boletos: \n");

            //Validar nombre
            String nombre = null;

            while (nombre == null) {
                try {
                    System.out.print("Nombre: ");
                    String nombreIngresado = teclado.nextLine();
                    validarNombre(nombreIngresado);
                    nombre = nombreIngresado;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            //Validar destino
            String destino = null;

            while (destino == null) {
                try {
                    System.out.print("Destino: ");
                    String destinoIngresado = teclado.nextLine();
                    validarDestino(destinoIngresado);
                    destino = destinoIngresado;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            //Validar fecha
            LocalDate fecha = null;

            while (fecha == null) {
                System.out.print("Fecha de vuelo (yyyy-mm-dd): ");
                String fechaViaje = teclado.nextLine();
                try {
                    fecha = LocalDate.parse(fechaViaje);
                } catch (DateTimeParseException e) {
                    System.out.println("Formato inválido. Intentelo nuevamente.");
                }
            }

            //Validar boletos
            int asientosDeseados = 0;
            boolean boletosValidos = false;

            while (!boletosValidos) {
                try {
                    System.out.print("Número de boletos: ");
                    asientosDeseados = teclado.nextInt();
                    teclado.nextLine();
                    validarBoletos(asientosDeseados, asientosDisponibles);
                    boletosValidos = true;
                } catch (ReservaInvalidaException e) {
                    System.out.println(e.getMessage());
                }
            }

        }

    }

    // Validar nombre
    public static void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    public static void validarDestino(String destin) {
        if (destin == null || destin.trim().isEmpty()) {
            throw new IllegalArgumentException("El destino no puede estar vacio");
        }
    }

    // Validar número de boletos
    public static void validarBoletos(int boletos, int disponibles) throws ReservaInvalidaException {
        if (boletos <= 0) {
            throw new ReservaInvalidaException("El número de boletos debe ser mayor a 0.");
        }
        if (boletos > disponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
        }
    }

}
