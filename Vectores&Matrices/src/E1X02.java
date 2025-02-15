import entrada.Teclado;

public class E1X02 {

	public static int[] leerVectores(int cantidad, String frase, int tamañoVector) {
		int[] vector = new int[tamañoVector];
		
		for (int i = 0; i < cantidad; i++) {
			int numero = Teclado.leerEntero(frase + " : ");
			vector[i] = numero;
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
	
	public static int[] sumarVectores(int[] vectorA, int[] vectorB, int tamañoVector) {
		int[] suma = new int[tamañoVector];
		
		for (int i = 0; i < vectorA.length; i++) {
			suma[i] = vectorA[i] + vectorB[i];
		}
		
		return suma;
	}
	
	public static int[] productoVectores(int[] vectorA, int[] vectorB, int tamañoVector) {
		int[] suma = new int[tamañoVector];
		
		for (int i = 0; i < vectorA.length; i++) {
			suma[i] = vectorA[i] * vectorB[i];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		int[] vectorA = leerVectores(10, "VectorA ", 10);
		int[] vectorB = leerVectores(10, "VectorB ", 10);
		System.out.println("Vector A:");
		imprimirVector(vectorA);
		System.out.println("Vector B:");
		imprimirVector(vectorB);
		System.out.println("Vector Suma: ");
		imprimirVector(sumarVectores(vectorA, vectorB, 10));
		System.out.println("Vector Producto: ");
		imprimirVector(productoVectores(vectorA, vectorB, 10));	
	}
}
