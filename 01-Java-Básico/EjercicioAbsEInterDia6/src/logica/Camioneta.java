
package logica;

public class Camioneta extends Vehiculo implements ICombustion{

    int capacidadTanque;
    int consumoCombustible;

    public Camioneta(int capacidadTanque, int consumoCombustible, int id, String placa, int modelo, int anio, double costo) {
        super(id, placa, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
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
    public String toString() {
        return "Camioneta [ID: " + id + ", Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio
                + ", Costo: $" + costo + ", Capacidad Tanque: " + capacidadTanque + " litros, Consumo: " + consumoCombustible + " km/l]";
    }

    @Override
    public void cargarCombistible() {
        System.out.println("Recargando combustible para la camioneta...");}

    
    
}
