package ejerciciosP5;

import java.util.Scanner;

public class E5X07A {

	public static void main(String[] args) {

		// tabla de multiplicacion de 2 numeros
		int numA, numB;
		boolean check = true;
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("¿Numero A? ");
		numA = teclado.nextInt();
		
		System.out.print("¿Numero B? ");
		numB = teclado.nextInt();
		
		if (numA > numB) {
			System.out.println("El numero A debe ser menor o igual que el numero B");
			check = false;
		}
		
		if (numA < 0) {
			System.out.println("El numero A debe ser positivo");
			check = false;
		}
		
		if (check) {			
			for (int a = numA; a <= numB; a++) {
				System.out.printf("TABLA DE MULTIPLICAR DEL NUMERO %d\n", a);
				for (int b = 0; b <= 10; b++) {					
					System.out.printf("%d * %d = %d\n", a, b, a*b);
				}
			}
		}
	}
}
