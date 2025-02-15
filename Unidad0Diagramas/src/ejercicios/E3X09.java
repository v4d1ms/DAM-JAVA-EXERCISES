package ejercicios;

import java.util.Scanner;

public class E3X09 {

	public static void main(String[] args) {
		// 3 numeros reales y te dice cual es el mayor y el menor
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
		} else if ( a > b && a > c) { // comprobamos si a es mayor que todos
			System.out.printf("Maximo: %.2f\n", a);
			if (b > c) { // comprobamos si b es mayor que c
				System.out.printf("Minimo: %.2f ", c);
			} else {
				System.out.printf("Minimo: %.2f ", b);
			}
		} else if ( b > a && b > c) { // comprobamos si b es mayor que todos
			System.out.printf("Maximo: %.2f\n", b);
			if (a > c) { // comprobamos si a es mayor que c
				System.out.printf("Minimo: %.2f", c);
			} else {
				System.out.printf("Minimo: %.2f", a);
			}
		} else if ( c > a && c > b) { // comprobamos si c es mayor que todos
			System.out.printf("Maximo: %.2f\n", c);
			if (a > b) { // comprobamos si a es mayor que b
				System.out.printf("Minimo: %.2f", b);
			} else {
				System.out.printf("Minimo: %.2f", a);
			}
		}
		teclado.close();
	}
}
