package org.example;

import org.example.logica.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {

    Calculadora calcu = new Calculadora();

    @Test
    public void testearSuma(){


        //caso de prueba 1 - sumar dos numeros poitivos
        assertEquals(5,calcu.sumar(2,3));

        //caso de prueba 2 - sumar dos numeros negativos
        assertEquals(-7,calcu.sumar(-5,-2));

        //caso de prueba 3 - sumar un negativo y un positivo
        assertEquals(-3,calcu.sumar(-5,2));

        //caso de prueba 4 - sumar un positivo y un negativo
        assertEquals(3,calcu.sumar(5,-2));
    }

    @Test
    public void testearResta(){


        //caso de prueba 1 - restar dos numeros poitivos
        assertEquals(1,calcu.restar(5,4));

        //caso de prueba 2 - restar dos numeros negativos
        assertEquals(6,calcu.restar(-4,-10));

        //caso de prueba 3 - restar un negativo y un positivo
        assertEquals(-5,calcu.restar(-2,3));

        //caso de prueba 4 - restar un negativo y un positivo
        assertEquals(5,calcu.restar(2,-3));
    }

    @Test
    public void testearMultiplicacion(){

        //caso de prueba 1 - multiplicar dos numeros poitivos
        assertEquals(20,calcu.multiplicar(5,4));

        //caso de prueba 2 - multiplicar dos numeros negativos
        assertEquals(6,calcu.multiplicar(-2,-3));

        //caso de prueba 3 - multiplicar un negativo y un positivo
        assertEquals(-16,calcu.multiplicar(-4,4));

        //caso de prueba 4 - multiplicar un positivo y un negativo
        assertEquals(-12,calcu.multiplicar(3,-4));

        //caso de prueba 5 - multiplicar un positivo y 0
        assertEquals(0,calcu.multiplicar(3,0));

        //caso de prueba 6 - multiplicar un negativo y 0
        assertEquals(0,calcu.multiplicar(-3,0)); //esto no me lo esperaba

        //caso de prueba 7 - multiplicar un 0 y 0
        assertEquals(0,calcu.multiplicar(0,0));


    }

    @Test
    public void testearDivision(){

        //caso de prueba 1 - dividir dos numeros poitivos
        assertEquals(5,calcu.dividir(10,2));

        //caso de prueba 2 - dividir dos numeros negativos
        assertEquals(2,calcu.dividir(-6,-3));

        //caso de prueba 3 - dividir un negativo y un positivo
        assertEquals(-4,calcu.dividir(-16,4));

        //caso de prueba 4 - dividir un positivo y un negativo
        assertEquals(-2,calcu.dividir(10,-5));

        //caso de prueba 5 - dividir un positivo y 0
        assertThrows(ArithmeticException.class, () -> calcu.dividir(5,0));

        //caso de prueba 6 - dividir un negativo y 0
        assertEquals(0,calcu.dividir(-3,0));
        //caso de prueba 7 - dividir un 0 y 0
        assertEquals(0,calcu.dividir(0,0));

    }


}
