package ejerciciosP4;

import java.util.Scanner;

public class E4X08C {

	public static void main(String[] args) {
		int numero = 0;
		int numeroPar = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.printf("¿Numero natural N? ");
		numero = teclado.nextInt();
		
		for ( int i = 0; i < numero; i++) {
			if ((i % 2) != 0 ) {
				numeroPar = numeroPar + i;
			}
		}

		System.out.printf("Suma de Numeros Impares menores o iguales que %d : %d", numero, numeroPar);
		
		teclado.close();
	
	}
}
