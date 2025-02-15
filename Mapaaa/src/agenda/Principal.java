package agenda;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import entrada.Teclado;

public class Principal {
	
	public static void escribirMapa(Map<String, HashSet<String>> telefonos) {
		if (telefonos.isEmpty()) {
			System.out.println("El mapa no contiene ningún contacto.");
		}
		else {
			for ( String nombre : telefonos.keySet()) {
				HashSet<String> agenda = telefonos.get(nombre);
				System.out.println(nombre);
				System.out.print(agenda.toString());
			}
			System.out.println(telefonos.size() + " consultados.");
		}
	}

	public static void main(String[] args) {
		int opcion;
		String nombre, telefono;
		
		do {
			System.out.println("0 - Salir");
			System.out.println("1 - Escribir mapa");
			System.out.println("2 - Insertar nombre y telefono en el mapa.");
			System.out.println("3 - Eliminar nombre y tlf del mapa.");
			System.out.println("4 - Quitar telefono de un nombre.");
			
			Map<String, HashSet<String>> telefonos = new LinkedHashMap<String, HashSet<String>>();
			HashSet<String> tlf;
			opcion = Teclado.leerEntero("Opcion ? ");
			
			switch (opcion) {
			case 0:
				break;
			case 1:
				escribirMapa(telefonos);
				break;
			case 2:
				nombre = Teclado.leerCadena("Nombre : ");				
				telefono = Teclado.leerCadena("Telefono : ");
				if (telefonos.containsKey(nombre)) {
					tlf = telefonos.get(nombre);
					
					if (tlf.contains(telefono)) {
						System.out.println("Este telefono existe.");
					} else {
						tlf.add(telefono);
						System.out.println("Se ha agregado el telefono.");
					}
				} else {	
					tlf = new HashSet<String>();
					tlf.add(telefono);
					telefonos.put(nombre, tlf);
					System.out.println("Se ha añadido un nombre y un telefono al mapa.");
				}				
				
				break;
			case 3:
				nombre = Teclado.leerCadena("Nombre : ");
				if (telefonos.remove(nombre) != null) {
					System.out.println("Se ha eliminado la opcion seleccionada.");
				}
				else {
					System.out.println("No se ha encontrado el nombre ingresado.");
				}
				break;
			case 4:
				nombre = Teclado.leerCadena("Nombre : ");				
				if (telefonos.containsKey(nombre)) {
					tlf = telefonos.get(nombre);
					telefono = Teclado.leerCadena("Telefono : ");
					
					if (tlf.remove(telefono)) {						
						System.out.println("Se ha eliminado el telefono.");
					} else {
						System.out.println("No encontrado.");
					}
					
				} else {	
					System.out.println("No se ha encontrado el nombre solicitado.");
				}	
				break;
			}
			
		} while (opcion != 0);

	}

}
