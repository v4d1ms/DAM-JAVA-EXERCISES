package ficherostexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import entrada.Teclado;

public class Actividad03 {

	public static void main(String[] args) {
		String fichero = Teclado.leerCadena("Fichero: ");
		BufferedReader datos = null;
		Set<String> lineas = new LinkedHashSet<String>();
		try {
			datos = new BufferedReader(new FileReader(fichero));
			String line = datos.readLine();
			while (line != null) {
				lineas.add(line);
				line = datos.readLine();
			}
			
			for (String s : lineas) {
				System.out.println(s);
			}
			
			System.out.println("Hay " + lineas.size() + " diferentes en el fichero.");
			
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
