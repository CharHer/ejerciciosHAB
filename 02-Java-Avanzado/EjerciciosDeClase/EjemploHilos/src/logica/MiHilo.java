
package logica;

public class MiHilo extends Thread{
    
    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }
    
    //para ejecutar el hilo necesitamos un run
    @Override
    public void run() {
        
        for(int i=0; i<5; i++) {
            System.out.println("Soy el hilo: " + nombre + " Estoy en la vuelta " + i);
        }
        
    }
    
  
}
