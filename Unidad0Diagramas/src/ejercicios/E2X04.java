package ejercicios;
import java.util.Scanner;

public class E2X04 {

	public static void main(String[] args) {
		double numeroA, numeroB;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero real A? ");
		numeroA = teclado.nextDouble();
		System.out.print("Numero real B? ");
		numeroB = teclado.nextDouble();

		if (numeroA > numeroB) {
			System.out.printf("El numero real %.2f es mayor", numeroA);
		} else if (numeroB > numeroA) {
			System.out.printf("El numero real %.2f es mayor", numeroB);
		} else {
			System.out.printf("Los dos numeros reales %.2f y %.2f son iguales.", numeroA , numeroB);
		}
		teclado.close();
	}

}
