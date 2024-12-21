
package logica;


public class Gato extends Animal{

    public Gato(String nombre, String color) {
        super(nombre, color);
    }
    
    

    @Override
    public void comer() {
        System.out.println("Soy un gato y estoy comiendo");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Soy un gato miau miau");
    }
    
}
