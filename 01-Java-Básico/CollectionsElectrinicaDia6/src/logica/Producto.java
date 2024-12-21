
package logica;

public class Producto {
    //código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.
    
    int codigo;
    String nombre;
    String marca;
    String tipo;
    double precioCosto;
    double precioVenta;
    int Stock;

    public Producto(int codigo, String nombre, String marca, String tipo, double precioCosto, double precioVenta, int Stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.Stock = Stock;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    
    @Override
    public String toString() {
        return "Producto{" +
               "codigo=" + codigo +
               ", nombre='" + nombre + '\'' +
               ", marca='" + marca + '\'' +
               ", tipo='" + tipo + '\'' +
               ", precioCosto=" + precioCosto +
               ", precioVenta=" + precioVenta +
               ", stock=" + Stock +
               '}';
    }

}
