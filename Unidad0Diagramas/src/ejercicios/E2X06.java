package ejercicios;

import java.util.Scanner;

public class E2X06 {

	public static void main(String[] args) {
		// TODO Conversion de segundos a horas, minutos y segundos
		Scanner teclado = new Scanner(System.in);
		int segundos, convSegundos, convMinutos, convHoras;
		System.out.print("Cuantos segundos quieres convertir ? ");
		segundos = teclado.nextInt();
		if (segundos < 0) {
			System.err.print("No puedes poner numeros negativos");
		} else {
			convHoras = (segundos / 3600);
			convMinutos = ((segundos  - (convHoras * 3600)) / 60);
			convSegundos = ((segundos  - (convHoras * 3600)) - (convMinutos * 60));
			System.out.printf("%d horas %d minutos %d segundos", convHoras, convMinutos, convSegundos);
		}
		teclado.close();
	}
}
