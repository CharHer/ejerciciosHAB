
package logica;

public class Ave extends Animal {
    
    //envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico
    double envergaduraDeAlas;
    String tipoDeVuelo;
    String colorDePlumaje;
    String tipoDePico;

    public Ave() {
    }

    public Ave(double envergaduraDeAlas, String tipoDeVuelo, String colorDePlumaje, String tipoDePico, int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.envergaduraDeAlas = envergaduraDeAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorDePlumaje = colorDePlumaje;
        this.tipoDePico = tipoDePico;
    }

    public double getEnvergaduraDeAlas() {
        return envergaduraDeAlas;
    }

    public void setEnvergaduraDeAlas(double envergaduraDeAlas) {
        this.envergaduraDeAlas = envergaduraDeAlas;
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getColorDePlumaje() {
        return colorDePlumaje;
    }

    public void setColorDePlumaje(String colorDePlumaje) {
        this.colorDePlumaje = colorDePlumaje;
    }

    public String getTipoDePico() {
        return tipoDePico;
    }

    public void setTipoDePico(String tipoDePico) {
        this.tipoDePico = tipoDePico;
    }
    
    @Override
    public void saludar (){
            System.out.println("Hola, soy un ave");;
    }
    
}
