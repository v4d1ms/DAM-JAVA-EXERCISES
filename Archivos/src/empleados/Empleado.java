package empleados;

public class Empleado {
	
	private final String SEPARATOR = ";";
	private int codigo;
	private String nombre;
	private String fecha;
	private String departamento;
	private double sueldo;
	
	public Empleado(int codigo, String nombre, String fecha, String departamento, double sueldo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fecha = fecha;
		this.departamento = departamento;
		this.sueldo = sueldo;
	}
	
	public Empleado(String linea) {
		String[] datos = linea.split(SEPARATOR);

		this.codigo = Integer.valueOf(datos[0]);
		this.nombre = datos[1];
		this.fecha = datos[2];
		this.departamento = datos[3];
		this.sueldo = Double.valueOf(datos[4].replace(',', '.'));
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", fecha=" + fecha + ", departamento="
				+ departamento + ", sueldo=" + sueldo + "]";
	}
	
	public String toStringWithSep() {
		return codigo + SEPARATOR + nombre + SEPARATOR + fecha + SEPARATOR
				+ departamento + SEPARATOR + String.format("%.2f", sueldo);
	}
	
	
}
