package E1X01;

public class Almacen {
	
	private Videojuego[] juego;
	private int contadorJuegos;
	
	public Almacen(int capacidad) {
		juego = new Videojuego[capacidad];
		contadorJuegos = 0;
	}

	public boolean insertar(Videojuego game) {	
		if (contadorJuegos < juego.length) {
			juego[contadorJuegos] = game;
			contadorJuegos += 1;
			return true;
		}
		return false;
	}
	
	public boolean removerPosicion(int posicion) {
		if (posicion < contadorJuegos && posicion >= 0) {			
			juego[posicion] = null;
			for (int i = posicion; i < contadorJuegos - 1; i++) {
				juego[i] = juego[i + 1];
			}
			contadorJuegos--;		
			return true;
		}
		return false;
	}
	
	public Videojuego consultarPosicion(int posicion) {
		if (posicion < 0 || posicion > contadorJuegos) {
			return null;
		}
		return juego[posicion];
	}
	
	
	@Override
	public String toString() {
		String cadena = "";
		
		if (contadorJuegos == 0) {
			cadena = "El almacen no tiene juegos";
		}
		
		for (int i = 0; i < contadorJuegos; i++) {
			cadena +=   "(" + i + ") " + juego[i].toString() + "\n";
		}
		return cadena;
	}
}
