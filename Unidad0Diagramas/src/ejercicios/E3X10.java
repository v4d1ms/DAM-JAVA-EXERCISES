package ejercicios;

import java.util.Scanner;

public class E3X10 {

	public static void main(String[] args) {
		// ordenar de mayor a menor 3 numeros
		double a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Numero real A? ");
		a = teclado.nextDouble();
		System.out.print("¿Numero real B? ");
		b = teclado.nextDouble();
		System.out.print("¿Numero real C? ");
		c = teclado.nextDouble();
		
		if (a == b && a == c) {
			System.out.print("Los numeros no pueden ser iguales");
		} else if (a == b || a == c || c == b) {
			System.out.print("Dos numeros no pueden ser iguales");
		} else if ( a > b && a > c) {
			if (b > c) {
				System.out.printf("%.2f < %.2f < %.2f", c, b, a);
			} else {
				System.out.printf("%.2f < %.2f < %.2f", b, c, a);
			}
		} else if ( b > a && b > c) {
			if (a > c) {
				System.out.printf("%.2f < %.2f < %.2f", c, a, b);
			} else {
				System.out.printf("%.2f < %.2f < %.2f", a, c, b);
			}
		} else if ( c > a && c > b) {
			if (a > b) {
				System.out.printf("%.2f < %.2f < %.2f", b, a, c);
			} else {
				System.out.printf("%.2f < %.2f < %.2f", a, b, c);
			}
		}
		teclado.close();
	}
}
