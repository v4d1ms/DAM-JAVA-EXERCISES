package ejerciciosP4;

import java.util.Scanner;

public class E4X07B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		int maximo = 0;
		int minimo = 0;
		int count = 1;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.printf("Numero real %d :", count);
			numero = teclado.nextInt();

			if ( numero > maximo) {
				maximo = numero;
			}
			
			if (minimo > numero) {
				minimo = numero;					
			} 
			
			count = count +1;
			
		} while (count < 11);
		
		System.out.println("Maximo : " + maximo);
		System.out.println("Minimo : " + minimo);
		teclado.close();
	}
}
