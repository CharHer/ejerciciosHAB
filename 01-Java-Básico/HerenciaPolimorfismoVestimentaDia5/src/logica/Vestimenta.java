
package logica;

public class Vestimenta {
    
    //código, nombre, precio, marca, talla y color
    protected int codigo;
    protected String nombre;
    protected double precio;
    protected String marca;       
    protected double talla;
    protected String color;

    public Vestimenta() {
    }

    public Vestimenta(int codigo, String nombre, double precio, String marca, double talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void mostrarInfo () {
        System.out.println("Esta es mi info: ");
    }    
    
    
}
