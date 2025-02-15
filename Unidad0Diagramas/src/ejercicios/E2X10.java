package ejercicios;

import java.util.Scanner;

public class E2X10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Numero del dia? ");
		dia = teclado.nextInt();
		switch (dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sabado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Esto no es un dia valido");
				break;
		}
		teclado.close();
	}

}
