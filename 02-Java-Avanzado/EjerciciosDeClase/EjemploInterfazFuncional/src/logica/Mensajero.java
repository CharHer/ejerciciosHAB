
package logica;

@FunctionalInterface
public interface Mensajero {
    
    //solo puede haber un metodo abstracto
    void emitirMensaje(String nombre);
    
}
