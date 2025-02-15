package ejerciciosP4;

import java.util.Scanner;

public class E4X02B {
	public static void main(String[] args) {
		int numero = 6;
		Scanner teclado = new Scanner(System.in);

		while (numero < 1 || numero > 5) {
			System.out.println("Numero: ");
			numero = teclado.nextInt();
		}
		teclado.close();
	}
}
