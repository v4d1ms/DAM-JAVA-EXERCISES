package E2;

import entrada.Teclado;

public class E2X10 {

	public static int contarEspacios(String frase) {
		int espacios = 0;
		frase = frase.trim();
				
		for (int a = 0; a < frase.length(); a++) {
			if (frase.charAt(a) == ' ') {
				if (frase.charAt(a) != frase.charAt(a - 1)) {					
					espacios = espacios + 1;
				}
			} 
		}
		return espacios;
	}
	
	public static String leerFraseValida(String frase) {
		String cadena = Teclado.leerCadena(frase);
		
		while (cadena.length() < 10 || cadena.length() > 60) {
			System.out.println("La frase debe tener 10 caracteres como mínimo.\r\n"
					+ "La frase debe tener 60 caracteres como máximo.\r\n"
					+ "");
			cadena = Teclado.leerCadena(frase);
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		String frase = leerFraseValida("Frase ? ");
		int palabras = contarEspacios(frase) + 1;
		
		if (contarEspacios(frase) != 0) {			
			System.out.println("La frase tiene " + palabras + " palabras.");
		} else {
			System.out.println("La frase tiene 0 palabras");
		}
	}
}
