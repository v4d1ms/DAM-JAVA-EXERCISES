package ejercicios;
import java.util.Scanner;

public class E2X05 {
	public static void main(String[] args) {
		// TODO Programa que pide 3 numeros por consola y te devuelve el numero mayor , pero no puede repetirse ningun numero
		double numeroA, numeroB, numeroC;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero Real A: ");
		numeroA = teclado.nextDouble();
		System.out.print("Numero Real B: ");
		numeroB = teclado.nextDouble();
		System.out.print("Numero Real C: ");
		numeroC = teclado.nextDouble();
		
//		Comprobamos si el numero A es igual al resto para saber si son iguales los 3 numeros
		if (numeroA == numeroB && numeroA == numeroC) {
			System.err.print("Los numeros son iguales");
//		Comprobamos si algun numero se repite , para ello usamos la funcion or
		} else if (numeroA == numeroB || numeroA == numeroC || numeroB == numeroC) {
			System.err.print("No pueden repetirse dos numeros");
		} else if (numeroA > numeroB && numeroA > numeroC) {
			System.out.printf("El numero %.2f es mayor", numeroA);
		} else if (numeroB > numeroA && numeroB > numeroC) {
			System.out.printf("El numero %.2f es mayor", numeroB);
		} else if (numeroC > numeroA && numeroC > numeroB) {
			System.out.printf("El numero %.2f es mayor", numeroC);
		}
		teclado.close();
	}
}