package E1X03;

import entrada.Teclado;

public class Main03 {

	public static void main(String[] args) {
		int opcion = 1;
		String title;
		int ejemplares;
		double precio;
		Libro libro = null;
		
		while (opcion > 0 && opcion <= 8) {
			System.out.println("-----------------------------");
			System.out.println("0) Salir del programa");
			System.out.println("1) Crear libro a partir de datos leidos por teclado.");
			System.out.println("2) Visualizar en consola el libro");
			System.out.println("3) Modificar el titulo del libro");
			System.out.println("4) Modificar el numero de ejemplares del libro.");
			System.out.println("5) Modificar el precio del libro.");
			System.out.println("6) Visualizar el titulo en consola.");
			System.out.println("7) Visualizar en consola el numero de ejemplares del libro.");
			System.out.println("8) Visualizar en consola el precio del libro.");
			System.out.println("-----------------------------");
			
			opcion = Teclado.leerEntero("Opcion (0-8) ? ");
			
			switch (opcion) {
			case 0:
				break;
			case 1:
				if (libro != null) {					
					System.out.println("Ya hay un libro.");
				} else {
					title = Teclado.leerCadena("Titulo ? ");
					ejemplares = Teclado.leerEntero("Ejemplares ? ");
					precio = Teclado.leerReal("Precio ? ");
					libro = new Libro(title, ejemplares, precio);
					System.out.println("Se ha generado un libro.");
				}
				break;
			case 2:
				if (libro == null) {
					System.out.println("Primero debes crear algun libro.");
				} else {					
					System.out.println(libro.devolverEstado());
				}
				break;
			case 3:
				title = Teclado.leerCadena("Titulo ? ");
				libro.setTitulo(title);
				System.out.println("Se ha cambiado el titulo del libro.");
				break;
			case 4:
				ejemplares = Teclado.leerEntero("Ejemplares ? ");
				libro.setEjemplares(ejemplares);
				System.out.println("Se ha cambiado el titulo del libro.");
				break;
			case 5:
				precio = Teclado.leerReal("Precio ? ");
				libro.setPrecio(precio);
				System.out.println("Se ha cambiado el titulo del libro.");
				break;
			case 6:
				System.out.println("Titulo: " + libro.getTitulo());
				break;
			case 7:
				System.out.println("Ejemplares : " + libro.getEjemplares());
				break;
			case 8:
				System.out.println("Precio : " + libro.getPrecio());
				break;
			default:
				System.out.println("La opcion debe estar comprendida entre 0 y 8");
				break;
			}
		}

	}

}
