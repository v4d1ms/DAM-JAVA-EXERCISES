import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class E1X08 {
	
	public static int obtenerMinimo(int[] vector) {
		int minimo = vector[0];
		for (int i = 0; i < vector.length - 1; i++) {
			minimo = Math.min(minimo, vector[i + 1]);
		}
		return minimo;
	}
	
	public static int obtenerMaximo(int[] vector) {
		int maximo = vector[0];
		for (int i = 0; i < vector.length - 1; i++) {
			maximo = Math.max(maximo, vector[i + 1]);
		}
		return maximo;
	}
	
	public static int[] ordenarPorInsercion(int[] vector) {
		int[] orden = new int[vector.length];
		int cuenta = 0;
		
		for (int i = obtenerMinimo(vector); i <= obtenerMaximo(vector); i++) {
			for (int j = 0; j < vector.length; j++) {
				if (i == vector[j]) {
					orden[cuenta] = i;
					cuenta += 1;
				}
			}
		}
		return orden;
	}
	
	public static int[] rellenar(int longitud) {
		int[] vector = new int[longitud];
		Random ale = new Random();
		for (int i = 0; i < vector.length; i++) {
			vector[i] = ale.nextInt(-10, 11);
		}
		return vector;
	}
	
	public static void main(String[] args) {
		int tamaño = Teclado.leerEntero("¿ Capacidad ? ");
		int[] vector = rellenar(tamaño);
		System.out.println("VECTOR SIN ORDENAR:");
		System.out.println(Arrays.toString(vector));
		System.out.println("VECTOR ORDENADO:");
		vector = ordenarPorInsercion(vector);
//		System.out.println(Arrays.toString(vector));
//		Arrays.sort(vector);
		System.out.println(Arrays.toString(vector));
 	}
}