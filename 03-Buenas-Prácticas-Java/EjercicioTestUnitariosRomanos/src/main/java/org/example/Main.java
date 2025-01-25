package org.example;

import java.util.Scanner;

import static org.example.logica.ConvertidorNumRomanos.convertirARomanos;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero entero entre 1 y 10: ");

        boolean proceso=true;
        while (proceso==true) {

            int numero = teclado.nextInt();
            String numeroRomano = convertirARomanos(numero);
            System.out.println("El numero " + numero + " en numeros romanos es: " + numeroRomano);

            proceso=false;

        }

        teclado.close();

    }
}