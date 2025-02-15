package ejercicios;

import java.util.Scanner;

public class E3X07 {

	public static void main(String[] args) {
		// programa que nos dice la nota cualitativa de un modulo
		double nota;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Nota? ");
		nota = teclado.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			if ( nota >= 0 && nota <= 1.5) {
				System.out.print("Muy Deficiente");
			} else if (nota >= 1.5 && nota < 3.5) {
				System.out.print("Deficiente");
			} else if (nota >= 3.5 && nota < 5) {
				System.out.print("Insuficiente");
			} else if (nota >= 5 && nota < 5.5) {
				System.out.print("Suficiente");
			} else if (nota >= 5.5 && nota < 6.5) {
				System.out.print("Bien");
			} else if (nota >= 6.5 && nota < 8.5) {
				System.out.print("Notable");
			} else if (nota >= 8.5 && nota < 10) {
				System.out.print("Sobresaliente");
			} else if (nota == 10) {
				System.out.print("Matricula de honor :)");
			}
		} else {
			System.out.println("La nota debe estar comprendida entre 0 y 10");
		}
		teclado.close();

	}

}
