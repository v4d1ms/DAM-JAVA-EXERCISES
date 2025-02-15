package E1;

import entrada.Teclado;

public class E1X02 {

	public static void main(String[] args) {
		char opcion = Teclado.leerCaracter("¿Caracter? : ");
		
		if (esMinuscula(opcion)) {
			System.out.printf("El caracter %c es minuscula.", opcion);
		} else if (esMayuscula(opcion)) {
			System.out.printf("El caracter %c es mayuscula.", opcion);
		} else {
			System.out.printf("El caracter %c no es una letra.", opcion);
		}
		
	}
	
	
	public static boolean esMinuscula(char caracter) {
		return caracter >= 'a' && caracter <= 'z' || caracter == 'ñ';
	}
	public static boolean esMayuscula(char caracter) {
		return caracter >= 'A' && caracter <= 'A' || caracter == 'Ñ';
	}

}
