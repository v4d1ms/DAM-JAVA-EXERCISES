package ejercicios;
import java.util.Scanner;

public class E1X02{
	@SuppressWarnings("resource")
	// pide 3 numeros y los alinea de forma diferente
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Numero A: ");
		int numeroA = scan.nextInt();
		System.out.println("Numero B: ");
		int numeroB = scan.nextInt();
		System.out.println("Numero C: ");
		int numeroC = scan.nextInt();
		
		System.out.println("NUMEROS ALINEADOS A LA DERECHA");
		System.out.printf("A= %5d\n", numeroA);
		System.out.printf("B= %5d\n", numeroB);
		System.out.printf("C= %5d\n", numeroC);
		System.out.println("NUMEROS ALINEADOS A LA IZQUIERA");
		System.out.printf("A= %-5d\n", numeroA);
		System.out.printf("B= %-5d\n", numeroB);
		System.out.printf("C= %-5d\n", numeroC);
		
	}
}
