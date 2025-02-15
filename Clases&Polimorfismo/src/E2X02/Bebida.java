package E2X02;

public abstract class Bebida {
	
	private static int contador = 0;
	
	protected int codigo;
	protected String nombre;
	
	public Bebida(String nombre) {
		this.codigo = Bebida.contador++;
		this.nombre = nombre;
	}
	
	public abstract double calcularPrecio();
	
	@Override
	public String toString() {
		return "Bebida [codigo= " + codigo + ", nombre= " + nombre + "]";
	}
	
}
