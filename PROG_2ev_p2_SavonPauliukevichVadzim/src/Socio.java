import java.util.Objects;

public abstract class Socio {

	protected String dni;
	protected String nombre;
	protected int edad;
	protected int horasEntrenador;

	
	public Socio(String dni, String nombre, int edad, int horasEntrenador) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.horasEntrenador = horasEntrenador;
	}
	
	public abstract double calcularCuotaMensual();

	
	public String getDNI() {
		return this.dni;
	}	
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getHorasEntrenador() {
		return horasEntrenador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Socio)) {
			return false;
		}
		Socio other = (Socio) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Socio [dni= " + dni + 
				", nombre= " + nombre 
				+ ", edad= " + edad + 
				", horasEntrenador= " + horasEntrenador
				+ "]";
	}
}
