package E1X01;

import entrada.Teclado;

public class Main01 {
	
	public static void main(String[] args) {
		
		String nombre;
		String dev;
		int ano;
		int maxplayers;
		Videojuego videojuego;
		
		
		System.out.println("VIDEOJUEGO 1");
		nombre = Teclado.leerCadena("Nombre: ");
		dev = Teclado.leerCadena("Desarrolador : ");
		ano = Teclado.leerEntero("Año: ");
		maxplayers = Teclado.leerEntero("¿Jugadores Maximos? :");
		videojuego = new Videojuego(nombre, dev, ano, maxplayers);
		System.out.println(videojuego.returnVideojuego());
		
		System.out.println("VIDEOJUEGO 2");
		nombre = Teclado.leerCadena("Nombre: ");
		dev = Teclado.leerCadena("Desarrolador : ");
		ano = Teclado.leerEntero("Año: ");
		videojuego = new Videojuego(nombre, dev, ano);
		System.out.println(videojuego.returnVideojuego());
		
		System.out.println("VIDEOJUEGO 3");
		nombre = Teclado.leerCadena("Nombre: ");
		dev = Teclado.leerCadena("Desarrolador : ");
		videojuego = new Videojuego(nombre, dev);
		System.out.println(videojuego.returnVideojuego());
	} 
}
