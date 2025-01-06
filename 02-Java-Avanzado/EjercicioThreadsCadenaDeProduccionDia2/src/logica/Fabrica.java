
package logica;

import java.util.ArrayList;
import java.util.List;


public class Fabrica {
    
    private List<String> listaTareas;
    private int numTarea;
    private boolean isActive = true;
    
    public Fabrica(){
        listaTareas = new ArrayList<>();
        numTarea = 1;
    }
    
    public synchronized void recibirTarea(){
        String tarea = "Tarea " + numTarea;
        listaTareas.add(tarea);
        System.out.println("\n" + tarea + " ha sido recibida");
        numTarea++;
        notifyAll();
    }
    
    public synchronized String asignarTarea(){
        while (listaTareas.isEmpty()) {
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
        return listaTareas.remove(0);
    }
    
    public synchronized boolean isActive() {
        return isActive;
    }
    
    public synchronized void shutdown(){
        isActive = false;
        notifyAll();
    }
    
    public List<String> getListaTareas (){
        return listaTareas;
    }
            
    public void setListaTareas (List<String>listaTareas){
        this.listaTareas = listaTareas;
    }

    public int getNumTarea (){
        return numTarea;
    }

    public void setNumTarea (int numTarea) {
        this.numTarea = numTarea;
    }

}
