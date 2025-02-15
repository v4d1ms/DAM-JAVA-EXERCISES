package ejercicios;

import java.util.Scanner;

public class E3X05 {

	public static void main(String[] args) {
		// Pedir un numero del 1 al 99999 y decir cuantos caracteres tiene
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero del 1 - 99999: ");
		numero = teclado.nextInt();
	
		if (numero > 0 && numero <= 99999) {
			if (numero >= 0 && numero <= 9) {
				System.out.println("EL numero " +  numero + " tiene 1 cifra");
			} else if (numero > 9 && numero <= 99) {
				System.out.println("EL numero " +  numero + " tiene 2 cifras");
			} else if (numero >= 100 && numero <= 999) {
				System.out.println("EL numero " +  numero + " tiene 3 cifras");
			} else if (numero >= 1000 && numero <= 9999) {
				System.out.println("EL numero " +  numero + " tiene 4 cifras");
			} else if (numero >= 10000 && numero <= 99999) {
				System.out.println("EL numero " +  numero + " tiene 5 cifras");
			}
			
		}  else {
			System.out.print("El numero entero debe estar comprendido entre 0 y 99999");
		}
		teclado.close();
	}
}