
package logica;


public class Reserva <T,U> {
    
    private T tipoVehiculo;
    private U tipoReserva;

    public Reserva() {
    }

    public Reserva(T tipoVehiculo, U tipoReserva) {
        this.tipoVehiculo = tipoVehiculo;
        this.tipoReserva = tipoReserva;
    }

    public T getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(T tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public U getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(U tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    
    public void procesarReserva() {
        System.out.println("Se realizo una reserva de " + tipoVehiculo + ", por via " + tipoReserva); 
    }
    
    
    
}
