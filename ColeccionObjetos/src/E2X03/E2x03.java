package E2X03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entrada.Teclado;
public class E2x03{

	
	public static void menuOpciones() {
		System.out.println("-------------------------------------------------------");
		System.out.println("| 0 | Exit                                            |");
		System.out.println("| 1 | Insertar libro en la lista                      |");
		System.out.println("| 2 | Eliminar libro por ISBN    					  |");
		System.out.println("| 3 | Consultar por ISBN			                  |");
		System.out.println("| 4 | Consultar todos                                 |");
		System.out.println("| 5 | Consultar todos por precio descendente          |");
		System.out.println("| 6 | Consultar libros por escritor                   |");
		System.out.println("-------------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		String isbn;
		String titulo;
		String escritor; 
		int agno; 
		int stock;
		int opcion;
		int contador;
		double precio;
		
		List<Libro> libros = new ArrayList<Libro>();
		List<Libro> aux;
		Libro libro;
		
		
		do {
			menuOpciones();
			opcion = Teclado.leerEntero("Seleccione una opcion :");
			
			switch(opcion) {
			case 0:
				break;
			case 1:
				isbn = Teclado.leerCadena("ISBN ? ");
				libro = new Libro(isbn, null, null, 0, 0, 0.0);
				if (libros.contains(libro)) {
					System.out.println("Ya existe");
				} else {
					
					titulo = Teclado.leerCadena("Titulo: " );
					escritor = Teclado.leerCadena("Escritor : ");
					agno = Teclado.leerEntero("Año : ");
					stock = Teclado.leerEntero("Stock: ");
					precio = Teclado.leerReal("Precio : ");
					libro = new Libro(isbn, titulo, escritor, agno, stock, precio);
				
					if (libros.add(libro)) {
						System.out.println("Se ha añadido correctamente.");
					} else {
						System.out.println("No se ha podido agregar el libro.");
					}
				}
				break;
			case 2:
				isbn = Teclado.leerCadena("ISBN ? ");
				libro = new Libro(isbn, null, null, 0, 0, 0.0);
				
				if (libros.remove(libro)) {
					System.out.println("Se ha podido eliminar correctamente el libro");
				} else {
					System.out.println("No se ha podido eliminar el libro porque no se ha encontrado.");
				}
				
				break;
			case 3:
				isbn = Teclado.leerCadena("ISBN ? ");
				libro = new Libro(isbn, null, null, 0, 0, 0.0);
				System.out.println(libros.get(libros.indexOf(libro)));
				break;
			case 4:
				if (libros.isEmpty()) {
					System.out.println("No hay ningun libro en esta lista.");
				} else {					
					for (Libro l: libros) {
						System.out.println(l);
					}
				}
				break;
			case 5:
				aux = new ArrayList<Libro>();
				aux.addAll(libros);
				
				Collections.sort(aux, new OrdenarPorPrecioDesc());
				
				if (aux.isEmpty()) {
					System.out.println("Esta lista esta vacia.");
				} else {						
					for (Libro l: aux) {
						System.out.println(l);
					}
				}
				
				break;
			case 6:
				contador = 0;
				escritor = Teclado.leerCadena("Escritor : ");
				for (Libro l: libros) {
					if (l.getEscritor().equalsIgnoreCase(escritor)) {
						System.out.println(l);
						contador++;
					}
				}

				if (contador == 0) {
					System.out.println("No se ha encontrado ningun libro con ese escritor.");
				} 
				
				break;
			default:
				System.out.println("Seleccione una opcion valida!");
			}
			
		} while (opcion != 0);
	}
}
