package problema2;

import java.io.File;
import java.io.IOException;

public class Problema2 {

	public static void main(String[] args) throws IOException {

		File directorio = new File("ficheros");
		
		if (!directorio.exists()) {
			System.out.println("Se ha creado un directorio de pruebas.");
			directorio.mkdir();
		}
		
		if (directorio.exists()) {			
			File[] archivos = directorio.listFiles();
			for (int index = 0; index < archivos.length; index++) {
				if (archivos[index].isFile()) {					
					String nombreArchivo = archivos[index].getName();
					System.out.println(directorio.getPath());
					File archivo = new File(directorio.getPath() + "/" + nombreArchivo.toLowerCase());
					archivos[index].renameTo(archivo);
				}
			}
		}
		
	}
}
