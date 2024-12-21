
package logica;


public class Videojuego {
    
    //codigo, titulo, consola, cantidadJugadores
    
    String codigo;
    String titulo;
    String consola;
    int cantidadJugadores;

    public Videojuego() {
    }

    public Videojuego(String codigo, String titulo, String consola, int cantidadJugadores) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }
    
               
    
}
