package P1;

import java.util.Scanner;

public class E1X05 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Numero (0 para salir)? ");
		numero = teclado.nextInt();

		while (numero != 0) {			
			System.out.println("\n" + "El numero " + numero + " tiene " + contarNumeroDivisores(numero) + " divisores.");			
			System.out.print("¿Numero (0 para salir)? ");
			numero = teclado.nextInt();
		}
		teclado.close();
	}

	public static int contarNumeroDivisores(int entero) {
		int cuentaDivisores = 0;
		System.out.printf("Divisores del numero %d:\n", entero);
		for (int a = 1; a <= entero; a++) {
			if ( entero % a == 0 ) {
				cuentaDivisores++;
				System.out.print(a + " ");
			}
		}
		
		return cuentaDivisores;
	}
}