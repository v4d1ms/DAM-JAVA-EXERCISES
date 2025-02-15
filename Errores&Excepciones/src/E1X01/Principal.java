package E1X01;

import java.io.*;

public class Principal {
	
	public static String solicitarCadena(String mensaje) throws IOException {
		String cadena = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(isr);
		System.out.print(mensaje);
		cadena = teclado.readLine();
		return cadena;
	}
	
	public static short solicitarEnteroCorto(String mensaje, int numMaxErrores) throws IOException {
		int errores = 0;
		short entero = -1;
		
		do {
			
			try {
				String cadena = solicitarCadena(mensaje);
				entero = Short.parseShort(cadena);
				return entero;
			} catch (NumberFormatException nfe) {
				errores++;
				System.out.println("El dato introducido no tiene formato de número entero corto : " + nfe.toString());
				System.out.println("Se han producido " + errores + " errores.");
			};
			
		} while (errores <= numMaxErrores && entero == -1);
		
		return 0;
	}
	
	
	public static void main(String[] args) throws IOException {
		final int errores = 3;

		try {
			short num = solicitarEnteroCorto("Dividendo : ", errores);
			short num2 = solicitarEnteroCorto("Divisor : ", errores);
			
			if (num % num2 == 0) {
				System.out.println(num + "/" + num2 + " es divisible.");
			} else {
				System.out.println(num + "/" + num2 + " no es divisible.");
			}
			
			System.out.println("Cociente : " + (num / num2));
			System.out.println("Resto  : " + (num % num2));
		} catch (ArithmeticException ae) {
			System.out.println("Se ha producido error aritmético : " + ae.toString());
		} catch (IOException e) {
			System.out.println("Se ha producido un error de entrada / salida.");
		}
	}
}
