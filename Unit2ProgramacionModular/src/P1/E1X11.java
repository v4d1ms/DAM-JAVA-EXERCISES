package P1;

import java.util.Scanner;

import entrada.Teclado;

public class E1X11 {

	public static void main(String[] args) {
		double empleados, horas, extraordinarias, categoria;
		boolean check = true;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Numero de Empleados? ");
		empleados = teclado.nextInt();
		
		for (int a = 0; a < empleados; a++) {
			System.out.println("EMPLEADO " + a + ":");
			System.out.println("¿Numero de horas normales? ");
			horas = teclado.nextDouble();
			System.out.println("¿Numero de horas extraordinarias? ");
			extraordinarias = teclado.nextDouble();
			System.out.println("¿Categoria? ");
			categoria = teclado.nextDouble();
			
			if (categoria > 3 || categoria < 0) {
				System.out.println("La categoria solo puede estar comprendida entre 0 y 3");
				check = false;
			}
			
			if (horas < 0) {
				System.out.println("La horas normales solo pueden ser positivas");
				check = false;
			} 
			
			if (extraordinarias < 0) {
				System.out.println("La horas extraordinarias solo pueden ser positivas");
				check = false;
			}
			if (check) {				
				System.out.print("Sueldo Bruto: " + calcularSueldoBruto(horas, extraordinarias, categoria));
				System.out.print("Sueldo neto: " + calcularSueldoNeto(horas, extraordinarias, categoria));
			}
		}
	}
	
	public static double calcularSueldoBruto(double horas, double extraordinarias, double categoria) {
		double sueldo = 0;			
		if (categoria == 1) {
			sueldo = sueldo + (extraordinarias * 49.95) + (horas * 39.95);
		} else if (categoria == 2) {
			sueldo = sueldo + (extraordinarias * 39.95) + (horas * 29.95);
		} else if (categoria == 3) {
			sueldo = sueldo + (extraordinarias * 29.95) + (horas * 19.95);
		}
		return sueldo;
	}
	
	public static double calcularSueldoNeto(double horas, double extraoridinarias, double cat) {
		double sueldo = calcularSueldoBruto(horas, extraoridinarias, cat);
		if (cat == 1) {
			sueldo = sueldo - ( sueldo * 0.16); 
		} else if (cat == 2) {
			sueldo = sueldo - ( sueldo * 0.14); 
		} else if (cat == 3) {
			sueldo = sueldo - ( sueldo * 0.12); 
		}
		
		return sueldo;
	}
}
