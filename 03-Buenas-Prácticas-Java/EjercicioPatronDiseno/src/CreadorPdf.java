public class CreadorPdf extends Creadora{
    @Override
    public Documento crearDocumento() {
        return new Pdf();
    }
}
