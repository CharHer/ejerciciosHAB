
package ejerciciovectoresyexcepcionesdia1;

import java.util.Scanner;

public class EjercicioVectoresyExcepcionesDia1 {

    public static void main(String[] args) {

        String videojuego[] = new String[5];
        Scanner teclado = new Scanner(System.in);

        int puesto = 5;

        System.out.println("Ingrese su top 5 titulos preferidos de videojuegos: ");

        for (int i = 0; i < videojuego.length; i++) {

            boolean juegoValido = false;

            while (!juegoValido) {
                try {
                    System.out.println("Indique el juego del puesto " + puesto + ": ");
                    String juegoIngresado = teclado.nextLine();
                    validarJuego(juegoIngresado);
                    videojuego[i] = juegoIngresado;// Guardar en el vector si es valido
                    juegoValido = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

            }

            System.out.println("Puesto " + puesto + " agregado\n");
            puesto--;

        }

        System.out.println("\n -----Lista guardada-----\n");

        boolean numeroValido = false;
        int numero = 0;

        while (!numeroValido) {
            try {
                System.out.println("Indique el puesto que desea ver:");
                String puestoIngresado = teclado.nextLine();

                if (puestoIngresado.trim().isEmpty()) {
                    throw new IllegalArgumentException("No puede dejar vacio el campo");
                }

                numero = Integer.parseInt(puestoIngresado); // se transforma de String a int
                validarNumero(numero);
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("Debes ingresar un numero valido");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("El videojuego en el puesto " + numero + " es: " + videojuego[5 - numero]);
        teclado.close();

    }

    private static void validarJuego(String juegoIngresado) {
        if (juegoIngresado == null || juegoIngresado.trim().isEmpty()) {
            throw new IllegalArgumentException("No puede dejar el campo vacio");
        }
    }

    private static void validarNumero(int puestoIngresado) {
        if (puestoIngresado <= 0 || puestoIngresado > 5) {
            throw new IllegalArgumentException("El numero ingresado debe estar entre 5 y 1");
        }
    }

}
