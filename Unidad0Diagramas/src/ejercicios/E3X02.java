package ejercicios;

import java.util.Scanner;

public class E3X02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Mes? ");
		mes = teclado.nextInt();
		
		switch(mes) {
			case 1:
				System.out.println("31 dias");
				break;
			case 2:
				System.out.println("28 dias");
				break;
			case 3:
				System.out.println("31 dias");
				break;
			case 4:
				System.out.println("30 dias");
				break;
			case 5:
				System.out.println("31 dias");
				break;
			case 6:
				System.out.println("30 dias");
				break;
			case 7:
				System.out.println("31 dias");
				break;
			case 8:
				System.out.println("31 dias");
				break;
			case 9:
				System.out.println("30 dias");
				break;
			case 10:
				System.out.println("31 dias");
				break;
			case 11:
				System.out.println("30 dias");
				break;
			case 12:
				System.out.println("31 dias");
				break;
			default:
				System.err.print("El mes debe estar comprendido entre 1 - 12");
		}
		teclado.close();
	}
}
