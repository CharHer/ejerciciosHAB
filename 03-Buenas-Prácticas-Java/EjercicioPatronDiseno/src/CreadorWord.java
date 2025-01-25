public class CreadorWord extends Creadora {

    @Override
    public Documento crearDocumento() {
        return new Word();
    }
}
