
package logica;


public abstract class Animal {
    
    String nombre;
    String color;
    
    //no suelen tener constructores porque no buscamos instanciar la clase
    protected Animal() {
    }

    protected Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
  
    
    
    //metodo implementado
    public void holaAnimal() {
        System.out.println("Hola, soy el animal "+ nombre);
    }
        
    //metodos abstractos
    public abstract void comer();
    public abstract void hacerSonido();
    
    
    
}
