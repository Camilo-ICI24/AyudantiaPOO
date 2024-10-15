import java.util.*;

public class Multa {

	private Collection<Usuario> usuario;
	private Prestamo prestamo;
	private int monto;
	private String fechaGeneracion;
	private boolean estadoMulta;

	public int getMonto() {
		return this.monto;
	}

	/**
	 * 
	 * @param monto
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}

	public void getFechaGeneracion() {
		// TODO - implement Multa.getFechaGeneracion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fechaGeneracion
	 */
	public void setFechaGeneracion(int fechaGeneracion) {
		// TODO - implement Multa.setFechaGeneracion
		throw new UnsupportedOperationException();
	}

	public boolean getEstadoMulta() {
		return this.estadoMulta;
	}

	/**
	 * 
	 * @param estadoMulta
	 */
	public void setEstadoMulta(boolean estadoMulta) {
		this.estadoMulta = estadoMulta;
	}

}