
package logica;


public class Insumo {
    
    private String codigo;
    private String nombre;
    private String cantidad;
    private String fechaCaducidad;

    public Insumo() {
    }

    public Insumo(String codigo, String nombre, String cantidad, String fechaCaducidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getCodigo_insumo() {
        return codigo;
    }

    public void setCodigo_insumo(String codigo_insumo) {
        this.codigo = codigo_insumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Insumo{" + "codigo_insumo=" + codigo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    
    
    
}
