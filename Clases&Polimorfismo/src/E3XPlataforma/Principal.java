package E3XPlataforma;

import entrada.Teclado;

public class Principal {
	
	public static void escribirMenu() {
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| 0 | Exit                                               |");
		System.out.println("| 1 | Insertar Pelicula                                  |");
		System.out.println("| 2 | Insertar Serie                                     |");
		System.out.println("| 3 | Consultar todos los videos                         |");
		System.out.println("| 4 | Consultar peliculas de un director                 |");
		System.out.println("| 5 | Consultar Series por año inicio emision            |");
		System.out.println("| 6 | Eliminar video por codigo                          |");
		System.out.println("| 7 | Reorganizar Catalogo (peliculas-series)            |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println();
	}
	

	public static void main(String[] args) {
		int opcion;
		String director, titulo;
		int agnoestreno, inicioemision, finemision, codigo;
		Catalogo auxiliar = new Catalogo(10);
		Catalogo netflix = new Catalogo(10);
		Video video;
		
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Opcion : ");
			
			switch(opcion) {
			
			case 0:
				break;
			case 1:
				
				titulo = Teclado.leerCadena("Titulo Pelicula : ");
				director = Teclado.leerCadena("Nombre Director : ");
				agnoestreno = Teclado.leerEntero("Año de Estreno : ");
				
				video = new Pelicula(titulo, director, agnoestreno);
				
				if (netflix.insertar(video)) {
					System.out.println("Se ha insertado una pelicula.");
				} else {
					System.out.println("No se ha podido insertar una pelicula.");
				}
				break;
				
			case 2:
				
				titulo = Teclado.leerCadena("Titulo Pelicula : ");
				inicioemision = Teclado.leerEntero("Inicio Emision : ");
				finemision = Teclado.leerEntero("Fin emision : ");
				video = new Serie(titulo, inicioemision, finemision);
				
				if (netflix.insertar(video)) {
					System.out.println("Se ha insertado una serie.");
				} else {
					System.out.println("No se ha podido insertar una serie.");
				}
				
				break;
			case 3:
				if (netflix.estaVacio()) {
					System.out.println("Este catalogo no tiene videos.");
				} else {
					System.out.println(netflix.toString());
				}
				break;
			case 4:
				
				if (netflix.estaVacio()) {
					System.out.println("Este catalogo no tiene videos.");
				} else {
					director = Teclado.leerCadena("Por que director deseas buscar? ");
					auxiliar = netflix.peliculasdeDirector(director);
					System.out.println(auxiliar.toString());
				}
				
				break;
				
			case 5:
				
				if (netflix.estaVacio()) {
					System.out.println("Este catalogo no tiene videos.");
				} else {
					inicioemision = Teclado.leerEntero("Por que año de inicio deseas buscar? ");
					auxiliar = netflix.seriesPorAgnoInicioEmision(inicioemision);
					System.out.println(auxiliar.toString());
				}
				
				break;
			case 6:
				if (netflix.estaVacio()) {
					System.out.println("Este catalogo no tiene ningun video");
				} else {
					codigo = Teclado.leerEntero("Que codigo de video deseas quitar? ");
					if (netflix.eliminarCodigo(codigo)) {
						System.out.println("Se ha eliminado la posicion seleccionada");
					} else {
						System.out.println("No se ha podido eliminar la posicion seleccionada.");
					}
				}
				break;
			case 7:
				System.out.println(netflix.organizar().toString());;
				netflix.organizarModificando();
				break;
			}
			
		} while(opcion != 0);
		
		
	}

}
