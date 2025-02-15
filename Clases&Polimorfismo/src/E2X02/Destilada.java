package E2X02;

import java.util.Random;

public class Destilada extends Alcoholica{

	
	protected static final String[] NOMBRES = {"anís", "pacharán", "ginebra", "cognac",
			"ron", "vodka", "whisky", "tequila"}; 
	
	public Destilada(String nombre, double graduacion) {
		super(nombre, graduacion);
	}
	
	@Override
	public double calcularPrecio() {
		return 12 + (graduacion / 10);
	}

	public static String generarNombre() {
		Random aleatorio = new Random();
		return NOMBRES[aleatorio.nextInt(NOMBRES.length)];
	}
	
	public static double generarGraduacion() {
		Random aleatorio = new Random();
		return aleatorio.nextDouble() * (45-15) + 15;
	}
	
	public Destilada() {
		super(generarNombre(), generarGraduacion());
	}
	
	
	@Override
	public String toString() {
		return "Destilada ["
				+ "nombre= " + nombre 
				+ " codigo = " + codigo 
				+ " graduacion =" + graduacion  
				+ "]";
	}

	
	
	
}
