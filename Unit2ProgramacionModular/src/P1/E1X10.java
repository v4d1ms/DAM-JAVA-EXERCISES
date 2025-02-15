package P1;

import java.util.Scanner;

public class E1X10 {

	public static void main(String[] args) {
		int conductores; 
		double tiempoHoras;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Numero de Conductores? ");
		conductores = teclado.nextInt();
		
		for (int a = 1; a <= conductores; a++) {
			System.out.println("CONDUCTOR " + a);
			System.out.println("¿Tiempo en horas? ");
			tiempoHoras = teclado.nextDouble();
			if (tiempoHoras <= 24 && tiempoHoras > 0) {				
				System.out.println("Cargo por estacionar: " + calcularCargoEstacionar(tiempoHoras) + " euros.");
			} else {
				System.out.println("El tiempo debe estar comprendido entre 0 y 24.");
			}
		}
		teclado.close();
	}
	
	public static double calcularCargoEstacionar(double horas) {		
		double cargo = 0;
		if (horas < 24) {			
			if (horas <= 3 && horas > 0) {
				cargo = 2.00;
			} else {
				cargo = 2.00;
				for (double a = 3; a < horas; a++) {
					cargo = cargo + 0.50;
				}
			}
		} else {
			cargo = 10.00;
		}
		return cargo; 
	}
}
