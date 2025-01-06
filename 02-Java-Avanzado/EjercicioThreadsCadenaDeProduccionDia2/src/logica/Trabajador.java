
package logica;

public class Trabajador extends Thread{
    
    private String nombre;
    private Fabrica Fabrica;

    public Trabajador(String nombre, Fabrica Fabrica) {
        this.nombre = nombre;
        this.Fabrica = Fabrica;
    }
    
    
    public void run (){
        while (Fabrica.isActive()){
            String tarea = Fabrica.asignarTarea();
            
            System.out.println("\n" + nombre + "esta atendiendo " + tarea);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nombre + " ha resuelto " + tarea);
            
            
            
        }
        
        
    }
    
    
}
