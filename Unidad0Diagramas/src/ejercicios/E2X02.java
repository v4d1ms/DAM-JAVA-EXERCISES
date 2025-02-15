package ejercicios;
import java.util.Scanner;

public class E2X02 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese un numero entero: ");
		numero = teclado.nextInt();
		
		if (numero < 0 ) {
			System.out.printf("El numero %d es negativo", numero);
		} else if (numero > 0 ) {
			System.out.printf("El numero %d es positivo", numero);
		} else {
			System.out.printf("El numero %d es neutro", numero);
		}
		teclado.close();
	}
}
