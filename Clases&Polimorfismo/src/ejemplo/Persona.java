package ejemplo;

public class Persona {
	private String nombre;
	private Fecha fechanacimiento;
	
	public Persona(String nombre, int dia, int mes ,int ano) {
		this.nombre = nombre;
		this.fechanacimiento = new Fecha(dia, mes , ano);
		
	}
	
	@Override
	public String toString() {
		return "Persona [nombre= " + nombre + " Fecha = " + fechanacimiento + "]";
	}
}
