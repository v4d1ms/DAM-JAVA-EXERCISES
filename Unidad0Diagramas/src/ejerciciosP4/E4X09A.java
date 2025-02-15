package ejerciciosP4;

import java.util.Scanner;

public class E4X09A {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroBB, suma = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Numero Entero A? ");
		numeroA = teclado.nextInt();
		System.out.println("¿Numero Entero B? ");
		numeroB = teclado.nextInt();
		
		numeroBB = numeroB;
		
		if (numeroA < numeroB ) {
			while (numeroB >= numeroA) {
				if (numeroB % 2 == 0) {
					suma = suma + numeroB;
				}
				numeroB--;
			}
			System.out.printf("Suma de numeros Pares comprendidos entre %d y %d : %d", numeroA, numeroBB, suma);
		} else {
			System.err.print("El numero entero A debe ser menor o igual que el numero enteroB");
		}
		teclado.close();
	}
}
