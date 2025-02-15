package ejerciciosP4;

import java.util.Scanner;

public class E4X09C {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroBB, suma = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Numero Entero A? ");
		numeroA = teclado.nextInt();
		System.out.println("¿Numero Entero B? ");
		numeroB = teclado.nextInt();
		
		if (numeroA < numeroB) {			
			for (int i = numeroB; i >= numeroA; i--) {
				if ( i % 2 == 0) {
					suma = suma + i;
				}
			}
			System.out.printf("Suma de numeros pares comprendidos entre %d y %d : %d", numeroA, numeroB,  suma);
		} else {
			System.err.print("El numero entero A debe ser menor o igual que el numero entero B");
		}
		teclado.close();
	}

}
