import java.util.List;

import entrada.Teclado;

public class Principal {
	
	public static void visualizarListaSocios(List<Socio> lista) {
		for (Socio s: lista) {
			System.out.println(s);
		}
		System.out.println("Se han consultado " + lista.size() + " usuarios.");
	}
	
	
	public static void menuOpciones() {	
		System.out.println("|------------------------------------------------------------------------|");
		System.out.println("| [ 0 ] | Exit                                                           |");
		System.out.println("| [ 1 ] | Dar de alta socio premium                                      |");
		System.out.println("| [ 2 ] | Dar de alta socio basico   					                 |");
		System.out.println("| [ 3 ] | Consultar socios ordenados por dni asc                         |");
		System.out.println("| [ 4 ] | Cambiar turno de un socio basico por dni                       |");
		System.out.println("| [ 5 ] | Consultar los DNI de los socios premium con carnet estudiantil |");
		System.out.println("| [ 6 ] | Consultar Socios con la cuota mas alta del club                |");
		System.out.println("| [ 7 ] | Cambiar Socio basico a socio premium mediante dni              |");
		System.out.println("|------------------------------------------------------------------------|");
		
	}
	
	
	public static void main(String[] args) {
		int opcion;
		int edad;
		int horasEntrenador;
		String dni;
		String nombre;
		String turno;
		boolean taquilla;
		boolean carnetEstudiante;
		ClubDeportivo club = new ClubDeportivo("VivaGym");
		Socio socio;
		
		do {
			menuOpciones();
			opcion = Teclado.leerEntero("Seleccione una opcion : ");
			
			switch(opcion) {
			case 0:
				System.out.println("Saliendo del programa..");
				break;
			case 1:
				dni = Teclado.leerCadena("Que dni tiene el socio: ");
				if (club.getSocioByDNI(dni) == null) {
					nombre = Teclado.leerCadena("Como se llama el nuevo socio? ");
					edad = Teclado.leerEntero("Que edad tiene? ");
					horasEntrenador = Teclado.leerEntero("Cuantas horas de entrenador a solicitado? ");
					carnetEstudiante = Teclado.leerBooleano("Tiene carnet estudiantil ? ");
					
					socio = new SocioPremium(dni, nombre, edad, horasEntrenador, carnetEstudiante);
					
					if (club.agregarSocio(socio)) {
						System.out.println("Se ha insertado un socio al club.");
					}
					
				} else {
					System.out.println("Ya existe un usuario con el dni proporcionado.");
				}
				break;
			case 2:
				dni = Teclado.leerCadena("Que dni tiene el socio: ");
				if (club.getSocioByDNI(dni) == null) {
					nombre = Teclado.leerCadena("Como se llama el nuevo socio? ");
					edad = Teclado.leerEntero("Que edad tiene? ");
					horasEntrenador = Teclado.leerEntero("Cuantas horas de entrenador a solicitado? ");
					turno = Teclado.leerCadena("Que turno solicita el socio? ");
					taquilla = Teclado.leerBooleano("Solicita taquilla? ");
					
					socio = new SocioBasico(dni, nombre, edad, horasEntrenador, turno, taquilla);
					
					if (club.agregarSocio(socio)) {
						System.out.println("Se ha insertado un socio al club.");
					}
					
				} else {
					System.out.println("Ya existe un usuario con el dni proporcionado.");
				}
				
				break;
			case 3:
				if (club.estaVacio()) {
					System.out.println("El club esta vacio.");
				} else {
					visualizarListaSocios(club.ordenarPorDnieAsc());
				}
				break;
			case 4:
				if (club.estaVacio()) {
					System.out.println("El club esta vacio.");
				} else {
					dni = Teclado.leerCadena("Que dni tiene el socio: ");
					turno = Teclado.leerCadena("A que turno deseas cambiar? ");
					if (club.cambiarTurnoSocioBasico(dni, turno)) {
						System.out.println("Se ha actualizado el turno del socio indicado.");
					} else {
						System.out.println("El socio que usted a solicitado no se ha encontrado "
								+ "o no es premium.");
					}
				}
				break;
			case 5:
				if (club.estaVacio()) {
					System.out.println("El club no tiene socios");
				} else {
					List<String> dnis = club.dniSocioConCarnetEstudiante();
					if ( dnis != null) {
						for (String s: dnis) {
							System.out.println(s);
						}
					} else {
						System.out.println("No hay ningun socio con carnet estudiantil.");
					}
				}
				
				break;
			case 6:
				List<Socio> aux = club.obtenerSociosConCuotaMasAlta();
				if (aux != null) {
					visualizarListaSocios(aux);
				} else {
					System.out.println("Este club no tiene socios.");
				}
				break;
			case 7:
				if (club.estaVacio()) {
					System.out.println("El club esta vacio.");
				} else {
					dni = Teclado.leerCadena("Que dni tiene el socio: ");
					carnetEstudiante = Teclado.leerBooleano("Tiene carnet estudiantil ? ");
					if (club.cambiarTipoSocio(dni, carnetEstudiante)) {
						System.out.println("Se ha cambiado correctamente el socio.");
					} else {
						System.out.println("No se ha encontrado el socio indicado");
					}
				}
				break;
			default:
				System.out.println("Porfavor elige una opcion valida!");
				break;
			}
			
			
		} while (opcion != 0);
		
		
	}
	
}
