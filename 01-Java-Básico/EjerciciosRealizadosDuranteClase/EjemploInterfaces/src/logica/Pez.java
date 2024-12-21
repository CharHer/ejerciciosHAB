
package logica;


    public class Pez extends Animal implements Acuaticos {

    public Pez(String nombre, String color) {
        super(nombre, color);
    }
        
       

    @Override
    public void comer() {
        System.out.println("Soy un pez y como");
    }

    @Override
    public void nadar() {
        System.out.println("Soy un pez y nado");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("Soy un pez y respiro bajo el agua");
    }
    
}
