package ejerciciosP4;

import java.util.Scanner;

public class E4X13A {

	public static void main(String[] args) {
		// Lee 10 numeros , positivos e negativos y hace una media aritmetica de estos por separado
		double negativos = 0;
		double positivos = 0;
		int cuentaNegativos = 0;
		int cuentaPositivos = 0;
		int cuentaCeros = 0;
		
		for (int numero = 0; numero < 10; numero++) {
			Scanner teclado = new Scanner(System.in);
			System.out.printf("¿Numero Entero %d? ", numero);
			int entero = teclado.nextInt();
			
			if (entero < 0) {
				negativos = negativos + entero;
				cuentaNegativos++;
			} else if (entero == 0) {
				cuentaCeros++;
			} else {
				positivos = positivos + entero;
				cuentaPositivos++;
			}
		}
		
		if (cuentaCeros == 10) {
			System.out.printf("Numero de Ceros : %d\n", cuentaCeros);
			System.out.println("No hay media aritmetica de numeros positivos");
			System.out.println("No hay media aritmetica de numeros negativos");
		} else {			
			System.out.printf("Numero de Ceros : %d\n", cuentaCeros);
			System.out.printf("Media Aritmetica de Numeros Positivos : %.1f\n", positivos / cuentaPositivos);
			System.out.printf("Media Aritmetica de Numeros Negativos : %.1f", negativos / cuentaNegativos);
		}
	}
}
