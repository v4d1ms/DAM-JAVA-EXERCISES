package E1X01;

public class Limpiador extends Empleado{

	private boolean oficinas;
	private boolean buses;
	private boolean ambos;
	
	public Limpiador(String nif, String nombre, Fecha fechanaci, String direccion, 
			String numerotlf, String correo, boolean oficinas, boolean buses, boolean ambos) {
		super(nif, nombre, fechanaci, direccion, numerotlf, correo);
		this.oficinas = oficinas;
		this.buses = buses;
		this.ambos = ambos;
	}

	
	@Override
	public String toString() {
		return "Limpiador [" + super.obtenerEstado() +  " Limpia buses =" + buses + " Limpia oficinas = " 
				+  oficinas + " Limpia ambos =" + ambos + "]";
	}

}
