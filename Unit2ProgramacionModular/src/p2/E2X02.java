package p2;

import java.util.Scanner;

public class E2X02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int altura, anchura, numero = 1;
		boolean check = true;
		Scanner teclado = new Scanner(System.in);
		while (numero != 0) {			
			System.out.println("¿Altura? ");
			altura = teclado.nextInt();
			System.out.println("¿Anchura? ");
			anchura = teclado.nextInt();
			
			if (altura < 0) {
				System.out.println("La Altura tiene que ser positiva");
				check = false;
			}
			
			if (anchura < 0) {
				System.out.println("La anchura tiene que ser positiva");
				check = false;
			}
			
			if (check) {
				dibujarRectanguloDeAsteriscos(altura, anchura);
			}
			System.out.println("¿Desea procesar otro triangulo (0 para salir)? ");
			numero = teclado.nextInt();
		}
	}

	public static void dibujarRectanguloDeAsteriscos(int altura, int anchura) {
		for (int a= 1; a <= altura; a++) {
			for (int b = 1; b <= anchura; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
