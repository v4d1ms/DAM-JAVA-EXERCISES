package P1;

import java.util.Scanner;

public class E1X01 {

	public static void main(String[] args) {
		int numeroA, numeroB, numeroC;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Numero A? ");
		numeroA = teclado.nextInt();
		
		System.out.print("¿Numero B? ");
		numeroB = teclado.nextInt();
		
		System.out.print("¿Numero C? ");
		numeroC = teclado.nextInt();
		
		System.out.println("Maximo: " + obtMax(numeroA, numeroB, numeroC));
		System.out.println("Minimo: " + obtMin(numeroA, numeroB, numeroC));
		teclado.close();
	}
	
	
	public static int obtMin(int numA, int numB, int numC) {
		int minimo = 0;
		
		if (numA > numB && numA > numC) {
			if (numB > numC) {
				minimo = numC;
			} else {
				minimo = numB;
			}
		} else if (numB > numA && numB > numC) {
			if (numA > numC) {
				minimo = numC;
			} else {
				minimo = numA;
			}
		} else {
			if (numA > numB) {
				minimo = numB;
			} else {
				minimo = numA;
			}
		}
		return minimo;
	}

	public static int obtMax(int numA, int numB, int numC) {
		int maximo = 0;
		
		if (numA > numB && numA > numC) {
			maximo = numA;
		} else if (numB > numA && numB > numC) {
			maximo = numB;
		} else {
			maximo = numC;
		}
		
		return maximo;
	}
}
