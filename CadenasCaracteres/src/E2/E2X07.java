package E2;

import entrada.Teclado;

public class E2X07 {

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
		String cadena = leerFrase("Frase :", 40, 2);	

		for (int b = 0; b < cadena.length(); b++) {
			System.out.println(cadena);
			char ultimChar = cadena.charAt(cadena.length() - 1);
			String restoChars = cadena.substring(0, cadena.length()- 1);
			cadena = ultimChar + restoChars;
			
		}
		
		System.out.println("DADASDSADAS");
		for (int c = 0; c < cadena.length(); c++) {
			System.out.println(cadena);
			char primChar2 = cadena.charAt(0);
			String uChar = cadena.substring(1);
			cadena = uChar + primChar2;
		}
	}
}

// h 0 O 1 l 2 a 3
