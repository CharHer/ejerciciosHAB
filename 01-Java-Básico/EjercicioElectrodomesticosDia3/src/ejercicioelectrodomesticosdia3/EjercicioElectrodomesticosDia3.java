
package ejercicioelectrodomesticosdia3;

import logica.Electrodomestico;


public class EjercicioElectrodomesticosDia3 {

    public static void main(String[] args) {
        
        //int cod; String marca;String modelo; double consumo;String color
        
        //a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        
        Electrodomestico electrodom1 = new Electrodomestico(123, "Koblenz", "Licuadora", 100, "rojo");
        Electrodomestico electrodom2 = new Electrodomestico(456, "Ninja", "Extractor", 75, "negro");
        Electrodomestico electrodom3 = new Electrodomestico(789, "LG", "Refrigerador", 200, "plateado");
        
        //b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        
        Electrodomestico electrodom4 = new Electrodomestico();
        
        //c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        
        System.out.println("Electromomestico 1:");
        System.out.println("Marca: "+ electrodom1.getMarca() + ", " + "modelo:" + electrodom1.getModelo() + " y consumo (kW/h): " + electrodom1.getConsumo());
        
        System.out.println("Electromomestico 2:");
        System.out.println("Marca: "+ electrodom2.getMarca() + ", " + "modelo:" + electrodom2.getModelo() + " y consumo (kW/h): " + electrodom2.getConsumo());
        
        System.out.println("Electromomestico 3:");
        System.out.println("Marca: "+ electrodom3.getMarca() + ", " + "modelo:" + electrodom3.getModelo() + " y consumo (kW/h): " + electrodom3.getConsumo());
        
        //d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene
        
        System.out.println("--------------------");
        System.out.println("Electromomestico 4:");
        System.out.println("Marca: "+ electrodom4.getMarca());
        
    }
    
}
