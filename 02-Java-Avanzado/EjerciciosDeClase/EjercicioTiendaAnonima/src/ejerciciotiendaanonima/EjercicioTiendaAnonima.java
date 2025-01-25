
package ejerciciotiendaanonima;


import logica.Descuento;
import logica.Compra;


public class EjercicioTiendaAnonima {

    
    public static void main(String[] args) {
        
//Precio original
        //Se puede hacer con scanner y todo como corresponde
        double precioOriginal = 350;
        
        //Creo una instancia de la clase Producto
        Compra compra = new Compra();
       
        //Clase anónima para el nuevo cliente 5% de descuento
       Descuento clienteNuevo = new Descuento () {
            @Override
            public double aplicarDescuento(double precioOriginal) {
                   return precioOriginal - (precioOriginal*0.05);
                   //return precioOriginal*0.95;
            }
        
        };
        
        //Clase anónima para el cliente frecuente 10% de descuento
                Descuento clienteFrecuente =new Descuento () {
            @Override
            public double aplicarDescuento(double precioOriginal) {
                   return precioOriginal - (precioOriginal*0.10);
                   //return precioOriginal*0.90;
            }
        
        };
        
        //Clase anónima para el cliente VIP 20% de descuento
               Descuento clienteVip = new Descuento () {
            @Override
            public double aplicarDescuento(double precioOriginal) {
                   return precioOriginal - (precioOriginal*0.20);
                   //return precioOriginal*0.80;
            }
        
        };
               
               compra.mostrarPrecioFinal(precioOriginal, clienteNuevo);
        
    }
    
}
