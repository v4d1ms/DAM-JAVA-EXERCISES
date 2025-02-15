package E2X02;

public abstract class Alcoholica extends Bebida{

	protected double graduacion;
	
	public Alcoholica(String nombre, double graduacion) {
		super(nombre);
		this.graduacion = graduacion;
	}
	
	@Override
	public String toString() {
		return "Alcoholica [nombre= " + nombre + " codigo = " + codigo  + " graduacion= " + graduacion + "]";
	}
	
}
