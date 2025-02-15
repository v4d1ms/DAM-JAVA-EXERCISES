package ejerciciosP5;

import java.util.Scanner;

public class E5X04A {

	public static void main(String[] args) {
		// Triangulo por altura
		
		int altura;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Altura : ");
		altura = teclado.nextInt();
		
		for(int a = 1; a <= altura; a++) {
			
			for (int b = a; b < altura; b++) {
				System.out.print(" ");
			}
			
			for (int c = 0; c < a * 2 -1; c++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
