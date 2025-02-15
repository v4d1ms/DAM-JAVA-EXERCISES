package P1;

import java.util.Scanner;

public class E1X02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroA, numeroB;
		Scanner teclado = new Scanner(System.in);

		System.out.print("¿Numero A? ");
		numeroA = teclado.nextInt();

		System.out.print("¿Numero B? ");
		numeroB = teclado.nextInt();


		System.out.printf("Numeros pares entre %d y %d => ", numeroA, numeroB);
		for (int a = numeroA; a < numeroB; a++) {
			if (esPar(a)) {
				System.out.print(a + " ");
			}
		}

		System.out.printf("\nNumeros Multiplos de 3 entre %d y %d => ", numeroA, numeroB);
		for (int a = numeroA; a <= numeroB; a++) {
			if (esMultiplo(3, a)) {
				System.out.print(a + " ");
			}
		}

		System.out.printf("\nNumeros Multiplos de 5 entre %d y %d => ", numeroA, numeroB);
		for (int a = numeroA; a <= numeroB; a++) {
			if (esMultiplo(5, a)) {
				System.out.print(a + " ");
			}
		}
		teclado.close();	
	}

	public static boolean esMultiplo(int multiplo, int numero) {
		if (numero % multiplo == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean esPar(int numero) {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
