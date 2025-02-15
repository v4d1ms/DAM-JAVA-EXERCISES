package ejercicios;
import java.util.Scanner;

public class E2X08 {
	public static void main(String[] args) {
		double importe;
		Scanner teclado = new Scanner(System.in);

		System.out.print("¿Importe de la compra? ");
		importe = teclado.nextDouble();

		if (importe < 0) {
			System.err.print("El importe de la compra debe ser positivo");
		} else if ( importe >= 200 && importe <= 800) {
			System.out.printf("Descuento: %.2f€\n", importe * 0.10);
			System.out.printf("Importe con descuento: %.2f€", importe - (importe * 0.10));
		} else if ( importe > 800) {
			System.out.printf("Descuento: %.2f€\n", importe * 0.15);
			System.out.printf("Importe con descuento: %.2f€", importe - (importe * 0.15));
		}
		teclado.close();
	}
}
