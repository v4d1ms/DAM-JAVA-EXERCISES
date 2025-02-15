package ejerciciosP4;

import java.util.Scanner;

public class E4X08B {

	public static void main(String[] args) {
		int numero = 0;
		int numeroPar = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.printf("¿Numero natural N? ");
		numero = teclado.nextInt();
		int guardarNumero = numero;
		
		if (numero < 0) {
			System.err.print("El numero natural N debe ser positivo");
		} else {
			
			do {
				
				if ((numero % 2) != 0) {
					numeroPar = numeroPar + numero;
				}
				
				numero--;
				
			} while (numero != 0);
			
			System.out.printf("Suma de Numeros Impares menores o iguales que %d : %d", guardarNumero, numeroPar);
		
		}
		
		teclado.close();
	
	}
}
