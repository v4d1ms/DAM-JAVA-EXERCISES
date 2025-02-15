import entrada.Teclado;
import java.util.Random;

public class Ejercicio3 {
	
	public static void generarMenu() {
		System.out.println("-------------------------------------");
		System.out.println("0) Salir del programa");
		System.out.println("1) Leer por teclado un ficha de domino valida");
		System.out.println("2) Escribir en consola la ficha de domino");
		System.out.println("3) Calcular la puntuacion de la ficha de domino y determinar si la ficha de domino es doble.");
		System.out.println("4) Determinar si la ficha de domino puede colocarse al lado de otra ficha de domino");
		System.out.println("5) Generar todas las fichas de domino sin repeticiones");
		System.out.println("-------------------------------------");
	}
	
	public static void main(String[] args) {
		int opcion, fichaA, fichaB;
		FichaDomino ficha = null;
		Random random = new Random();
			
		do {
			generarMenu();
			opcion = Teclado.leerEntero("Opcion: ");
			
			switch(opcion) {
				
			case 0:
				System.out.println("0");
				break;
			case 1:
				fichaA = Teclado.leerEntero("Extremo A: ");
				fichaB = Teclado.leerEntero("Extremo B: ");
				while (!(FichaDomino.esValida(fichaA, fichaB))){
					System.out.println("Los datos de la ficha de domino no son validos:");
					System.out.println("El primer extremo debe estar comprendido entre 0 y 6");
					System.out.println("El segundo extremo debe estar comprendido entre 0 y 6");
					fichaA = Teclado.leerEntero("Extremo A: ");
					fichaB = Teclado.leerEntero("Extremo B: ");
				}
				
				ficha = new FichaDomino(fichaA, fichaB);
				System.out.println("Se ha generado una ficha valida.");
				break;
			case 2:
				if (ficha != null) {					
					System.out.println(ficha.obtenerEstado());
				} else {
					System.out.println("No existe ninguna ficha de domino valida.");
				}
				break;
			case 3:
				if (ficha != null) {
					System.out.println("Es Doble :" + ficha.esDoble());
					System.out.println("Puntuacion :" + ficha.calcularPuntuacion());
				} else {
					System.out.println("No existe ninguna ficha de domino valida.");
				}
				break;
			case 4:
				if (ficha != null) {
					fichaA = random.nextInt(0, 7);
					fichaB = random.nextInt(0, 7);
					FichaDomino segundaFicha = new FichaDomino(fichaA, fichaB);
					
					System.out.println(ficha.obtenerEstado() + " - " + segundaFicha.obtenerEstado());
					if (ficha.puedeColocarseAlLado(segundaFicha)) {
						System.out.println(ficha.obtenerEstado() + " puede colocarse al lado de " + segundaFicha.obtenerEstado());
					} else {
						System.out.println(ficha.obtenerEstado() + " no puede colocarse al lado de " + segundaFicha.obtenerEstado());
					}
				} else {
					System.out.println("No existe ninguna ficha de domino valida.");
				}
				break;
			case 5:
				
				for (int a = 0; a <= 6; a++) {
					for (int b = 0; b <= a ; b++) {
						ficha = new FichaDomino(a, b);
						System.out.print(ficha.obtenerEstado());
					}
					System.out.print("\n");
				}
				
				break;
			default:
				System.out.println("La opcion de menu debe estar comprendida entre 0 y 5.");
				break;
			}
			
		} while (opcion != 0);
	}

}
