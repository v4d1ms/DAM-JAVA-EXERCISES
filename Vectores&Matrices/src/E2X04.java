import java.util.Random;

import entrada.Teclado;

public class E2X04 {


	public static double[][] rellenar(int longitudf, int longitudc, double min, double max) {
		double[][] matriz = new double[longitudf][longitudc];
		Random ale = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				double numero = ale.nextDouble(min, max);
				matriz[i][j] = numero;
			}
		}
		return matriz;
	}
	
	public static void imprimirMatriz(double[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("Alumno " + i + ": ");
			System.out.print("[");
			for (int j = 0; j < matriz[i].length; j++) {				
				System.out.printf("%.2f ", matriz[i][j]);
			}
			System.out.print("]");
			System.out.println();
		}
	}
	
	public static double obtenerMediaAlumno(double matriz[][], int alumno) {
		double media = 0;
		for (int i = 0; i < matriz[alumno].length; i++) {
			media += matriz[alumno][i];
		}
		
		return media/matriz[alumno].length;
	}
	
	public static double obtenerMediaAsign(double matriz[][], int asignatura) {
		double media = 0;
		for (int i = 0; i < matriz[asignatura].length; i++) {
			media += matriz[i][asignatura];
		}
		
		return media/matriz[asignatura].length;
	}
	
	public static void generarMenu() {
		System.out.println("---------------------------------------------------------------\n");
		System.out.println("(0) Salir del programa.\n"
				+ "(1) Visualizar en consola la matriz de notas.\n"
				+ "(2) Leer por teclado un alumno y visualizar en consola la media de este alumno.\n"
				+ "(3) Leer por teclado una asignatura y visualizar en consola la media de esta asignatura.\n");
		System.out.println("---------------------------------------------------------------");
	}

	public static void main(String[] args) {
		int alumnos = Teclado.leerEntero("Cuantos alumnos tiene ? ");
		int asignaturas = Teclado.leerEntero("Cuantos asignaturas tiene ? ");
		double[][] matriz = rellenar(alumnos, asignaturas, 0.0, 10.0);
		
		int menu = 1;
		while (menu > 0 && menu <= 3) {
			generarMenu();
			menu = Teclado.leerEntero("Opcion (0,3): ");
			
			switch(menu) {
			case 0:
				break;
			case 1:
				imprimirMatriz(matriz);
				break;
			case 2:
				int alumno = Teclado.leerEntero("Que alumno desea visualizar ? ");
				System.out.printf("Media : %.2f\n", obtenerMediaAlumno(matriz, alumno));
				break;
			case 3:
				int asign = Teclado.leerEntero("Que asignatura desea visualizar ? ");
				System.out.printf("Media : %.2f\n", obtenerMediaAsign(matriz, asign));
				break;
			}
		}
		
	}
}
