package org.example;

import org.example.logica.ConvertidorNumRomanos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertidorNumRomanosTest {

    @Test
    void testConvertirDecimalARomano() {
        ConvertidorNumRomanos convertidor = new ConvertidorNumRomanos();

        assertAll("Pruebas de conversion decimal a romano",
                () -> assertEquals("I", convertidor.convertirARomanos(1)),
                () -> assertEquals("II", convertidor.convertirARomanos(2)),
                () -> assertEquals("III", convertidor.convertirARomanos(3)),
                () -> assertEquals("IV", convertidor.convertirARomanos(4)),
                () -> assertEquals("V", convertidor.convertirARomanos(5)),
                () -> assertEquals("VI", convertidor.convertirARomanos(6)),
                () -> assertEquals("VII", convertidor.convertirARomanos(7)),
                () -> assertEquals("VIII", convertidor.convertirARomanos(8)),
                () -> assertEquals("IX", convertidor.convertirARomanos(9)),
                () -> assertEquals("X", convertidor.convertirARomanos(10))
        );

    }

    @Test
    void testNumeroFueraDeRango(){
        ConvertidorNumRomanos convertidor = new ConvertidorNumRomanos();

        assertThrows(IllegalArgumentException.class, () -> convertidor.convertirARomanos(0));
        assertThrows(IllegalArgumentException.class, () -> convertidor.convertirARomanos(11));
    }


}
