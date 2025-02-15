package ejercicios;
import java.util.Scanner;

public class E1X06 {
	public static void main(String[] args) {
		double numChicos, numChicas, porcentajeChicas, porcentajeChicos;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Numero de chicos? ");
		numChicos = teclado.nextDouble();
		System.out.print("¿Numero de chicas? ");
		numChicas = teclado.nextDouble();
		
		porcentajeChicas = (numChicas / (numChicos + numChicas)) * 100;
		porcentajeChicos = (numChicos / (numChicos + numChicas)) * 100;
		
		System.out.printf("Porcentaje Chicos: %.2f%%\n", porcentajeChicos);
		System.out.printf("Porcentaje Chicas: %.2f%%", porcentajeChicas);
		teclado.close();
	}
}
