public class CreadorExcel extends Creadora{
    @Override
    public Documento crearDocumento() {
        return new Excel();
    }
}
