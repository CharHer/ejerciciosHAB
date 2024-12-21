
package logica;

public class Moto extends Vehiculo implements ICombustion {
    
    int cilindrada;
    String tipoMotor;

    public Moto(int cilindrada, String tipoMotor, int id, String placa, int modelo, int anio, double costo) {
        super(id, placa, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
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
        return "Moto [ID: " + id + ", Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio
                + ", Costo: $" + costo + ", Cilindrada: " + cilindrada + " cm³, Tipo Motor: " + tipoMotor + "]";
    }

    @Override
    public void cargarCombistible() {
        System.out.println("Recargando combustible para la moto");
    }
    
}
