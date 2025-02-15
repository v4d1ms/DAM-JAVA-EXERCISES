import java.util.Random;

public class E1X05 {
	
	public static int[] leerVectores(int cantidad) {
		int[] vector = new int[cantidad];
		Random ale = new Random();
		for (int i = 0; i < cantidad; i++) {
			vector[i] = ale.nextInt(1, 6);
		}
		return vector;
	}

	public static void imprimirVector(int[] vector) {
		System.out.print("[");
		for (int i = 0; i < vector.length; i++) {
			if (i == vector.length - 1) {
				System.out.print(vector[i]);				
			} else {
				System.out.print(vector[i] + ", ");
			}
		}
		System.out.print("]\n");
	}
	
	public static void main(String[] args) {
		int[] vectorA = leerVectores(8);
		int[] vectorB = leerVectores(8);
		
		imprimirVector(vectorA);
		imprimirVector(vectorB);
		
		for (int i = 0; i < vectorA.length; i++) {
			int cuenta = 0;
			for (int j = 0; j < vectorB.length; j++) {
				if (vectorA[i] == vectorB[j]) {
					cuenta++;
				}
			}
			System.out.println("El elemento en la posicion " + i + " del vector A aparece " + 
			cuenta + " veces en el vector B");
		}
	}
}
