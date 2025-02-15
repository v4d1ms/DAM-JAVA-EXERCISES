package ejercicios;

import java.util.Scanner;

public class E3X06 {

	public static void main(String[] args) {
		// programa que nos dice la calidad del aire (ICA)
		int ica;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Indice de calidad de aire? ");
		ica = teclado.nextInt();
		
		if (ica >= 0 && ica <= 500) {
			if ( ica >= 0 && ica <= 50) {
				System.out.print("Bueno");
			} else if (ica >= 51 && ica <= 100) {
				System.out.print("Moderado");
			} else if (ica >= 101 && ica <= 150) {
				System.out.print("No saludable para grupos sensibles");
			} else if (ica >= 151 && ica <= 200) {
				System.out.print("No saludable para todos");
			} else if (ica >= 201 && ica <= 300) {
				System.out.print("Insalubre");
			} else if (ica >= 301 && ica <= 500) {
				System.out.print("Peligroso");
			}
		} else {
			System.out.println("El indice de calidad del aire debe estar comprendido entre 0 y 500");
		}
		teclado.close();
	}
}
