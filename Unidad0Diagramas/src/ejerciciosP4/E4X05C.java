package ejerciciosP4;

import java.util.Scanner;

public class E4X05C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num = 0, numero = 0, numero2 = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Numero " + num + ":");
			numero = teclado.nextInt();		
			num = num +1;
			numero2 = numero2 + numero;	
		}
		System.out.println("Suma : " + numero2);
		teclado.close();
	}

}
