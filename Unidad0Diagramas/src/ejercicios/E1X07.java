package ejercicios;
import java.util.Scanner;

public class E1X07 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio, altura, volumen;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Radio (en metros)? ");
		radio = teclado.nextDouble();
		System.out.println("¿Altura (en metros)? ");
		altura = teclado.nextDouble();
		volumen = 3.14159265359 * (radio * radio) * altura;
		System.out.printf("Volumen: %.3f metros cubicos", volumen);
	}
}
