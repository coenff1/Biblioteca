package dto;
import java.util.List;
public class Libro {

    private int id;
    private String titulo;
    private int isbn;
    private String categoria;
    private String editorial;
    private int stock;
    private List<Autor> autores;

    public Libro(int id, String titulo, int isbn, String categoria, String editorial, int stock, List<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.categoria = categoria;
        this.editorial = editorial;
        this.stock = stock;
        this.autores = autores;
    }

    public Libro(int id, String titulo, int isbn, String categoria, String editorial, List<Autor> autores) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.categoria = categoria;
        this.editorial = editorial;
        this.autores = autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", categoria=" + categoria + ", editorial=" + editorial + ", stock=" + stock + '}';
    }

}
