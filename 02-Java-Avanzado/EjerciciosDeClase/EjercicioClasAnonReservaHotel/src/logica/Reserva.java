
package logica;


public class Reserva {
    
    public void realizarReserva(double valorBase, PrecioReserva precReserv){
        
        double precioFinal = precReserv.calcularPrecio(valorBase);
        System.out.println("El precio de su reserva es :" + precioFinal);
        
    }
    
}
