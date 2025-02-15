package ejerciciosP4;

import java.util.Scanner;

public class E4X10A {

	public static void main(String[] args) {
		int naturalN;
		int parCount = 0;
		int suma = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.printf("¿Numero natural N? ");
		naturalN = teclado.nextInt();
		
		if (naturalN > 0) {
			while (parCount <= 4) {
				if (naturalN % 2 == 0) {
					suma = suma + naturalN;
					parCount++;
					naturalN++;
				} else {
					naturalN++;					
				}
			}
			System.out.print(suma);
		}  else {
			System.out.print("El numero Natural N debe ser positivo.");
		}
		teclado.close();
	}

}
