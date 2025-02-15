package E2X03AMP;

import entrada.Teclado;

public class E2x03amp {
	
	public static void menuOpciones() {	
		
		System.out.println("|---------------------------------------------------------|");
		System.out.println("| [ 0 ] | Exit                                            |");
		System.out.println("| [ 1 ] | Crear una libreria                              |");
		System.out.println("| [ 2 ] | Insertar libro en libreria					  |");
		System.out.println("| [ 3 ] | Eliminar libro de la libreria por isbn          |");
		System.out.println("| [ 4 ] | Consultar libro por isbn de la libreria         |");
		System.out.println("| [ 5 ] | Consultar todos los libros de la libreria       |");
		System.out.println("| [ 6 ] | Consultar Liberia orden descendente por precio  |");
		System.out.println("| [ 7 ] | Consultar libros por escritor de la libreria    |");
		System.out.println("| [ 8 ] | Consultar libro con mayor precio                |");
		System.out.println("| [ 9 ] | Gestionar la venta de una unidad por ISBN       |");
		System.out.println("|---------------------------------------------------------|");
		
	}
	
	public static void main(String[] args) {
		Libreria libreria = null;
		LIBROAMP libro;
		String nombre, isbn, titulo, escritor;
		int opcion, agno, stock;
		double precio;
		
		do {
			menuOpciones();
			opcion = Teclado.leerEntero("Seleccione una opcion: ");
			
			switch (opcion) {
			
			case 0:
				break;
			case 1:
				
				nombre = Teclado.leerCadena("Nombre de la libreria: ");
				libreria = new Libreria(nombre);
				System.out.println("Una libreria se ha creado correctamente.");
				break;
				
			case 2:
				
				if (libreria != null) {
					isbn = Teclado.leerCadena("ISBN del libro :");
					if (libreria.existeIsbn(isbn)) {
						System.out.println("Ya existe otro libro con este isbn en la libreria.");
					} else {
						escritor = Teclado.leerCadena("Quien ha escrito este libro ? ");
						titulo = Teclado.leerCadena("Como se titula el libro ? ");
						agno = Teclado.leerEntero("De que año es este libro ? ");
						stock = Teclado.leerEntero("Cuantos libros hay ? ");
						precio = Teclado.leerEntero("Que precio va a tener el libro ? ");
						libro = new LIBROAMP(isbn, titulo, escritor, agno, stock, precio);
						if (libreria.agregarLibro(libro)) {
							System.out.println("Se ha insertado el libro en la libreria.");							
						} else {
							System.out.println("No se ha insertado el libro en la libreria.");	
						}
					}
				}
				break;
				
			case 3:
				
				if (libreria != null) {
					isbn = Teclado.leerCadena("ISBN del libro :");
					if (libreria.existeIsbn(isbn) && libreria.eliminarLibroPorIsbn(isbn)) {
						System.out.println("Se ha eliminado el libro con el isbn indicado.");
					} else {
						System.out.println("No se ha encontrado el libro por el isbn indicado.");
					}
				} else {
					System.out.println("Primero debes tener una libreria existente.");
				}
				break;
				
			case 4:
				
				if (libreria != null) {
					isbn = Teclado.leerCadena("ISBN del libro :");
					if (libreria.existeIsbn(isbn)) {
						libro = libreria.getLibroByIsbn(isbn);
						System.out.println(libro.toString());
					} else {
						System.out.println("No se ha encontrado el libro por el isbn indicado.");
					}
				} else {
					System.out.println("Primero debes tener una libreria existente.");
				}
				break;
				
			case 5:
				
				// En la clase libreria tengo un metodo getLibros que me devuelve todos los libros
				if (libreria != null) {					
					System.out.println(libreria.getLibros());
				} else {
					System.out.println("Primero debes tener una libreria creada.");
				}
				break;
				
			case 6:
				
				if (libreria != null) {					
					if (libreria.ordenarPrecioDesc() != null) {
						for (LIBROAMP l: libreria.ordenarPrecioDesc()) {
							System.out.println(l);
						}
					} else {
						System.out.println("Esta libreria no tiene libros.");
					}
				} else {
					System.out.println("Primero debes tener una libreria creada.");
				}
				break; 
				
			case 7:
				
				if (libreria != null) {
					escritor = Teclado.leerCadena("Indica el escritor : ");
					if (libreria.getLibrosByEscritor(escritor) != null) {
						for (LIBROAMP l: libreria.getLibrosByEscritor(escritor)) {
							System.out.println(l);
						}
					}  else {
						System.out.println("No se ha encontrado ningun libro con el escritor indicado.");
					}
				} else {
					System.out.println("Esta libreria no tiene ningun libro.");
				}
				break;
				
			case 8:
			
				if (libreria != null) {
					if (libreria.obtenerTodosLibrosPrecioMax() != null) {
						for (LIBROAMP l: libreria.obtenerTodosLibrosPrecioMax()) {
							System.out.println(l);
						}
					} else {
						System.out.println("Esta libreria no contiene libros.");
					}
				} else {
					System.out.println("Debes tener una libreria creada");
				}
				
				break;

			case 9:
				if (libreria != null && libreria.estaVacio() != 0) {
					isbn = Teclado.leerCadena("ISBN del libro :");
					if (libreria.decrementarSockLibro(isbn)) {
						System.out.println("Se ha vendido un libro");
					}
				} else {
					System.out.println("Esta libreria no tiene libros.");
				}
				break;
			default :
				System.out.println("No se encontro la opcion seleccionada.");
				break;
			}
		} while (opcion != 0);
	}
}