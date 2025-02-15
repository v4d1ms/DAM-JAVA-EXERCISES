package ejercicios;
import java.util.Scanner;


public class E1X04 {

	// pide 2 numeros y hace diferentes operaciones
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		double numeroA, numeroB;
		
		System.out.print("Escribe el numero real A: ");
		numeroA = teclado.nextDouble();
		System.out.print("Escribe el numero real B: ");
		numeroB = teclado.nextDouble();
		
		System.out.printf("%.1f + %.1f = %.1f", numeroA , numeroB, (numeroA + numeroB));
		System.out.printf("\n%.1f - %.1f = %.1f", numeroA , numeroB, (numeroA - numeroB));
		System.out.printf("\n%.1f * %.1f = %.2f", numeroA , numeroB, (numeroA * numeroB));
		System.out.printf("\n%.1f / %.1f = %.16f", numeroA , numeroB, (numeroA / numeroB));
	}
}
