package E1X01;

public class Conductor extends Empleado{
	
	private static int numeroMaximoCarnets = 15;
	private int ano;
	private int cuentaCarnets;

	public Conductor(String nif, String nombre, Fecha fechanaci, String direccion, String numerotlf, String correo, int cuentaCarnets, int ano) {
		super(nif, nombre, fechanaci, direccion, numerotlf, correo);
		this.ano = ano;
		
		if (cuentaCarnets >= 0 && cuentaCarnets < numeroMaximoCarnets) {
			this.cuentaCarnets = cuentaCarnets;
		}  else {
			this.cuentaCarnets = 1;
		}
	}
	
	@Override
	public String toString() {
		return "Conductor [" + super.obtenerEstado() + "Año = " + ano + "Carnets = " + cuentaCarnets + "]";
	}	
}