
package ejerciciothreadscadenadeproduccion;

import logica.Fabrica;
import logica.Trabajador;

public class EjercicioThreadsCadenaDeProduccion {

    public static void main(String[] args) {
        
        Fabrica fabrica = new Fabrica();
        
        Trabajador trab1 = new Trabajador("Trabajador 1", fabrica);
        Trabajador trab2 = new Trabajador("Trabajador 2", fabrica);
        Trabajador trab3 = new Trabajador("Trabajador 3", fabrica);
        
        trab1.start();
        trab2.start();
        trab3.start();
        
        for (int i=0; i<10;i++) {
            fabrica.recibirTarea();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            
            
        }
        
        fabrica.shutdown();
        
    }
    
}
