import java.util.Objects;

public class Libro {
    private String titulo;
    private String autor;
    private int isbn;

    public Libro(String titulo, String autor, int isbn) {
        setTitulo(titulo);
        setAutor(autor);
        setIsbn(isbn);
    }


    public boolean equals(Libro otro) {
        if (this == otro) return true;
        if (otro == null || getClass() != otro.getClass()) return false;
        Libro libro = (Libro) otro;
        return isbn == libro.isbn &&
                Objects.equals(titulo, libro.titulo) &&
                Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(titulo, autor, isbn);
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
