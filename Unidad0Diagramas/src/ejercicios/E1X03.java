package ejercicios;
import java.util.Scanner;

public class E1X03 {
	public static void main(String[] args) {
		// pide 2 numeros y los cambia de posicion
		int numeroA, numeroB, ultimoA;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Escribe el numero A: ");
		numeroA = teclado.nextInt();
		System.out.printf("Escribe el numero B: ");
		numeroB = teclado.nextInt();
		
		System.out.println("ANTES DEL INTERCAMBIO:");
		System.out.printf("A = %d B = %d\n", numeroA, numeroB);
		System.out.println("DESPUES DEL INTERCAMBIO:");
		ultimoA = numeroA;
		numeroA = numeroB;
		numeroB = ultimoA;
		System.out.printf("A = %d B = %d\n", numeroA, numeroB);
	}
}
