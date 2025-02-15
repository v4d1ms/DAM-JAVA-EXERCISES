import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class E1X06 {
	
	public static int[] rellenar(int longitud, int min, int max) {
		int[] vector = new int[longitud];
		Random ale = new Random();
		for (int i = 0; i < vector.length; i++) {
			vector[i] = ale.nextInt(min, max);
		}
		return vector;
	}
	
	public static int[] fusionar(int[] vectorA, int[] vectorB) {
		int[] fusion = new int[vectorA.length + vectorB.length];
		int number = 0;
		
		for (int i = 0; i < vectorA.length; i++) {
			fusion[i] = vectorA[i];
		}
		
		for (int j = vectorA.length; j < fusion.length; j++) {
			fusion[j] = vectorB[number];
			number++;
		}
		
		return fusion;
	}
 
	public static void main(String[] args) {
		int capacidadA = Teclado.leerEntero("Capacidad A?: " );
		int capacidadB = Teclado.leerEntero("Capacidad B?: " );
		int[] vecA = rellenar(capacidadA, -1000, 1001);
		int[] vecB = rellenar(capacidadB, -1000, 1001);
		System.out.println("VECTOR A:");
		System.out.println(Arrays.toString(vecA));
		System.out.println("VECTOR B:");
		System.out.println(Arrays.toString(vecB));
		System.out.println("VECTOR FUSIONADO:");
		System.out.println(Arrays.toString(fusionar(vecA, vecB)));

	}
}
