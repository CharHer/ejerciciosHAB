
package logica;

import java.time.LocalDate;

public class Usuario {
    
    //nombre, destino, fecha de viaje y número de asientos deseados.
    String nombre;
    String destino;
    LocalDate fechaViaje;
    int asientosDeseados;

    public Usuario() {
    }

    public Usuario(String nombre, String destino, LocalDate fechaViaje, int asientosDeseados) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientosDeseados = asientosDeseados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(LocalDate fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getAsientosDeseados() {
        return asientosDeseados;
    }

    public void setAsientosDeseados(int asientosDeseados) {
        this.asientosDeseados = asientosDeseados;
    }

    @Override
    public String toString() {
        return "Ticket{" + "nombre=" + nombre + ", destino=" + destino + ", fechaViaje=" + fechaViaje + 
                ", asientosDeseados=" + asientosDeseados + '}';
    }

    
    
    
}
