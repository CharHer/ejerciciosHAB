
package logica;


public class MiRunnable implements Runnable{
    
    ClaseSincronizada ejemplo = new ClaseSincronizada();

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Soy el hilo: Estoy en la vuelta " + i);
            ejemplo.incrementar();
        }
     }
}
