package ejercicios;
import java.util.Scanner;

public class E2X01 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un numero : ");
		numero = teclado.nextInt();
		
		if ((numero % 2 ) == 0 ) {
			System.out.printf("El numero %d es par", numero);
		} else {
			System.out.printf("El numero %d es impar", numero);
		}
		teclado.close();
	}
}
