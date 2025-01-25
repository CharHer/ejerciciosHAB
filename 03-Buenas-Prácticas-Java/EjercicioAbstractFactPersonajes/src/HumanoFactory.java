public class HumanoFactory implements PersonajeFactory{

    @Override
    public Guerrero crearGuerrero() {
        return new GuerreroHumano() ;
    }

    @Override
    public Mago crearMago() {
        return new MagoHumano();
    }

    @Override
    public Arquero crearArquero() {
        return new ArqueroHumano();
    }
}
