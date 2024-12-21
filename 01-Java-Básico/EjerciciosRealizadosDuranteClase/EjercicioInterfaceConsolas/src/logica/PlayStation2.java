
package logica;


public class PlayStation2 extends Consola{
    
    String norma;
    Boolean chipeadaONo;
    int tamanioMemoryCard;

    public PlayStation2() {
    }

    public PlayStation2(String norma, Boolean chipeadaONo, int tamanioMemoryCard, String codigo_consola, String nombre, String empresaDesarrollo, int anioLanzamiento) {
        super(codigo_consola, nombre, empresaDesarrollo, anioLanzamiento);
        this.norma = norma;
        this.chipeadaONo = chipeadaONo;
        this.tamanioMemoryCard = tamanioMemoryCard;
    }

    public String getNorma() {
        return norma;
    }

    public void setNorma(String norma) {
        this.norma = norma;
    }

    public Boolean getChipeadaONo() {
        return chipeadaONo;
    }

    public void setChipeadaONo(Boolean chipeadaONo) {
        this.chipeadaONo = chipeadaONo;
    }

    public int getTamanioMemoryCard() {
        return tamanioMemoryCard;
    }

    public void setTamanioMemoryCard(int tamanioMemoryCard) {
        this.tamanioMemoryCard = tamanioMemoryCard;
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
    
    public void leerDvd(String juego) {
        System.out.println("Leyendo DVD: " + juego);
    }
    
    public void grabarEnMemory() {
        System.out.println("Juego guardado con exito");
    }
    
}
