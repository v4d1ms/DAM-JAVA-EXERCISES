package x1_ejemplo_asociacion;

public class Coleccion {
	
	private Album[] albumVec;
	private int contadorAlbumes; // numero de albumes guardados en nuestro vector de albumes
	
	
	public Coleccion(int capacidad) {
		albumVec = new Album[capacidad];
		contadorAlbumes = 0;
	}

	public boolean insertar(Album albumes) {	
		if (contadorAlbumes < albumVec.length) {
			this.albumVec[contadorAlbumes] = albumes;
			contadorAlbumes += 1;
			return true;
		}
		return false;
	}
	
	public boolean remover(int posicion) {
		if (posicion < contadorAlbumes && posicion >= 0) {			
			albumVec[posicion] = null;
			for (int i = posicion; i < contadorAlbumes; i++) {
				albumVec[i] = albumVec[i + 1];
			}
			contadorAlbumes--;		
			return true;
		}
		return false;
	}
	
	public Album consultarPosicion(int posicion) {
		if (posicion < 0 || posicion > contadorAlbumes) {
			return null;
		}
		return this.albumVec[posicion];
	}
	
	public Album consultarNombre(String nombre) {
		for (int i = 0; i < contadorAlbumes; i++) {
			if (nombre.equals(albumVec[i].getNombre())) {
				return albumVec[i];
			}
		}
		return null;
	}

	@Override
	public String toString() {
		String cadena = "";
		
		if (contadorAlbumes == 0) {
			cadena = "La coleccion no tiene albumes";
		}
		
		for (int i = 0; i < contadorAlbumes; i++) {
			cadena += "[" + i + "] " + albumVec[i].toString() + "\n";
		}
		return cadena;
	}
	
	
}
