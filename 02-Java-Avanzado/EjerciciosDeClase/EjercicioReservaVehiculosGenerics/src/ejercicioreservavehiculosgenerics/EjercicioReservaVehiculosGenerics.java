
package ejercicioreservavehiculosgenerics;

import logica.Auto;
import logica.Bicicleta;
import logica.Moto;
import logica.Online;
import logica.Presencial;
import logica.Reserva;


public class EjercicioReservaVehiculosGenerics {

    public static void main(String[] args) {
        
        Reserva<Moto, Online> reservaMoto = new Reserva<>(new Moto(), new Online());
        Reserva<Auto, Presencial> reservaAuto = new Reserva<>(new Auto(), new Presencial());
        Reserva<Bicicleta, Online> reservaBici = new Reserva<>(new Bicicleta(), new Online());
        Reserva<Moto, Presencial> reservaMoto2 = new Reserva<>(new Moto(), new Presencial());
        Reserva<Auto, Online> reservaAuto2 = new Reserva<>(new Auto(), new Online());
        Reserva<Bicicleta, Presencial> reservaBici2 = new Reserva<>(new Bicicleta(), new Presencial());

        reservaMoto.procesarReserva();
        reservaAuto.procesarReserva();
        reservaBici.procesarReserva();
        reservaMoto2.procesarReserva();
        reservaAuto2.procesarReserva();
        reservaBici2.procesarReserva();

    }

}
