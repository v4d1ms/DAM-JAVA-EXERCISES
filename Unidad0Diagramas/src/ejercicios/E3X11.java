package ejercicios;

import java.util.Scanner;

public class E3X11 {

	public static void main(String[] args) {
		// Pedir un numero por teclado y pasarlo a letras
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero : ");
		int numero = teclado.nextInt();
		
		switch (numero) {
			case 1:
				System.out.print("uno");
				break;
			case 2:
				System.out.print("dos");
				break;
		}
		teclado.close();
	}
}
