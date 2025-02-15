package E2X03AMP;

import java.util.ArrayList;

public class Ciudad {
	
	private String nombre;
	private ArrayList<Libreria> librerias;
	
	public Ciudad(String nombre) {
		this.nombre = nombre;
		this.librerias = new ArrayList<Libreria>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean agregarLibreria(Libreria libreria) {
		return librerias.add(libreria);
	}

	@Override
	public String toString() {
		return "Ciudad [nombre=" + nombre + ", librerias=\n" + librerias + "\n]";
	}

	
}
