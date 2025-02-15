package ficherostexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MezclarArchivos {

	public static void main(String[] args) {
		
		FileReader archivo1 = null;
		FileReader archivo2 = null;

		BufferedReader l1 = null;
		BufferedReader l2 = null;
		BufferedWriter w1 = null;
		
		try {
			
			archivo1 = new FileReader(new File("fichero.txt"));
			archivo2 = new FileReader(new File("prueba.txt"));
			l1 = new BufferedReader(archivo1);
			l2 = new BufferedReader(archivo2);
			w1 = new BufferedWriter(new FileWriter("mezcla.txt"));
			
			String linea1 = l1.readLine();
			String linea2 = l2.readLine();
			
			while (linea1 != null || linea2 != null) {
				if (linea1 != null) {
					w1.write(linea1);
					w1.newLine();
				}
				if (linea2 != null) {
					w1.write(linea2);
					w1.newLine();
				}
				
				linea1 = l1.readLine();
				linea2 = l2.readLine();
			
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				if (l1 != null) {				
					l1.close();
				}				
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			try {
				if (l2 != null) {				
					l2.close();
				}			
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			try {
				if (w1 != null) {				
					w1.close();
				}			
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			System.out.println("Se han mezclado los archivos.");
		}
	}
}
