
package logica;


public abstract class Animal {
    
    String nombre;
    String color;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
      
    public abstract void comer ();
    
    
}
