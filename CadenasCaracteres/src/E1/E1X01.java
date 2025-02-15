package E1;

import entrada.Teclado;

public class E1X01 {

	public static void main(String[] args) {
		char opcion = Teclado.leerCaracter("¿Caracter?: ");
		
		if (esNumeroArabigo(opcion)) {
			System.out.printf("El carácter %c es un número arábigo.", opcion);
		} else {
			System.out.printf("El carácter %c no es un número arábigo.", opcion);
		}
		
	}
	
	
	public static boolean esNumeroArabigo(char caracter) { 
//		return Character.isDigit(caracter);
		return caracter >= '0' && caracter <= '9';
	}
}
