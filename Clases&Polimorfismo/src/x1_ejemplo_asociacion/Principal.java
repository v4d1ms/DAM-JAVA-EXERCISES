package x1_ejemplo_asociacion;

import entrada.Teclado;

public class Principal {
	
	public static void menuOpciones() {
		System.out.println("|----------------------------------------------------|");
		System.out.println("| 0 | Exit                                           |");
		System.out.println("| 1 | Insertar Album en la coleccion                 |");
		System.out.println("| 2 | Consultar todos los albumes de la coleccion    |");
		System.out.println("| 3 | Remover Album de la coleccion                  |");
		System.out.println("| 4 | Consultar album por posicion                   |");
		System.out.println("| 5 | Consultar album por nombre                     |");
		System.out.println("|----------------------------------------------------|");
		
	}
	
	public static void main(String[] args) {
		int opcion = 0;
		int ano, posicion;
		String nombre, artista, genero;
		Coleccion coleccion = new Coleccion(10);
		Album album;
		do {
			menuOpciones();
			opcion = Teclado.leerEntero("Opcion (0, 3) : ");
			switch(opcion) {
			case 0:
				break;
			case 1:
				nombre = Teclado.leerCadena("Nombre : ");
				artista = Teclado.leerCadena("Artista : ");
				ano = Teclado.leerEntero("Año Publicacion : ");
				genero = Teclado.leerCadena("Genero: ");
				album = new Album(nombre, artista, ano, genero);
				if (coleccion.insertar(album)) {
					System.out.println("Se ha agregado correctamente el album");
				} else {
					System.out.println("Error al insertar : coleccion llena.");
				}
				break;
			case 2:
				System.out.println(coleccion.toString());
				break;
			case 3:
				posicion = Teclado.leerEntero("Posicion a remover: ");
				coleccion.remover(posicion);
				break;
			case 4:
				posicion = Teclado.leerEntero("Posicion : ");
				album = coleccion.consultarPosicion(posicion);
				
				if (album == null) {
					System.out.println("No se ha encontrado ningun album en esta posicion");
				} else {
					System.out.println(album.toString());
				}
				break;
			case 5:
				album = coleccion.consultarNombre("vadim");
				System.out.println(album.toString());
				break;
			default:
				System.out.println("Opcion no valida!");
				break;
			}
		} while (opcion != 0);

	}

}
