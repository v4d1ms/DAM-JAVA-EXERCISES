package ejerciciosP4;

import java.util.Scanner;

public class E4X06A {

	public static void main(String[] args) {
		double numero;
		double numeros = 0;
		double count = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Numero entero (0 para salir)? ");

		numero = teclado.nextDouble();

		if (numero != 0) {			
			while(numero > 0) {
				count = count + 1;
				numeros = numeros + numero;
				System.out.println("¿Numero entero (0 para salir)? ");
				numero = teclado.nextDouble();			
			}
			System.out.println("Resultado Aritmetico: " +  numeros / count);
		} else {
			System.out.println("No hay media aritmetica.");
		}
		teclado.close();
	}
}
