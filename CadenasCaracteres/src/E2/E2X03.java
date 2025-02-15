package E2;

import entrada.Teclado;

public class E2X03 {

	public static void main(String[] args) {
		String cvocales = "", cconsonantes = "";
		String vocalesperm = "AEIOUaeiou";
		String cadena = Teclado.leerCadena("frase: ");
		int vocales = 0, consonantes = 0;
		
		while (cadena.length() > 60) {
			System.out.println("La cadena no puede contener mas de 60 caracteres");
			cadena = Teclado.leerCadena("Frase: ");
		}
		
		for (int a = 0; a < cadena.length(); a++) {
			char car = cadena.charAt(a);
			if (car >= 'a' && car <= 'z' || car == 'ñ' || car >= 'A' && car <= 'Z' || car == 'Ñ') {
				if (vocalesperm.indexOf(car) != -1) {
					vocales = vocales + 1;
					cvocales = cvocales + car;
				} else {
					consonantes = consonantes + 1;
					cconsonantes = cconsonantes + car;
				}
			}
		}
		
		System.out.printf("La frase tiene %d vocales\n", vocales);
		System.out.printf("Letras Vocales : %s\n", cvocales);
		System.out.printf("La frase tiene %d consonantes\n", consonantes);
		System.out.printf("Letras consonantes : %s\n", cconsonantes);
		
	}

}

