import entrada.Teclado;

public class E1X01 {

	public static int[] leerVectores(int cantidad, String frase, int tamañoVector) {
		int[] vector = new int[tamañoVector];
		
		for (int i = 0; i < cantidad; i++) {
			int numero = Teclado.leerEntero(frase + i + " : ");
			vector[i] = numero;
		}
		
		return vector;
	}
	
	public static int obtenerMinimo(int[] vector) {
		int minimo = vector[0];
		for (int i = 0; i < vector.length -1; i++) {
			minimo = Math.min(minimo, vector[i + 1]);
		}
		return minimo;
	}
	
	public static int obtenerMaximo(int[] vector) {
		int maximo = vector[0];
		for (int i = 0; i < vector.length -1; i++) {
			maximo = Math.max(maximo, vector[i + 1]);
		}
		return maximo;
	}
	
	public static int obtenerPosicion(int[] vector, int numero) {
		int posicion = -1;
		for (int i = 0; i < vector.length && posicion == -1; i++) {
			if (vector[i] == numero) {
				posicion = i;
			}
		}
		return posicion;
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
		int[] vector = leerVectores(10, "Numero", 10);
		int minimo = obtenerMinimo(vector);
		int maximo = obtenerMaximo(vector);
		int posicionMin = obtenerPosicion(vector, minimo);
		int posicionMax = obtenerPosicion(vector, maximo);
		
		System.out.println("Vector : ");
		imprimirVector(vector);
		System.out.println("Minimo :" + minimo);
		System.out.println("Posicion minimo: " + posicionMin);
		System.out.println("Maximo :" + maximo);
		System.out.println("Posicion minimo: " + posicionMax);
	}
}
