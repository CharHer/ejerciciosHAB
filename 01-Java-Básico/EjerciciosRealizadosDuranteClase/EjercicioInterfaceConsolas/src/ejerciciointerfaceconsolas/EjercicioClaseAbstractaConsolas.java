
package ejerciciointerfaceconsolas;

import logica.Nintendo64;
import logica.PlayStation2;
import logica.XboxOne;


public class EjercicioClaseAbstractaConsolas {

    public static void main(String[] args) {
        
        Nintendo64 n64 = new Nintendo64();
        System.out.println("Nintendo 64: ");
        n64.cargarJuego();
        n64.leerCartucho("007: goldeneye");
        System.out.println("");
        
        PlayStation2 ps2 = new PlayStation2();
        System.out.println("PlayStation 2: ");
        ps2.cargarJuego();
        ps2.leerDvd("FIFA 2010");
        ps2.grabarEnMemory();
        System.out.println("");
        
        XboxOne xbox1 = new XboxOne();
        System.out.println("Xbox One: ");
        xbox1.cargarJuego();
        xbox1.juegoDigital("GTA V");
        
    }
    
}
