package ejerciciosP4;

import java.util.Scanner;

public class E4X02A {

	public static void main(String[] args) {
		int numero = 6;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Numero: ");
			numero = teclado.nextInt();
		} while (numero < 1 || numero > 5);
		
		teclado.close();	
	}

}
