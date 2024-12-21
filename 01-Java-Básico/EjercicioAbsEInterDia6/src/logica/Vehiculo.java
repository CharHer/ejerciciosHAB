
package logica;

public abstract class Vehiculo {
    //id, placa, marca, modelo, año, costo
    protected int id;
    protected String placa;
    protected String marca;
    protected int modelo;
    protected int anio;
    protected double costo;

    public Vehiculo() {
    }

    public Vehiculo(int id, String placa, int modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }
    
    
    
    public abstract int calcularAntiguedad();
   
    
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Costo: $" + costo);
        
    }
    

}
