import java.util.Random;

public class E2X02 {

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
	
	
	public static void main(String[] args) {
		int[][] matriz = rellenar(8, 1, 101);
		
		System.out.println("MATRIZ: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print("]");
			System.out.println();
		}
		
		System.out.println("SUMAS:");
		
		for (int i = 0; i < matriz.length; i++) {
			int suma = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
			System.out.println("Suma columna " + i + ": " + suma);
			
		} 
		
		for (int i = 0; i < matriz.length; i++) {
			int sumafilas = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				sumafilas += matriz[j][i];
			}
			System.out.println("Suma filas " + i + ": " + sumafilas);
		}

	}

}
