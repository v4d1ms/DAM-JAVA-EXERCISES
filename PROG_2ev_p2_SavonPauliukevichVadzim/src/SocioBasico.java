
public class SocioBasico extends Socio{
	
	private String turno;
	private boolean taquilla;
	

	public SocioBasico(String dni, String nombre, int edad, int horasEntrenador, 
			String turno, boolean taquilla) {
		super(dni, nombre, edad, horasEntrenador);
		this.turno = turno;
		this.taquilla = taquilla;
	}
	
	public String getTurno() {
		return this.turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	@Override
	public double calcularCuotaMensual() {
		double precio = 0.00;
		switch (turno) {
		case "mañanas":
			if (edad >= 65) {
				precio = 25.00;
			} else {
				precio = 35.00;
			}
			break;
		case "tardes":
			if (edad >= 65) {
				precio = 30.00;
			} else {
				precio = 40.00;
			}
			break;
		case "mediodia":
			if (edad >= 65) {
				precio = 20.00;
			} else {
				precio = 30.00;
			}
			break;
		}
		
		if (taquilla) {
			precio += 2;
		}
		
		precio += horasEntrenador * 40;
		
		return precio;
	}
	

	@Override
	public String toString() {
		return "SocioBasico [nombre = " + nombre + 
				", dni= " + dni
				+ ", edad = " + edad
				+ ", turno = " + turno
				+ ", taquilla= " + taquilla
				+ ", horasEntrenador= " + horasEntrenador 
				+ " cuota = " + this.calcularCuotaMensual()
				+ "]";
	}

}
