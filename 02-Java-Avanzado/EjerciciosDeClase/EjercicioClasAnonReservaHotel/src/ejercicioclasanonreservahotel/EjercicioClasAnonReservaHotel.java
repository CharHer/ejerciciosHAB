
package ejercicioclasanonreservahotel;

import logica.PrecioReserva;
import logica.Reserva;


public class EjercicioClasAnonReservaHotel {

    
    public static void main(String[] args) {
        
        double valorBase = 1500;
        
        Reserva reserva = new Reserva();
        
        //Un descuento del 10% para clientes con membresía.
        PrecioReserva membrecia = new PrecioReserva(){
            @Override
            public double calcularPrecio(double valorBase) {
                return valorBase - (valorBase*0.10);
            }
            
        };
        
        //Un descuento del 20% para reservas en temporada baja.
        PrecioReserva temporadaBaja = new PrecioReserva(){
            @Override
            public double calcularPrecio(double valorBase) {
                return valorBase - (valorBase*0.20);
            }
            
        };
        
        
        //Un precio fijo para reservas de última hora (sin descuento).
        PrecioReserva ultimaHora = new PrecioReserva(){
            @Override
            public double calcularPrecio(double valorBase) {
                return valorBase;
            }
            
        };
        
        
        reserva.realizarReserva(valorBase, ultimaHora);
        
    }
    
}
