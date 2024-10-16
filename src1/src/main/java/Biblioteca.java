import java.util.*;

public class Biblioteca {

	private ArrayList<Libro> libros;
	private ArrayList<Empleado> empleado;
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

	public Multa multarUsuario(Usuario usuario) {
		// TODO - implement Biblioteca.multarUsuario
		throw new UnsupportedOperationException();
	}

	/**
	 *
	 * @param empleado
	 */
	public boolean agregarEmpleado(Empleado empleado) {
		empleado.add(empleado);
		System.out.println("Empleado añadido con éxito");
		return true;
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
		for (Empleado e : empleados) {
			if (e.getIdEmpleado() == (empleado.getIdEmpleado())) {
				empleados.remove(e);
				System.out.println("Empleado eliminado con éxito");
				return true;
			}
		}
		System.out.println("Error: Empleado no encontrado");
		return false;
	}


	/**
	 *
	 * @param categoria
	 */
	public boolean crearCategoria(Categoria categoria) {
		for (Categoria c : categorias) {
			if (c.getNombre().equals(categoria.getNombre())) {
				System.out.println("Error: Categoría existente");
				return false;
			}
		}
		categorias.add(categoria);
		System.out.println("Categoría añadida exitosamente");
		return true;
	}

	/**
	 *
	 * @param categoria
	 */
	public boolean modificarCategoria(Categoria categoria) {
		for (int c = 0; c < categorias.size(); c++) {
			if (categorias.get(c).getNombre().equals(categoria.getNombre())) {
				categorias.set(c, categoria);
				System.out.println("Categoría modificada con éxito");
				return true;
			}
		}
		System.out.println("Error: Categoría no encontrada");
		return false;
	}

	public boolean eliminarCategoria(Categoria categoria) {
		for (Categoria c : categorias) {
			if (c.getNombre().equals(categoria.getNombre())) {
				categorias.remove(c);
				System.out.println("Categoría " + categoria.getNombre() + " eliminada exitosamente.");
				return true;
			}
		}
		System.out.println("Error: Categoría no encontrada.");
		return false;
	}

}