
package logica;


public class Nintendo64 extends Consola{
    
    String norma;
    Boolean aceptaPirateria;

    public Nintendo64() {
    }

    public Nintendo64(String norma, Boolean aceptaPirateria, String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.aceptaPirateria = aceptaPirateria;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public Boolean getAceptaPirateria() {
        return aceptaPirateria;
    }

    public void setAceptaPirateria(Boolean aceptaPirateria) {
        this.aceptaPirateria = aceptaPirateria;
    }

    public String getCodigo_consola() {
        return codigo_consola;
    }

    public void setCodigo_consola(String codigo_consola) {
        this.codigo_consola = codigo_consola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresaDesarrollo() {
        return empresaDesarrollo;
    }

    public void setEmpresaDesarrollo(String empresaDesarrollo) {
        this.empresaDesarrollo = empresaDesarrollo;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }
    
    

    @Override
    public void cargarJuego() {
        System.out.println("Cargando juego. Por favor, espere");
    }
    
    public void leerCartucho(String juego) {
        System.out.println("Leyendo cartucho: " + juego);
    }
    
}
