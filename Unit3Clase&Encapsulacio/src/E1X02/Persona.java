package E1X02;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private double altura;
	private boolean activo;
	
	
	public Persona(String nombre, String apellido, int edad, double altura, boolean activo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.activo = activo;
	}
	
	public Persona(String nombre, String apellido, int edad, double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.altura = altura;
		this.activo = false;
	}

	public Persona() {
		this.nombre = "Recien";
		this.apellido = "Nacido";
		this.edad = 0;
		this.altura = 50;
		this.activo = false;
	}
	
	
	public String obtenerEstado() {
		return "Persona [Nombre = " + nombre + " Apellido : " + apellido + " Edad = " + edad 
				+ " Altura = " + altura + " Activo = " + activo;
	}
	
}
