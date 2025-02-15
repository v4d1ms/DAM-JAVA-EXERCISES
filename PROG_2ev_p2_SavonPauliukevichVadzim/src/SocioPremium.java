
public class SocioPremium extends Socio{
	
	private boolean carnetEstudiante;

	public SocioPremium(String dni, String nombre, int edad, int horasEntrenador,
			boolean carnetEstudiante) {
		super(dni, nombre, edad, horasEntrenador);
		this.carnetEstudiante = carnetEstudiante;
	}
	
	
	public boolean tieneCarnetEstudiante() {
		return this.carnetEstudiante;
	}
	
	
	@Override
	public double calcularCuotaMensual() {
		double precio = 0.00;
		
		if (edad >= 65) {
			precio = 40;
		} else {
			precio = 60;
		}
		
		precio += horasEntrenador * 35;
		
		if (this.carnetEstudiante) {
			precio = precio - (precio * 0.10);
		}
		
		return precio;
	}
	

	@Override
	public String toString() {
		return "SocioPremium [ dni= " + dni 
				+ ", nombre= " + nombre 
				+ ", edad= " + edad 
				+ ", horasEntrenador= " + horasEntrenador 
				+ ", carnetEstudiante= " + carnetEstudiante
				+ ", cuota = " + this.calcularCuotaMensual()
				+ "]";
	}

}
