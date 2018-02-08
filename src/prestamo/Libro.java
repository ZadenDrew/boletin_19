package prestamo;

/**
 *
 * @author andrea
 */
public class Libro implements Comparable{

    String titulo, autor, isbn;
    float prezo;
    int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.unidades = unidades;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return ("Libro" + "titulo = " + titulo + ", autor = " + autor + ", isbn = " + isbn + ", prezo = " + prezo + ", unidades = " + unidades + "\n");
    }

    @Override
    public int compareTo(Object o) {
        Libro l = (Libro) o;
        if (titulo.compareToIgnoreCase(l.getTitulo()) > 0) {
            return 1;
        } else if (titulo.compareToIgnoreCase(l.getTitulo()) == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}