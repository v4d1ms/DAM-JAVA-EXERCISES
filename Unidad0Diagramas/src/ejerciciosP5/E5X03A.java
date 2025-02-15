package ejerciciosP5;

import java.util.Scanner;

public class E5X03A {

	public static void main(String[] args) {
		int altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Altura Triangulo? ");
		altura = teclado.nextInt();
		
		if (altura > 0) {			
			// hacemos una cuenta de la altura , por cada numero hace un salto
			for (int a = 1; a <= altura; a++) {
				
				// hacemos un bucle que coge el valor de a y lo compara con la altura, agrega lo restante con espacios
				for (int b = a; b < altura; b++) {
					System.out.print(" ");
				}
				
				// declaramos otro for con una variable c, comprueba si c es menor que a y lo completa con *
				for (int c = 0; c < a; c++) {
					System.out.print("*");
				}
				
				System.out.print("\n");
			}
		} else {
			System.err.println("La altura del triangulo debe ser positiva");
		}
	}
}
