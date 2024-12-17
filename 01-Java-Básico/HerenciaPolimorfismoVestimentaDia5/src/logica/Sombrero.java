
package logica;

public class Sombrero extends Vestimenta {
    
    String tipo;
    char tamano;

    public Sombrero() {
    }

    public Sombrero(String tipo, char tamano, int codigo, String nombre, double precio, String marca, double talla, String color) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public char getTamano() {
        return tamano;
    }

    public void setTamano(char tamano) {
        this.tamano = tamano;
    }

    @Override
    public void mostrarInfo () {
        //método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).
        System.out.println("Este sombrero es de tipo: "+ tipo);
    }     
    
    
    
}
