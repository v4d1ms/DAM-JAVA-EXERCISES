package E2X02;

import java.util.Random;

public class Refresco extends Bebida{

	protected boolean gas;
	protected double contadorAzucar;
	protected static final String[] refrescos = {"liomanda", "cola", "gaseosa", "té helado",
			"granizado" , "ponche"};
	
	public Refresco(String nombre, boolean gas, double contadorAzucar) {
		super(nombre);
		this.gas = gas;
		this.contadorAzucar = contadorAzucar;
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return refrescos[aleatorio.nextInt(refrescos.length)];
	}
	
	public Refresco() {
		super(generarNombre());
		Random aleatorio = new Random();
		this.gas = aleatorio.nextBoolean();
		this.contadorAzucar = aleatorio.nextDouble() * (35-4) + 4;
	}
	
	public boolean esGaseoso() {
		return gas;
	}
	
	@Override
	public double calcularPrecio() {
		return 1 + (this.contadorAzucar / 10);
	}

	@Override
	public String toString() {
		return "Refresco [nombre = " + nombre + 
				" codigo = " + codigo + 
				" gas=" + gas + 
				", contadorAzucar=" + contadorAzucar 
				+ "]";
	}
	
}
