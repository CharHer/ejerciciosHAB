
package logica;

public class Perro extends Animal implements Terrestres {

    public Perro(String nombre, String color) {
        super(nombre, color);
    }
        

    @Override
    public void comer() {
        System.out.println("Soy un perro y como");
    }

    @Override
    public void Caminar() {
        System.out.println("Soy un perro y camino");
    }

    @Override
    public void Respirar() {
        System.out.println("Soy un perro y respiro aire");
    }
    
}
