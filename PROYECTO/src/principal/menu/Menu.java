package principal.menu;

public class Menu {

	/* Aqui creamos los diferentes menus para usarlos en la clase principal */
	public static void menuPrincipal() {
		System.out.println("0 ) Salir del Programa");
		System.out.println("1 ) Gestion Equipo");
		System.out.println("2 ) Gestion Jugador");
		System.out.println("3 ) Gestion Equipo Jugador");
		System.out.println("4 ) Gestion Partidos");
	}
	
	/*Crear a partir de aqui los diferentes menus*/
	public static void menuJugadorEquipo() {
		System.out.println("1 ) Insertar Jugador en un equipo.");
		System.out.println("2 ) Actualizar Jugador de un equipo.");
		System.out.println("3 ) Eliminar Jugador de un equipo.");
		System.out.println("4 ) Consultar un Jugador de un equipo por clave primaria.");
		System.out.println("5 ) Consultar todos los Jugadores de un equipo.");
		System.out.println("6 ) Exportar datos a un fichero.");
		System.out.println("7 ) Importar datos de un fichero.");
		System.out.println("0 ) Volver Atras");
	}
	
}
