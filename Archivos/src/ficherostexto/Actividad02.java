package ficherostexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import entrada.Teclado;

public class Actividad02 {
	
	public static void main(String[] args) {
		String file = Teclado.leerCadena("Archivo : ");
		File archivo = new File(file);	
		BufferedReader read = null;
				
		try {			
			
			read = new BufferedReader(new FileReader(archivo));
			String line = read.readLine();
			
			int palabras = 0;
			
			while (line != null) {
				
				// separamos el string en un vector por espacios
				String[] slpit = line.split("[ ]+");
				
				palabras += slpit.length;
				System.out.println(line + "\nEsta frase tiene " + 
						slpit.length + " palabras.");
				
				line = read.readLine();
			}
			
			System.out.println("Este archivo tiene " + palabras + " palabras en total.");
		} 
		catch (IOException io) {
			io.printStackTrace();
		}
		finally {
			if (read != null) {
				try {
					read.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
