package P1;

import java.util.Scanner;

public class E1X03 {

	public static void main(String[] args) {
		// pedimos un numero inicial y un numero final , cogemos los numeros entre estos y comprobamos si es capicua
		int numeroI, numeroF;
		Scanner teclado = new Scanner(System.in);

		System.out.print("¿Numero Inicial? ");
		numeroI = teclado.nextInt();

		System.out.print("¿Numero Final? ");
		numeroF = teclado.nextInt();
		
		if (numeroI <= numeroF) {
			int capicuasCount = 0;			
			for (int a=numeroI; a <= numeroF; a++) {
				if (invertir(a) == a) {
					System.out.print(a + " ");
					capicuasCount++;
				}
			}
			System.out.println("\nNumero de Capicuas: " + capicuasCount);
		} else {
			System.err.println("El numero inicial debe ser menor o igual que el numero final.");
		}
		teclado.close();
	}
	
	public static int invertir(int numero) {
		int conversion = 0;
		while (numero != 0) {
			conversion = conversion * 10 + (numero % 10);
			numero = numero / 10;
		}
		return conversion;
	}
}
