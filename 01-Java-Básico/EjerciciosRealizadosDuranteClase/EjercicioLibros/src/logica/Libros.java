
package logica;


public class Libros {
    //codigo ISBN, título, autor, género, número de páginas
    
    int codigoISBN;
    String titulo;
    String autor;
    String genero;
    int Pags;

    public Libros() {
    }

    public Libros(int codigoISBN, String titulo, String autor, String genero, int Pags) {
        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.Pags = Pags;
    }

    public int getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPags() {
        return Pags;
    }

    public void setPags(int Pags) {
        this.Pags = Pags;
    }

    @Override
    public String toString() {
        return "Libros{" + "codigoISBN=" + codigoISBN + ", titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", Pags=" + Pags + '}';
    }
    
   
    
}
