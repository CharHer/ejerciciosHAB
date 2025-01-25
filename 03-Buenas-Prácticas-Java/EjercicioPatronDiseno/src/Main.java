public class Main {
    public static void main(String[] args) {

    Creadora creadoraPdf = new CreadorPdf();
    creadoraPdf.ejecutarDocumento();

    Creadora creadoraWord = new CreadorWord();
    creadoraWord.ejecutarDocumento();

    Creadora creadoraExcel = new CreadorExcel();
    creadoraExcel.ejecutarDocumento();


    }
}