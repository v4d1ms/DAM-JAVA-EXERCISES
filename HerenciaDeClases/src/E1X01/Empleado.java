package E1X01;

public class Empleado {
	private String nif;
	private String nombre;
	private Fecha fechanaci;
	private String direccion;
	private String numerotlf;
	private String correo;
	
	
	public Empleado(String nif, String nombre, Fecha fechanaci, String direccion, String numerotlf, String correo) {
		this.nif = nif;
		this.nombre = nombre;
		this.fechanaci = fechanaci;
		this.direccion = direccion;
		this.numerotlf = numerotlf;
		this.correo = correo;
	}
	
	
	public void setTlf(String tlf) {
		this.numerotlf =  tlf;
	}
	
	public String obtenerEstado() {
		return "nif=" + nif + ", nombre=" + nombre + ", fechanaci=" + fechanaci + ", direccion=" + direccion
				+ ", numerotlf=" + numerotlf + ", correo=" + correo;
	}

	@Override
	public String toString() {
		return "Empleado [nif=" + nif + ", nombre=" + nombre + ", fechanaci=" + fechanaci + ", direccion=" + direccion
				+ ", numerotlf=" + numerotlf + ", correo=" + correo + "]";
	}
	
}
