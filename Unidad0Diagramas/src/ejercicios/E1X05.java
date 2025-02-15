package ejercicios;
import java.util.Scanner;

public class E1X05 {
	public static void main(String[] args) {
		double numeroA, numeroB;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Numero real A? ");
		numeroA = teclado.nextDouble();
		System.out.print("¿Numero real B? ");
		numeroB = teclado.nextDouble();
		System.out.println("NUMEROS CON 2 DIGITOS DECIMALES");
		System.out.printf("A = %.2f\n", numeroA);
		System.out.printf("B = %.2f\n", numeroB);
		System.out.println("NUMEROS CON 1 DIGITO DECIMALES");
		System.out.printf("A = %.1f\n", numeroA);
		System.out.printf("B = %.1f\n", numeroB);
		System.out.println("NUMEROS CON NINGUN DECIMALES");
		System.out.printf("A = %.0f\n", numeroA);
		System.out.printf("B = %.0f\n", numeroB);
	}
}
