package E2X02;

import java.util.Random;

import entrada.Teclado;

public class Principal {

	public static void escribirMenu() {
		System.out.println("|--------------------------------------------------------|");
		System.out.println("| 0 | Exit                                               |");
		System.out.println("| 1 | Insertar un refresco en el inventario              |");
		System.out.println("| 2 | Insertar una bebida aleatoria                      |");
		System.out.println("| 3 | Rellenar el inventario con bebidas aleatorias      |");
		System.out.println("| 4 | Consultar todas las bebidas                        |");
		System.out.println("| 5 | Consultar todos los refrescos                      |");
		System.out.println("| 6 | Consultar bebidas entre min y max                  |");
		System.out.println("| 7 | Calcular numero de refrescos gaseosos              |");
		System.out.println("|--------------------------------------------------------|");
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int opcion, tipo, contadorref, contadorferm, contadordes, preciomin, preciomax;
		Inventario inv = new Inventario(20);
		Inventario auxiliar = new Inventario(20);
		String nombre;
		double cantidadAzucar;
		boolean tieneGas;
		
		Random ale = new Random();
		Bebida bebida;
		Refresco refresco;
		
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Opcion = ");
			
			switch(opcion) {
			
			case 0:
				break;
			case 1:
				nombre = Teclado.leerCadena("Nombre : ");
				cantidadAzucar = Teclado.leerReal("Cantidad : ");
				tieneGas = Teclado.leerBooleano("Tiene gas : ");
				refresco = new Refresco(nombre, tieneGas, cantidadAzucar);
				
				if (inv.insertar(refresco)) {
					System.out.println("Se ha insertado un refresco!");
				} else {
					System.out.println("No se ha podido insertar el refresco");
				}
				
				break;
			case 2:
				
				// insetar bebida aleatoria
				
				tipo = ale.nextInt(3);
				
				if (tipo == 0) {	
					bebida = new Refresco();
					
				} else if (tipo == 1) {
					bebida = new Fermentada();
				} else {	
					bebida = new Destilada();
				}
				
				if (inv.insertar(bebida)) {
					System.out.println("Se ha insertado una bebida al inventario..");
				} else {
					System.out.println("No se ha podido insertar una bebida!");
				}
				
				break;
				
			case 3:
				
				contadorref=0; 
				contadorferm=0; 
				contadordes=0;
				
				while (!inv.estaLleno()) {
					tipo = ale.nextInt(3);
					
					if (tipo == 0) {	
						bebida = new Refresco();
						if (inv.insertar(bebida)) {
							System.out.println("Se ha insertado una bebida al inventario..");
							contadorref++;
						} else {
							System.out.println("No se ha podido insertar una bebida!");
						}
					} else if (tipo == 1) {
						bebida = new Fermentada();
						if (inv.insertar(bebida)) {
							System.out.println("Se ha insertado una bebida al inventario..");
							contadorferm++;
						} else {
							System.out.println("No se ha podido insertar una bebida!");
						}
					} else {	
						bebida = new Destilada();
						if (inv.insertar(bebida)) {
							System.out.println("Se ha insertado una bebida al inventario..");
							contadordes++;
						} else {
							System.out.println("No se ha podido insertar una bebida!");
						}
					}					
				}
				System.out.println("Se han insertado " + contadorref + " refrescos.");
				System.out.println("Se han insertado " + contadorferm + " fermentadas.");
				System.out.println("Se han insertado " + contadordes + " fermentadas.");
				break;
			case 4:
				
				if (inv.estaVacio()) {
					System.out.println("El inventario esta vacio");
				} else {
					System.out.println(inv.toString());
					System.out.println("Se han guardado : " + inv.obtenerNumeroStock() + " bebidas.");
				}
				
				break;
			case 5:
				auxiliar = inv.consultaRefrescos();
				if (auxiliar.estaVacio()) {
					System.out.println("No hay refrescos.");
				} else {
					System.out.println(auxiliar.toString());
				}
				break;
			case 6:
				preciomin = Teclado.leerEntero("Precio minimo ? ");
				preciomax = Teclado.leerEntero("Precio maximo ? ");
				auxiliar = inv.consultarPorPrecio(preciomin, preciomax);
				if (auxiliar.estaVacio()) {
					System.out.println("No se han encontrado productos con los precios indicados!");
				} else {					
					System.out.println(auxiliar.toString());
				}
				break;
			case 7:
				contadorref = inv.obtenerGaseosas();
				System.out.println("Hay " + contadorref + " refrescos gaseosos...");
				break;
			default:
				System.out.println("Opcion no valida!");
				break;
			}
			
			
		} while (opcion != 0);
		System.out.println("Programa finalizado");
	}

}
