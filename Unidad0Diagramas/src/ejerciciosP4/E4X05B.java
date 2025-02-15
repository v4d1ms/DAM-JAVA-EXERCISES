package ejerciciosP4;

import java.util.Scanner;

public class E4X05B {

	public static void main(String[] args) {
		int num = 0;
		int numero = 0;
		int numero2 = 0;
		
		Scanner teclado = new Scanner(System.in);
				
		do {
			System.out.println("Numero " + num + ":");
			numero = teclado.nextInt();		
			num = num +1;
			numero2 = numero2 + numero;			
		} while (num < 10);
		
		System.out.println("Suma: " + numero2);
		teclado.close();

	}

}
