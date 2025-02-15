package E2;

import entrada.Teclado;

public class E2X01 {

	public static void main(String[] args) {
		String cmayus = "", cminus = "";
		int mayus = 0, minus = 0;
		char car;
		String cadena = Teclado.leerCadena("frase: ");
		
		while (cadena.length() > 60) {
			System.out.println("La cadena no puede contener mas de 60 caracteres");
			cadena = Teclado.leerCadena("Frase: ");
		}
		
		for (int a = 0; a < cadena.length(); a++) {
			car = cadena.charAt(a);
			if (car >= 'a' && car <= 'z' || car == 'ñ') {
				minus = minus + 1;
				cminus = cminus + car;
			} else if (car >= 'A' && car <= 'Z' || car == 'Ñ') {
				mayus = mayus + 1;
				cmayus = cmayus + car;
			}
		}
		
		System.out.printf("La frase tiene %d mayusculas\n", mayus);
		System.out.printf("Letras Minusculas : %s\n", cmayus);
		System.out.printf("La frase tiene %d minusculas\n", minus);
		System.out.printf("Letras Minusculas : %s\n", cminus);
		
	}
}
