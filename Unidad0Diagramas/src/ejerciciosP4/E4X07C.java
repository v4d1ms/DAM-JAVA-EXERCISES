package ejerciciosP4;

import java.util.Scanner;

public class E4X07C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 0;
		int maximo = 0;
		int minimo = 0;
		int count = 1;
		Scanner teclado = new Scanner(System.in);
		
		
		for (int i = 0; i < 11; i++) {			
			System.out.printf("Numero real %d :", count);
			numero = teclado.nextInt();
			
			if ( numero > maximo) {
				minimo = maximo;
				maximo = numero;
			}
			
			if (minimo > numero) {
				minimo = numero;					
			}			
			count++;
		}
		
		System.out.println("Maximo : " + maximo);
		System.out.println("Minimo : " + minimo);
		teclado.close();
	}
}
