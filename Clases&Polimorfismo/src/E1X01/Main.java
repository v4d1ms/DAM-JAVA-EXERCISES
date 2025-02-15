package E1X01;

import entrada.Teclado;

public class Main {
	
	public static void menuOpciones() {
		System.out.println("|----------------------------------------------------|");
		System.out.println("| 0 | Exit                                           |");
		System.out.println("| 1 | Insertar videojuego en el almacen              |");
		System.out.println("| 2 | Eliminar un videojuego por posicion del almacen|");
		System.out.println("| 3 | Consultar videojuego por posicon               |");
		System.out.println("| 4 | Consultar juegos                               |");
		System.out.println("|----------------------------------------------------|");
		
	}

	public static void main(String[] args) {
		int opcion = 0;
		int posicion;
		String titulo;
		double precio;
		Videojuego juego;
		Almacen almacen = new Almacen(2);
		do {
			menuOpciones();
			opcion = Teclado.leerEntero("Opcion (0, 5) : ");
			switch(opcion) {
			case 0:
				break;
			case 1:
				titulo = Teclado.leerCadena("Titulo : " );
				precio = Teclado.leerReal("Precio : ");
				juego = new Videojuego(titulo, precio);
				if (almacen.insertar(juego)) {
					System.out.println("Se ha agregado el juego correctamente!");
				} else {
					System.out.println("No se ha podido agregar el juego al almacen!");
				}
				break;
			case 2:
				posicion = Teclado.leerEntero("Posicion ? ");
				if ( almacen.removerPosicion(posicion))  {
					System.out.println("Se ha eliminado el videojuego seleccionado");
				} else {
					System.out.println("No se encontro la posicion indicada");
				}
				break;
			case 3:
				posicion = Teclado.leerEntero("Posicion ? ");
				juego = almacen.consultarPosicion(posicion);
				if (juego == null) {
					System.out.println("Esta posicion es invalida");
				} else {
					System.out.println(juego.toString());
				}
				break;
			case 4:
				System.out.println(almacen.toString());
				break;
			default:
				break;
			}
		} while (opcion != 0);

	}

}
