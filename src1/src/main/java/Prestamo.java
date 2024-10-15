import java.util.*;

public class Prestamo {

	private Collection<Usuario> deudor;
	private Multa multas;
	private String fechaPrestamo;
	private int fechaDevolucion;

	public String getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	/**
	 * 
	 * @param fechaPrestamo
	 */
	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public void getFechaDevolucion() {
		// TODO - implement Prestamo.getFechaDevolucion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fechaDevolucion
	 */
	public void setFechaDevolucion(int fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}