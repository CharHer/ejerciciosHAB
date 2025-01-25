
package ejercicioveterinariawrapper;

import java.util.ArrayList;
import java.util.Scanner;
import logica.Animal;


public class VeterinariaApp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        System.out.println("Bienvenido al sistema de registro\n");
        System.out.println("Por favor, llene el siguiente formulario: \n");

        Boolean continuar = true;

        while (continuar=true) {

            System.out.println("Animal: ");
            String nombre = teclado.nextLine();

            Double peso = null;
            while (peso == null) {

                System.out.println("Peso (en kg): ");
                String pesoString = teclado.nextLine();
                
                try {
                    peso = Double.parseDouble(pesoString);
                    if (peso <= 0) {
                        System.out.println("El peso debe ser mayor a 0");
                        peso = null;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El peso ingresado no es válido");
                }
                

            }

            Animal animal = new Animal(nombre, peso);
            listaAnimales.add(animal);

            System.out.println("Desea agregar otro registro? ('s' para continuar, 'n' para salir)");
            String respuesta = teclado.nextLine();

            if (respuesta.toLowerCase().equals("n")) {
                continuar = false;

            }

        }
        
        System.out.println("\nAnimales registrados:");
        listaAnimales.forEach(Animal::mostrarInfo);
        
        System.out.println("Gracias por usar el sistema de registro");
        teclado.close();
    }

}
