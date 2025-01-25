package org.example;

import org.example.logica.Calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora calcu = new Calculadora();

        System.out.println("La suma es: " + calcu.sumar(1,2));

        System.out.println("La resta es: " + calcu.restar(5,4));

        System.out.println("La multiplicacion es: " + calcu.multiplicar(2,6));

        System.out.printf("La division es: " + calcu.dividir(12,4));

    }
}