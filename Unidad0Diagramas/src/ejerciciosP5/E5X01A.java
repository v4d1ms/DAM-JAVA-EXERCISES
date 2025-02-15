package ejerciciosP5;

import java.util.Scanner;

public class E5X01A {

	public static void main(String[] args) {
		// creamos un rectangulo con altura y ancho 
		int ancho, altura;
		boolean check = true;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Ancho del Rectangulo? ");
		ancho = teclado.nextInt();
		System.out.print("¿Altura del Rectangulo? ");
		altura = teclado.nextInt();
		
		if (altura < 1) {
			System.err.print("No puede ser un numero negativo o 0\n");
			check = false;
		} 
		
		if (ancho < 1) {
			System.err.print("No puede ser un numero negativo o 0\n");
			check = false;
		}
		
		
		if (check) {
			// definimos el numero de saltos que va a dar
			for (int a = 0; a < altura; a++) {
				// por cada salto imprimimos el numero de * sin saltos de linea
				for (int b = 0; b < ancho; b++) {
					System.out.print("*");
				}
				//al finalizar el loop hacemos un salto de linea
				System.out.print("\n");
			}
		}
	}
}
