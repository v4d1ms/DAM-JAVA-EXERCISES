package ficherostexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import entrada.Teclado;

public class Actividad01 {

	public static void main(String[] args) {
		String fichero = Teclado.leerCadena("Fichero: ");
		BufferedReader datos = null;
		try {
			datos = new BufferedReader(new FileReader(fichero));
			String line = datos.readLine();
			int contadorLineas = 0;
			int contadorCaracteres = 0;
			while (line != null) {
				System.out.println(line);
				contadorLineas++;
				contadorCaracteres += line.length() + 2;
				line = datos.readLine();
			}
			System.out.println("El fichero ya no tiene mas lineas.");
			System.out.println("Se han mostrado " + contadorLineas + " lineas.");
			System.out.println("Se han mostrado " + contadorCaracteres + " caracteres.");
		} 
		catch (FileNotFoundException e) {
			System.out.println("No se pudo encontrar el archivo solicitado.");
			e.printStackTrace();
		} 
		catch (IOException e) {
			System.out.println("Error al interactuar con el archivo.");
			e.printStackTrace();
		}
		finally {
			try {
				if (datos != null) {
					datos.close();
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero.");
				e.printStackTrace();
			}
		}
	}
}
