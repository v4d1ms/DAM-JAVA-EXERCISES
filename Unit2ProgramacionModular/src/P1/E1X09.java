package P1;

import java.util.Scanner;

public class E1X09 {

	public static void main(String[] args) {
		// Sacar minimo comun multiplo y maximo comun divisor de 2 numeros
		int numeroA, numeroB, procesar=1;
		do {
			Scanner teclado = new Scanner(System.in);
			System.out.print("¿ Primer Numero ? ");
			numeroA = teclado.nextInt();
			System.out.print("¿ Segundo Numero ? ");
			numeroB = teclado.nextInt();
			
			if (numeroA > 0 & numeroB > 0) {
				int maximoComunDivisor = calcularMaximoComunDivisor(numeroA, numeroB);
				int minimoComunMultiplo =  calcularMiniComunMultiplo(numeroA, numeroB);
				System.out.printf("Maximo comun divisor de %d y %d : %d\n", numeroA, numeroB, maximoComunDivisor);
				System.out.printf("Minimo comun multiplo de %d y %d : %d\n", numeroA, numeroB, minimoComunMultiplo);
			} else {
				System.out.println("Los numeros deben ser positivos");
			}
			System.out.print("¿Desea procesar otro par de numeros (0 para salir)? ");
			procesar = teclado.nextInt();
		} while (procesar != 0);
	}
	
	public static int calcularMaximoComunDivisor(int numA, int numB) {
		int maximo = 0, comun = 0;
		
		if (numA > numB) {
			maximo = numA;
		} else {
			maximo = numB;
		}
		
		for (int a = 1; a <= maximo; a++) {
			if (numA % a == 0 && numB % a == 0) {
				comun = a;
			}
		}
		return comun;
	}
	
	public static int calcularMiniComunMultiplo(int numA, int numB) {
		int max = 0, min = 0, comun = 0;
		
		if (numA > numB) {
			max = numA;
			min = numB;
		} else {
			max = numB;
			min = numA;
		}
		
		for (int a = 1; a <= max; a++) {
			if ((max * a % min) == 0) {
				if (comun == 0) {
					comun = max * a;
				} else if (comun > max*a) {
					comun = max *a;
				}
			}
		}
		return comun;
	}
}
