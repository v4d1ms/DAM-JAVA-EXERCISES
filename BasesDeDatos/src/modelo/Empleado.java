package modelo;

public class Empleado {
	
	private int codigo;
	private String nombre;
	private String fechaAlta;
	private double salario;
	private int codigoDepartamento;

	
	public Empleado(String nombre, String fechaAlta, double salario, int codigoDepartamento) {
		this.codigo = 0;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.salario = salario;
		this.codigoDepartamento = codigoDepartamento;
	}
	
	public Empleado(int codigo, String nombre, String fechaAlta, double salario, int codigoDepartamento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.salario = salario;
		this.codigoDepartamento = codigoDepartamento;
	}
	
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the fechaAlta
	 */
	public String getFechaAlta() {
		return fechaAlta;
	}

	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * @return the codigoDepartamento
	 */
	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}


	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + ", salario=" + salario
				+ ", codigoDepartamento=" + codigoDepartamento + "]";
	}
	
	
	
}
