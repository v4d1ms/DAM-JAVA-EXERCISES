package E2;

import entrada.Teclado;

public class E2X06 {
	
	public static String leerFrase(String mensaje, int maximo, int minimo ) {
		String cadena = Teclado.leerCadena(mensaje);
		
		while (cadena.length() > maximo || cadena.length() < minimo) {
			System.out.println("La cadena como minimo tiene que tener " + minimo + " caracteres");
			System.out.println("La cadena no puede contener mas de " + maximo + " caracteres");
			cadena = Teclado.leerCadena(mensaje);
		}
		return cadena;
	}

	public static void main(String[] args) {
		String cadena = leerFrase("Frase: ", 40, 5);

		for (int a = 1; a <= cadena.length(); a++) {			
			System.out.print(cadena.substring(0, a));
			System.out.print("\n");
		}	
	}
}
