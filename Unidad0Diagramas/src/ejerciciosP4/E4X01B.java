package ejerciciosP4;

import java.util.Scanner;

public class E4X01B {

	public static void main(String[] args) {
		int numero = 1;
		Scanner teclado = new Scanner(System.in);

		do{
			System.out.println("Introduce un numero :");
			numero = teclado.nextInt();	
		} while (numero != 0);
		teclado.close();
	}
}
