package ejercicios;

import java.util.Scanner;

public class E1X08 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double velocidad, aceleracion, tiempo, distancia;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Velocidad Inicial (en metros/segundo)? ");
		velocidad = teclado.nextDouble();
		System.out.print("¿Aceleracion (en metros/segundo)? ");	
		aceleracion = teclado.nextDouble();
		System.out.print("¿Tiempo transcurrido (en metros/segundo)? ");
		tiempo = teclado.nextDouble();
		
		distancia = velocidad * tiempo + 0.5 * aceleracion * (tiempo * tiempo);
		
		System.out.printf("Distancia recorrida: %.3f metros", distancia);
	}

}
