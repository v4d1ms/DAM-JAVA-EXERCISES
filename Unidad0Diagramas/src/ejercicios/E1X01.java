package ejercicios;
import java.util.Scanner;

public class E1X01 {
	@SuppressWarnings("resource")
	
	// pide 3 numeros y los imprime en pantalla
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero A: ");
		int numeroA = scan.nextInt();
		System.out.println("Numero B: ");
		int numeroB = scan.nextInt();
		System.out.println("Numero C: ");
		int numeroC = scan.nextInt();
		
		System.out.printf("%d %d %d", numeroA, numeroB, numeroC);
	}

}
