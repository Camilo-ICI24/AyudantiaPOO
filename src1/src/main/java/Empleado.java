import java.util.*;

public class Empleado {

	private Collection<Biblioteca> bibliotecaPrincipal;
	private String nombreEmpleado;
	private int idEmpleado;
	private String cargo;

	public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}

	/**
	 * 
	 * @param nombreEmpleado
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getIdEmpleado() {
		return this.idEmpleado;
	}

	/**
	 * 
	 * @param idEmpleado
	 */
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCargo() {
		return this.cargo;
	}

	/**
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}