package ejercicios;
import java.util.Scanner;

public class E3X01 {
	public static void main(String[] args) {
		int ano;
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿ano? ");
		ano = teclado.nextInt();
		
		if (ano >= 1583) {
			if ((ano % 4) == 0 && ((ano % 100) != 0 || (ano%400) == 0 )) {
				System.out.printf("El ano %d es bisiesto", ano);
			} else {
				System.err.printf("El ano %d no es bisiesto", ano);
			}
		} else {
			System.out.print("El ano debe ser mayor o igual que 1583.");
		}
		teclado.close();
	}
}
