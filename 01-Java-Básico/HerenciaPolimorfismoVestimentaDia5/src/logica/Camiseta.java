
package logica;

public class Camiseta extends Vestimenta {
    
    String manga;
    String cuello;

    public Camiseta() {
    }

    public Camiseta(String manga, String cuello, int codigo, String nombre, double precio, String marca, double talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }
    
    @Override
    public void mostrarInfo () {
        //método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga)..
        System.out.println("Esta camiseta es de manga: "+ manga);
    } 
    
}
