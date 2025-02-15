import java.util.Scanner;

public class AreaCuadrado {	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Lado : ");
		double lado = teclado.nextDouble();
		double area = lado * lado;
		System.out.println("El area del cuadrado es :" + area);
	}
}
