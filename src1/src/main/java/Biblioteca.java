import java.util.*;

public class Biblioteca {

	private Collection<Libro> libros;
	private Empleado empleado;
	private String nombre;
	private String direccion;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @param libro
	 */
	public boolean agregarLibro(Libro libro) {
		// TODO - implement Biblioteca.agregarLibro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param libro
	 */
	public boolean modificarLibro(Libro libro) {
		// TODO - implement Biblioteca.modificarLibro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param libro
	 */
	public boolean eliminarLibro(Libro libro) {
		// TODO - implement Biblioteca.eliminarLibro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 * @param libro
	 */
	public boolean prestarLibro(Usuario usuario, Libro libro) {
		// TODO - implement Biblioteca.prestarLibro
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param usuario
	 */
	public Multa multarUsuario(Usuario usuario) {
		// TODO - implement Biblioteca.multarUsuario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param empleado
	 */
	public boolean agregarEmpleado(Empleado empleado) {
		// TODO - implement Biblioteca.agregarEmpleado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param empleado
	 */
	public boolean modificarEmpleado(Empleado empleado) {
		// TODO - implement Biblioteca.modificarEmpleado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param empleado
	 */
	public boolean eliminarEmpleado(Empleado empleado) {
		// TODO - implement Biblioteca.eliminarEmpleado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param categoria
	 */
	public boolean crearCategoria(Categoria categoria) {
		// TODO - implement Biblioteca.crearCategoria
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param categoria
	 */
	public boolean modificarCategoria(Categoria categoria) {
		// TODO - implement Biblioteca.modificarCategoria
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param categoria
	 */
	public boolean eliminarCategoria(Categoria categoria) {
		// TODO - implement Biblioteca.eliminarCategoria
		throw new UnsupportedOperationException();
	}

}