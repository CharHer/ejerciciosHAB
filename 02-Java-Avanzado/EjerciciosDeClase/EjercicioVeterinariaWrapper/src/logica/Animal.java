
package logica;


public class Animal {
    
    private String nombre;
    private Double peso;

    public Animal() {
    }

    public Animal(String nombre, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void mostrarInfo(){
        System.out.println("Soy un " + nombre + " y peso " + peso);
    }
    
    
}
