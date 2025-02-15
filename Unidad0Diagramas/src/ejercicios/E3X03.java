package ejercicios;

import java.util.Scanner;

public class E3X03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora, minutos, segundos, dia, h, m, s;
		boolean validados;
		System.out.print("¿Horas? ");
		hora = teclado.nextInt();
		System.out.print("¿Minutos? ");
		minutos = teclado.nextInt();
		System.out.print("¿Segundos? ");
		segundos = teclado.nextInt();
		
		dia = 0;

		validados = true;
		
		h = hora;
		m = minutos;
		s = segundos;
		
		if (segundos <= 59 && segundos > 0) {
			validados = true;			
		} else {
			validados = false;	
			System.err.print("Los segundos deben estar comprendidas entre 0 y 59.\n");
		}
		
		if (minutos <= 59 && minutos > 0) {
			validados = true;
		} else {
			validados = false;	
			System.err.print("Los minutos deben estar comprendidas entre 0 y 59.\n");
		}
		
		if (hora <= 23 && minutos > 0) {
			validados = true;
		} else {
			validados = false;	
			System.err.print("Las horas deben estar comprendidas entre 0 y 23.\n");
		}
		
		if (validados) {
			segundos = segundos + 1;
			
			if (segundos == 60) {
				minutos = minutos + 1;
				segundos = 0;
			} else {
				segundos = segundos +1;
			}
			
			if (minutos == 60) {
				hora = hora + 1;
				minutos = 0;
			}

			if (hora == 24) {
				dia = dia + 1;
				hora = 0;
				minutos = 0;
				segundos = 0;
			}
			
			if (dia !=0) {
				System.out.printf("%dh %dm %ds + 1s = %d dias %d horas %d miuntos %d segundos", h, m, s, dia, hora, minutos, segundos);
			} else {				
				System.out.printf("%dh %dm %ds + 1s = %d horas %d minutos %d segundos", h, m, s, hora, minutos, segundos);
			}
		}
		teclado.close();
	}
}
