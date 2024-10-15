import java.util.*;

public class Biblioteca {

	private ArrayList<Libro> libros;
	private Empleado empleado;
	private String nombre;
	private String direccion;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	/**
	 * @param direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @param libro
	 */
	public boolean agregarLibro(Libro libro) {
		for (Libro l : libros) {
			if (l.getIsbn().equals(libro.getIsbn())) {
				System.out.println("Error: Ya existe un libro con este ISBN");
				return false;
			}
		}
		libros.add(libro);
		System.out.println("Libro agregado exitosamente");
		return true;
	}

	public boolean modificarLibro(Libro libro) {
		for (int l = 0; l < libros.size(); l++) {
			if (libros.get(l).getIsbn().equals(libro.getIsbn())) {
				libros.set(l, libro);
				System.out.println("Libro modificado exitosamente");
				return true;
			}
		}
		System.out.println("Error: ISBN no registrada");
		return false;
	}

	public boolean eliminarLibro(Libro libro) {
		for (Libro l : libros) {
			if (l.getIsbn().equals(libro.getIsbn())) {
				libros.remove(l);
				System.out.println("Libro exterminado exitosamente");
				return true;
			}
		}
		System.out.println("Error: Ese libro no existe");
		return true;
	}

	public boolean prestarLibro(Usuario usuario, Libro libro) {
		if (!libros.contains(libro)) {
			System.out.println("El libro no está disponible en la biblioteca.");
			return false;
		}

		// Comprobar si el usuario ya tiene un préstamo del mismo libro
		for (Prestamo prestamo : usuario.getPrestamos()) {
			if (prestamo.getLibro().equals(libro)) {
				System.out.println("El usuario ya tiene este libro en préstamo.");
				return false;
			}
		}

		// Crear un nuevo préstamo
		Prestamo nuevoPrestamo = new Prestamo();
		nuevoPrestamo.setUsuario(usuario);
		nuevoPrestamo.setLibro(libro);
		nuevoPrestamo.setFechaPrestamo(new Date());

		// Agregar el préstamo al usuario
		usuario.agregarPrestamo(nuevoPrestamo);

		// Quitar el libro de la colección de libros disponibles
		libros.remove(libro);

		System.out.println("Préstamo realizado con éxito.");
		return true;
	}

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