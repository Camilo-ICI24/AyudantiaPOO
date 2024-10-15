public class Usuario {

	private Prestamo prestamo;
	private Multa multa;
	private String nombre;
	private int idUsuario;

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

	public int getIdUsuario() {
		return this.idUsuario;
	}

	/**
	 * 
	 * @param idUsuario
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}