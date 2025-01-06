
package ejemplohilos;

import logica.MiHilo;


public class EjemploHilos {

    public static void main(String[] args) {
        
        
        //crear hilos mediante la clase Thread
        MiHilo hilo = new MiHilo ("Hilo 1");
        MiHilo hilo2 = new MiHilo ("Hilo 2");
        MiHilo hilo3 = new MiHilo ("Hilo 3");
        
        hilo.start();
        hilo2.start();
        hilo3.start();
       
    }
    
}
