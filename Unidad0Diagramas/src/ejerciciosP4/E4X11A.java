package ejerciciosP4;

import java.util.Scanner;

public class E4X11A {

	public static void main(String[] args) {
		// Producto de 5 numeros impares a partir de un numero natural
		
		int naturalN;
		int count = 1;
		int multiplicacion = 1;
		int guardarNumero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("¿Numero natural N? ");
		naturalN = teclado.nextInt();
		
		guardarNumero = naturalN;
		
		if (naturalN > 0 && naturalN % 2 !=0 ) {
			while ( count <= 5 ) {
				multiplicacion = multiplicacion * naturalN;
				naturalN = naturalN + 2;
				count++;
			}
			System.out.printf("Producto de 5 numeros Impares a partir de %d : %d", guardarNumero, multiplicacion);
		} else {
			System.out.print("El numero natural N debe ser positivo e impar");
		}
		teclado.close();
	}
}
