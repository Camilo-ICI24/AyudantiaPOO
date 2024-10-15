import java.util.*;

public class Libro {

	private Collection<Biblioteca> biblioteca;
	private Collection<Categoria> categoriaLibro;
	private String titulo;
	private String autor;
	private String isbn;
	private int fecha;

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

	public int getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

}