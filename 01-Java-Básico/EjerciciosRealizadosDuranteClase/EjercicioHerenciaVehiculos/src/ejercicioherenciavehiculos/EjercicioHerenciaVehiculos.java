
package ejercicioherenciavehiculos;

import logica.Auto;
import logica.Moto;


public class EjercicioHerenciaVehiculos {


    public static void main(String[] args) {
        
        Auto auto = new Auto(2, "Posrche", "911 GT3", 2023);
        Moto moto = new Moto(350, "Royal Enfield", "Classic 350", 2024);
        
        System.out.println("El auto elegido es: " + auto.getMarca() + ", modelo " + auto.getModelo() + " y se fabrico " + auto.getAnio() + 
                ". Tiene " + auto.getCantidadPuertas() + " puertas.");
        
        auto.acelerar();
        
        System.out.println("\nLa moto elegida es: " + moto.getMarca() + ", modelo " + moto.getModelo() + " y se fabrico " + moto.getAnio() + ". Es de " + 
                moto.getCilindrada() + " cm cubicos" );
        
        moto.acelerar();
        
        
    }
    
}
