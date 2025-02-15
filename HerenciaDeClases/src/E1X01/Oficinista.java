package E1X01;

public class Oficinista extends Empleado { // con extends definimos herencia con Empleado
	private String titulo;
	private String turno;

	public Oficinista(String nif, String nombre, Fecha fechanaci, String direccion, String numerotlf, String correo, String titulo, String turno) {
		super(nif, nombre, fechanaci, direccion, numerotlf, correo); // herencia de Empleado + atributos de oficinista
		this.titulo = titulo;
		this.turno = turno;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setTurno(String turno) {
		if (turno.equals("diurno") || turno.equals("vespertino") || turno.equals("nocturno")) {
			this.turno = turno;
		} else {
			this.turno = "diurno";
		}
	}
	
	@Override
	public String toString() {
		return "Oficinista [" + super.obtenerEstado() + 
				"titulo = " + titulo
				+ "turno = " + turno + "]";
	}
}
