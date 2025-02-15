import java.util.Scanner;

public class EntradaDatos {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Lado: ");
		double lado = teclado.nextDouble();
		double area = lado * lado;
		System.out.println("El area del cuadrado es: " + area);
	}
}