
package logica;


public abstract class Consola {
    //por default estan en PRIVATE.
     String codigo_consola;
     String nombre;
     String empresaDesarrollo;
     int anioLanzamiento;
     
    // Para que no pueda instanciarse un objeto desde esta clase se usa constructor PROTECTED
    protected Consola() {
    }

     /*Si el constructor tiene modificador de acceso PROTECTED, no es necesario hacerlo con las variable
     de ariba*/
    protected Consola(String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        this.codigo_consola = codigo_consola;
        this.nombre = nombre;
        this.empresaDesarrollo = empresaDesarrollo;
        this.anioLanzamiento = anioLanzamiento;
    }

    protected abstract void cargarJuego();
    
    //Se puede tratar de sortear la trampa haciendo otro metodo
    
    /*public void cargarJuegoMsj() {
        System.out.println("Cargando juego. Por favor, espere");
    }*/
    
    
}
