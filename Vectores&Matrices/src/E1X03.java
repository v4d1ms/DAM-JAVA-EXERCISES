import java.util.Random;

public class E1X03 {

	public static int[] leerVectores(int cantidad, String frase, int tamañoVector) {
		int[] vector = new int[tamañoVector];
		Random ale = new Random();
		for (int i = 0; i < cantidad; i++) {
			vector[i] = ale.nextInt(-100, 101);
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
	
	public static int obtenerNegativos(int[] vector) {
		int negativos = 0;;
		
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] < 0) {
				negativos = negativos + 1;
			}
		}
		return negativos;
	}
	
	public static int obtenerPositivos(int[] vector) {
		int positivos = 0;;
		
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] > 0) {
				positivos = positivos + 1;
			}
		}
		return positivos;
	}
	
	public static int obtenerNeutros(int[] vector) {
		int neutro = 0;;
		
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] == 0) {
				neutro = neutro + 1;
			}
		}
		return neutro;
	}
	
	public static void main(String[] args) {
		int[] vector = leerVectores(15, "Vector", 15);
		int positivos = obtenerPositivos(vector);
		int negativos = obtenerNegativos(vector);
		int neutros = obtenerNeutros(vector);
		
		System.out.println("VECTOR : ");
		imprimirVector(vector);
		System.out.println("Numero de negativos :" + negativos);
		System.out.println("Numero de positivos :" + positivos);
		System.out.println("Numero de neutro :" + neutros);
	}

}
