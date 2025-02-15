package ejercicios;

import java.util.Scanner;

public class E3X04 {

	public static void main(String[] args) {
		// creamos un programa que reste 1s a la hora que tu le des , si todos los valores son 0 tira un error , 
		// si todos los valores son -0 tira otro error
		Scanner teclado = new Scanner(System.in);
		int hora, minutos, segundos, h, m, s;
		boolean validado, hms;
		System.out.print("¿Horas? ");
		hora = teclado.nextInt();
		System.out.print("¿Minutos? ");
		minutos = teclado.nextInt();
		System.out.print("¿Segundos? ");
		segundos = teclado.nextInt();

		validado = false;
		hms = true;
		
		h = hora;
		m = minutos;
		s = segundos;
		
		if (segundos == 0 && minutos == 0 && hora == 0) {
			System.out.println("El tiempo debe ser igual o superior a 1");
			hms = false;
		}
		
		if (hms) {
			if (segundos <= 59 && segundos >= 0) {
				validado = true;
			} else if (segundos < 0) {
				System.err.print("Los segundos deben estar comprendidas entre 0 y 59.\n");
				validado = false;
			}
			
			if (minutos <= 59 && minutos >= 0) {
				validado = true;
			} else if (minutos < 0) {
				System.err.print("Los minutos deben estar comprendidas entre 0 y 59.\n");
				validado = false;
			}
			
			if (hora <= 23 && hora >= 0) {
				validado = true;
			} else if (hora < 0){
				System.err.print("Las horas deben estar comprendidas entre 0 y 23.\n");
				validado = false;
			}
			
			if (validado) {
				
				if (segundos < 60 && segundos > 0) {
					segundos = segundos - 1;
				} else if (segundos == 0 && minutos != 0) {
					minutos = minutos -1;
					segundos = 59;
				}
				
				if (minutos == 0 && segundos == 0) {
					hora = hora - 1;
					minutos = 59;
					segundos = 59;
				}
				
				System.out.printf("%dh %dm %ds - 1s = %d horas %d minutos %d segundos", h, m, s, hora, minutos, segundos);
			}
		}
		teclado.close();
	}
}
