package E2;

import entrada.Teclado;

public class E2X08 {
	
	public static int contarEspacios(String frase) {
		int espacios = 0;
		
		if (!frase.startsWith(" ") || !frase.endsWith(" ")) {
			for (int a = 0; a < frase.length(); a++) {
				if (frase.charAt(a) == ' ') {
					espacios = espacios + 1;
				}
			}
		}
		return espacios;
	}
	
	public static int obtenerPosicionEspacio(String frase) {
		int pos = 0;
		for (int a = 0; a < frase.length(); a++) {
			if (frase.charAt(a) == ' ') {
				pos = a;
			}
		}
		return pos;
	}
	
	public static String leerFraseValida(String frase) {
		String cadena = Teclado.leerCadena(frase);
		while (contarEspacios(cadena) != 1) {
			System.err.println("El nombre completo debe tener 1 espacio en blanco.\r\n"
					+ "El nombre completo no debe comenzar con un espacio en blanco.\r\n"
					+ "El nombre completo no debe terminar con un espacio en blanco.\r\n");
			cadena = Teclado.leerCadena(frase);
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		String nombre1 = leerFraseValida("Nombre completo 1; ");
		String nombre2 = leerFraseValida("Nombre completo 2; ");
		
		String apellido1 = nombre1.substring(obtenerPosicionEspacio(nombre1), nombre1.length());
		String apellido2 = nombre2.substring(obtenerPosicionEspacio(nombre2), nombre2.length());
		
		String NombreUno = nombre1.substring(0, obtenerPosicionEspacio(nombre1));
		String NombreDos = nombre2.substring(0, obtenerPosicionEspacio(nombre2));
		
		System.out.println(NombreUno + "" + apellido2);
		System.out.println(NombreDos + "" + apellido1);
		
	}
}
