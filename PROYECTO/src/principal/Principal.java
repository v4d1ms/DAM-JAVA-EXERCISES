package principal;

import entrada.Teclado;
import principal.menu.Menu;
import principal.menu.OpcionesMenu;

public class Principal {
	
	public static void main(String[] args) {
		
		int opcion = 0;
		int opcionMenu;
		
		do {
			
			switch(opcion) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				Menu.menuJugadorEquipo();
				opcion = Teclado.leerEntero("Seleccione una opcion : "); 
				OpcionesMenu.ejecutarOpcionJugadorEquipo(opcion);
				
				break;
			case 4:
				
				break;
			default:
				System.out.println("Seleccione una opcion valida.");
				break;
			}
			
		} while (opcion != 0);	
	}	
}
