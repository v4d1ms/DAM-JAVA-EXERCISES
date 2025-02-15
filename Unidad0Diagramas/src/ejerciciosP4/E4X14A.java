package ejerciciosP4;

import java.util.Scanner;

public class E4X14A {

	public static void main(String[] args) {
		// Guardo un numero secreto y el usuario tiene que adivinarlo , si falla le tiene que decir si es mayor o menor
		
		final int NUMERO_SECRETO = 19; 
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Numero? ");
		int numeroUser = teclado.nextInt();
		int intents = 0;
		
		
		while (numeroUser != NUMERO_SECRETO && intents <=  5) {
			
			System.out.println("Has fallado el numero secreto");
			
			if (numeroUser < NUMERO_SECRETO) {
				System.out.printf("El numero %d es menor que el numero secreto.", numeroUser);
			} else {
				System.out.printf("El numero %d es mayor que el numero secreto.", numeroUser);
			}
			
			if (intents == 5 ) {
				System.out.println("\nHas agotado tus 5 intentos");
				break;
			}

			intents++;
			
			System.out.print("\n¿Numero? ");
			numeroUser = teclado.nextInt();
		}
		
		if (numeroUser == NUMERO_SECRETO){
			System.out.println("Has acertado el numero secreto");
		}
		
	}
}
