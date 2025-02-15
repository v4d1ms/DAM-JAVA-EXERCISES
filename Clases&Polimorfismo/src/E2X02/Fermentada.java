package E2X02;

import java.util.Random;

public class Fermentada extends Alcoholica{

	private static final String[] nombres = {"sidra", "cerveza", "vino", "sake",
			"hidromiel"};
	
	public Fermentada(String nombre, double graduacion) {
		super(nombre, graduacion);
	}
	
	public static String generarNombre() {
		Random aleatorio = new Random();
		return nombres[aleatorio.nextInt(nombres.length)];
	}
	
	public static double generarGraduacion() {
		Random aleatorio = new Random();
		return aleatorio.nextDouble() * (15-3.5) + 3.5;
	}
	
	public Fermentada() {
		super(generarNombre(), generarGraduacion());
	}
	
	@Override
	public double calcularPrecio() {
		return 5 + (graduacion / 10);
	}

	@Override
	public String toString() {
		return "Fermentada ["
				+ "nombre= " + nombre 
				+ " codigo = " + codigo 
				+ " graduacion =" + graduacion  
				+ "]";
	}
	
	

}
