package ejercicios;
import java.util.Scanner;

public class E2X03 {

	public static void main(String[] args) {
		double numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero real ? ");
		numero = teclado.nextDouble();
		if (numero < 0 ) {
			System.err.println("El numero debe ser 0 o positivo");
		} else {
			System.out.printf("Cuadrado de %f = %.4f\n", numero, numero * numero);
			System.out.printf("Raiz cuadrada de %f = %.1f", numero, Math.sqrt(numero)); // math.sqrt sirve para hacer la raiz cuadrada
		}
		teclado.close();
	}

}
