import java.util.Random;

import entrada.Teclado;

public class E2X03 {

	
	public static int[][] rellenar(int longitud, int min, int max) {
		int[][] matriz = new int[longitud][longitud];
		Random ale = new Random();
		for (int i = 0; i < longitud; i++) {
			for (int j = 0; j < longitud; j++) {
				int numero = ale.nextInt(min, max);
				matriz[i][j] = numero;
			}
		}
		return matriz;
	}
	
	public static int leerFila(String frase, int min, int max) {
		int fila = Teclado.leerEntero(frase);
		
		while (fila < min || fila > max) {
			System.out.println("La fila debe estar comprendida entre 0 y 7.");
			fila = Teclado.leerEntero(frase);
		}
		
		return fila;
	}
	
	public static void imprimirPorDigitos(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matriz[i].length; j++) {				
				System.out.printf("%3d", matriz[i][j]);
			}
			System.out.print("]");
 			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("MATRIZ ANTES DE INTERCAMBIAR DOS FILAS :");
		
		int[][] matriz = rellenar(8, 1, 101);
		imprimirPorDigitos(matriz);
		
		int fila1 = leerFila("Fila 1:", 0, 7);
		int fila2 = leerFila("Fila 2:", 0, 7);
		
		int[] backup = matriz[fila1];
		matriz[fila1] = matriz[fila2];
		matriz[fila2] = backup;
		
		System.out.println("CONVERSION :");
		imprimirPorDigitos(matriz);
	}
}
