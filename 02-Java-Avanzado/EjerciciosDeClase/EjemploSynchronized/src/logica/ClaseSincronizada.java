
package logica;

public class ClaseSincronizada {
    
    private int contador=0;
    
    public synchronized void incrementar (){
        contador ++;
    }
    
    public synchronized int obtenerContador(){
        return contador;
    }
            
    
}
