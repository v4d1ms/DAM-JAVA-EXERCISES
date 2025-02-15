package ejercicios;

import java.util.Scanner;

public class E2X07 {

	public static void main(String[] args) {
		double coeficienteA, coeficienteB, coeficienteC, x1, x2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Coeficiente A? ");
		coeficienteA = teclado.nextDouble();
		System.out.print("¿Coeficiente B? ");
		coeficienteB = teclado.nextDouble();
		System.out.print("¿Coeficiente C? ");
		coeficienteC = teclado.nextDouble();
		
		if ((coeficienteB*coeficienteB) - 4 * (coeficienteA * coeficienteC) > 0) {
			x1 = ((-coeficienteB + Math.sqrt((coeficienteB * coeficienteB) - 4 * (coeficienteA * coeficienteC)))/ (2* coeficienteA));
			x2 = ((-coeficienteB - Math.sqrt((coeficienteB * coeficienteB) - 4 * (coeficienteA * coeficienteC)))/ (2* coeficienteA));
			System.out.println("La ecuacion tiene dos soluciones reales:");
			System.out.printf("X1 = %.1f", x1);
			System.out.printf("X2 = %.1f", x2);
		} else if ((coeficienteB*coeficienteB) - 4 * (coeficienteA * coeficienteC) == 0) {
			x1 = ((-coeficienteB + Math.sqrt((coeficienteB * coeficienteB) - 4 * (coeficienteA * coeficienteC)))/ (2* coeficienteA));
			System.out.println("La ecuacion tiene una unica solucion real:");
			System.out.printf("X1 = %.1f", x1);
		} else {
			System.out.println("La ecuacion no tiene ninguna solucion real.");
		}
		teclado.close();
	}
}
