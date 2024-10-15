import java.util.*;

public class Libro {

	private Collection<Biblioteca> biblioteca;
	private Collection<Categoria> categoriaLibro;
	private String titulo;
	private String autor;
	private String isbn;
	private int año;

	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	/**
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return this.isbn;
	}

	/**
	 * 
	 * @param isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAño() {
		return this.año;
	}

	/**
	 * 
	 * @param año
	 */
	public void setAño(int año) {
		this.año = año;
	}

}