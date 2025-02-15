package ejerciciosP4;

import java.util.Scanner;

public class E4X01A {

	public static void main(String[] args) {
		int numero = 1;
		Scanner teclado = new Scanner(System.in);

		while (numero != 0) {
			System.out.println("Introduce un numero :");
			numero = teclado.nextInt();	
		}
		
		teclado.close();
	}
}
