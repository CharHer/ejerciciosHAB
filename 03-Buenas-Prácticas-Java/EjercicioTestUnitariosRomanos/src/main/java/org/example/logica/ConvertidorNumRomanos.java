package org.example.logica;

public class ConvertidorNumRomanos {

    public static String convertirARomanos(int num){
        if (num <= 0 || num > 10) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 10");
        }

        //Se guradan los numeros romanos en un array
        String numRomanos[] = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        //devuelvo la posicion del numero indicado -1
        return numRomanos[num-1];

    }

}
