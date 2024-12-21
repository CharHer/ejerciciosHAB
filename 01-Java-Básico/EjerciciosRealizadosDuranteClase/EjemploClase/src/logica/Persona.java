
package logica;

import java.time.LocalDate;


public class Persona {
    
    int id;
    String nombre;
    String apellido;
    LocalDate fecha;
    String dirección;

    public Persona() {
    }

    public Persona(int id, String nombre, String apellido, LocalDate fecha, String dirección) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.dirección = dirección;
    }


}
