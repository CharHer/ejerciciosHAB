
package logica;

public class XboxOne extends Consola{
    
    boolean hayConexion;
    boolean definicion4k;
    boolean actualizacionAutomatica;

    public XboxOne() {
    }
    
    

    protected XboxOne(boolean hayConexion, boolean definicion4k, boolean actualizacionAutomatica, String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioLanzamiento);
        this.hayConexion = hayConexion;
        this.definicion4k = definicion4k;
        this.actualizacionAutomatica = actualizacionAutomatica;
    }

    public boolean isHayConexion() {
        return hayConexion;
    }

    public void setHayConexion(boolean hayConexion) {
        this.hayConexion = hayConexion;
    }

    public boolean isDefinicion4k() {
        return definicion4k;
    }

    public void setDefinicion4k(boolean definicion4k) {
        this.definicion4k = definicion4k;
    }

    public boolean isActualizacionAutomatica() {
        return actualizacionAutomatica;
    }

    public void setActualizacionAutomatica(boolean actualizacionAutomatica) {
        this.actualizacionAutomatica = actualizacionAutomatica;
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
    
    public void juegoDigital(String juego) {
        System.out.println("Leyendo juego digital: " + juego);
    }
    
    
}
