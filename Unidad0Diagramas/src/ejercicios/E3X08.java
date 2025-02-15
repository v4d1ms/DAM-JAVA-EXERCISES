package ejercicios;

import java.util.Scanner;

public class E3X08 {

	public static void main(String[] args) {
		// programa que nos dice los tipos de triangulo
		double a, b, c;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Logitud del lado A?");
		a = teclado.nextDouble();
		System.out.print("¿Logitud del lado B?");
		b = teclado.nextDouble();
		System.out.print("¿Logitud del lado C?");
		c = teclado.nextDouble();

		if ((a + b) > c) {
			if (a == c && a == b) {
				System.out.print("Triangulo Equilatero.");
			} else if (a == b || b == c) {
				System.out.print("Triangulo Isosceles.");
			} else {
				System.out.print("Triangulo Escaleno.");
			}
		} else {
			System.err.print("La suma de los lados debe ser mayor que el tercer lado..");
		}
		teclado.close();
	}

}
