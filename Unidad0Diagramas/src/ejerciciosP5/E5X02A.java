package ejerciciosP5;

import java.util.Scanner;

public class E5X02A {

	public static void main(String[] args) {
		// Generamos un triangulo
		int altura;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Altura del triangulo? ");
		altura = teclado.nextInt();
		
		if (altura < 0) {
			System.out.println("La altura del triangulo debe ser positiva");
		} else {
			// creamos un for para imprimir la altura
			for (int a = 0; a < altura; a++) {
				// dentro del for metemos otro for que comprueba el valor de a para saber cuantos asteriscos imprimir
				for (int b = 0; b <= a ; b++) {
					System.out.print("*");
				}
				// cuando acaba el for imprime un salto de linea
				System.out.print("\n");
			}
		}
		
	}

}
