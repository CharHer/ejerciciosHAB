
package logica;

public class Producto {
    
    //nombre del producto, el precio y la cantidad disponible.
    String nombre;
    double precio;
    int disponible;

    public Producto(String nombre, double precio, int disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", disponible=" + disponible + '}';
    }
    
    
}
