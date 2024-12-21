
package logica;


public class Pato extends Animal implements Voladores, Acuaticos, Terrestres{

    public Pato(String nombre, String color) {
        super(nombre, color);
    }
    
    

    @Override
    public void comer() {
        System.out.println("Soy un pato y como");
    }

    @Override
    public void volar() {
        System.out.println("Soy un pato y puedo volar");
    }

    @Override
    public void aletear() {
        System.out.println("Soy un pato y puedo aletear");
    }

    @Override
    public void nadar() {
        System.out.println("Soy un pato y se como nadar");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("Soy un pato y medio puedo respirar bajo el agua");
    }

    @Override
    public void Caminar() {
        System.out.println("Soy un pato y camino");
    }

    @Override
    public void Respirar() {
        System.out.println("Soy un pato y puedo respirar aire");
    }
    
}
