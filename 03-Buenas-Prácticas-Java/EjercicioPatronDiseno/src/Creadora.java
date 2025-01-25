public abstract class Creadora {

    public abstract Documento crearDocumento();

    public void ejecutarDocumento(){
        Documento doc = crearDocumento();
        doc.mostrar();
    }
}
