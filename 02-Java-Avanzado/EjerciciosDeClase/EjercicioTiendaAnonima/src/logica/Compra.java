
package logica;


public class Compra {
    
    public void mostrarPrecioFinal (double precioOriginal, Descuento desc) {
        double precioFinal = desc.aplicarDescuento(precioOriginal);
        System.out.println("El precio final con descuento es de: " + precioFinal);
    }
    
}
