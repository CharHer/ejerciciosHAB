
package logica;

public class Auto extends Vehiculo implements IElectrico {
    
    int capacidadDeBateria;
    int autonomia;

    public Auto(int capacidadDeBateria, int autonomia, int id, String placa, int modelo, int anio, double costo) {
        super(id, placa, modelo, anio, costo);
        this.capacidadDeBateria = capacidadDeBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadDeBateria() {
        return capacidadDeBateria;
    }

    public void setCapacidadDeBateria(int capacidadDeBateria) {
        this.capacidadDeBateria = capacidadDeBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    

    @Override
    public int calcularAntiguedad() {
        return 2024 - this.modelo;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando batería del auto");
    }

    @Override
    public String toString() {
        return "Auto [ID: " + id + ", Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio
                + ", Costo: $" + costo + ", Capacidad Batería: " + capacidadDeBateria + " mAh, Autonomía: " + autonomia + " hrs]";
    }
    
}
