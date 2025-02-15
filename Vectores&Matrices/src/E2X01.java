import java.util.Arrays;

import entrada.Teclado;

public class E2X01 {
	
	public static int[][] leerMatriz(int filas,int columnas) {
		int[][] matriz = new int[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int numero = Teclado.leerEntero("Numero " + "(" + i + "," + j + ") : ");
				matriz[i][j] = numero;
			}
		}
		
		return matriz;
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println(Arrays.toString(matriz[i]));
		}
	}
	
	public static int obtenerMax(int[][] matriz) {
		int max = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				max = Math.max(max, matriz[i][j]);
			}
		}
		return max;
	}
	
	public static int obtenerMin(int[][] matriz) {
		int min = matriz[0][0];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				min = Math.min(min, matriz[i][j]);
			}
		}
		return min;
	}
	
	public static String obtenerPrimeraPosicion(int[][] matriz, int numero) {
		int count = 0;
		int fila = 0;
		int columna = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length & count != 1; j++) {
				if (matriz[i][j] == numero) {
					fila = i;
					columna = j;
					count++;
				}
			}
		}
		
		return "(" + fila + "," + columna + ")";
	}
	
	public static void main(String[] args) {
		int[][] matriz = leerMatriz(4, 4);
		
		imprimirMatriz(matriz);
		System.out.println("MAXIMO :" + obtenerMax(matriz));
		System.out.println("MINIMO :" + obtenerMin(matriz));
		System.out.println("POS MAXIMO :" + obtenerPrimeraPosicion(matriz, obtenerMax(matriz)));
		System.out.println("POS MINIMO :" + obtenerPrimeraPosicion(matriz, obtenerMin(matriz)));
	}

}
