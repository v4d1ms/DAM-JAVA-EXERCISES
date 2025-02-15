package P1;

import java.util.Scanner;

public class E1X06 {

	public static void main(String[] args) {
		int nInicial, nFinal, cuenta = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Numero inicial? ");
		nInicial = teclado.nextInt();
		System.out.print("¿Numero final? ");
		nFinal = teclado.nextInt();
		for (int a = nInicial; a < nFinal; a++) {			
			if (esPrimo(a)) {
				System.out.print(a + " ");
				cuenta++;
			}
		}
		System.out.println("\nNumeros primos: " + cuenta);
		teclado.close();
	}
	
	public static int contarNumeroDivisores(int numero) {
		int cuenta = 0;
		for (int a = 1; a <= numero; a++) {
			if (numero % a == 0) {
				cuenta++;
			}
		}
		return cuenta;
	}
	
	public static boolean esPrimo(int numero) {
		if (contarNumeroDivisores(numero) == 2) {
			return true;
		} else {			
			return false;
		}
	}
}
