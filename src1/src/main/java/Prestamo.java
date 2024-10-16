import java.time.LocalDate;

public class Prestamo {

	private Usuario deudor;
	private Multa multas;
	private String fechaPrestamo;
	private String fechaDevolucion;

	public Prestamo() {
	}

	public Prestamo(Usuario deudor, String fechaPrestamo, String fechaDevolucion) {
		this.deudor = deudor;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}


	public Usuario getDeudor() {
		return deudor;
	}

	public void setDeudor(Usuario deudor) {
		this.deudor = deudor;
	}

	public Multa getMultas() {
		return multas;
	}

	public void setMultas(Multa multas) {
		this.multas = multas;
	}

	public String getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(String fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
}
