package E2X03AMP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libreria {
	private String nombre;
	private List<LIBROAMP> libros;
	
	public Libreria(String nombre) {
		this.nombre = nombre;
		this.libros = new ArrayList<LIBROAMP>();
	}
	
	public boolean agregarLibro(LIBROAMP libro) {
		return libros.add(libro);
	}
	
	public int estaVacio() {
		return libros.size();
	}
	
	public List<LIBROAMP> getLibrosByEscritor(String escritor) {
		List<LIBROAMP> librosEscritor = new ArrayList<LIBROAMP>();
		
		for (LIBROAMP l : libros) {
			if (l.getEscritor().equals(escritor)) {
				librosEscritor.add(l);
			}
 		}
		
		if (librosEscritor.size() != 0) {
			return librosEscritor;
		}
		
		return null;
	}
	
	
	// obtener libro por isbn de nuestra lista
	public LIBROAMP getLibroByIsbn(String isbn) {
		for (LIBROAMP l : libros) {
			if (l.getIsbn().equals(isbn)) {
				return l;
			}
		}
		return null;
	}
	
	// Eliminamos un libro por isbn
	public boolean eliminarLibroPorIsbn(String isbn) {
		LIBROAMP libro = this.getLibroByIsbn(isbn);
		return libros.remove(libro);
	}
	
	// comprueba si el libro existe
	public boolean existeIsbn(String isbn) {
		LIBROAMP libro = new LIBROAMP(isbn, null, null, 0, 0, 0.0);
		return libros.contains(libro);
	}
	
	// Creamos una lista auxiliar que nos devolvera los libros ordenados
	public List<LIBROAMP> ordenarPrecioDesc() {
		if (!libros.isEmpty()) {
			List<LIBROAMP> aux = libros;
			Collections.sort(aux, new OrdenarPrecioDesc());
			return aux;
		}
		return null;
	}
	
	// sacar el precio maximo 
	public double obtenerPrecioMax() {
		double max = 0.0;
		if (!libros.isEmpty()) {
			List<LIBROAMP> aux = this.ordenarPrecioDesc();
			max = aux.get(0).getPrecio();
		}
		return max;
	}
	
	public boolean decrementarSockLibro(String isbn) {
		if (this.existeIsbn(isbn)) {
			LIBROAMP lib = this.getLibroByIsbn(isbn);
			if (!lib.decrementarUnidad()) {				
				this.eliminarLibroPorIsbn(isbn);
			}
			return true;
		}
		return false;
	}
	
	public List<LIBROAMP> obtenerTodosLibrosPrecioMax() {
		
		List<LIBROAMP> aux = new ArrayList<LIBROAMP>();
		
		if (!libros.isEmpty()) {
			for (int i = 0; i < libros.size(); i++) {
				if (libros.get(i).getPrecio() == this.obtenerPrecioMax()) {
					aux.add(libros.get(i));
				}
			}
			return aux;
		}
		
		return null;
	}
	
	public String getLibros() {
		if (libros.size() != 0) {
			String cadena = "";
			
			for (LIBROAMP l : libros) {
				cadena += l + "\n";
			}
			
			return cadena;
		}
		
		return "Esta libreria no tiene libros.";
	}
	
	public String toString() {
		return "\nLibreria [ Nombre = " + nombre + " Libros = " + this.getLibros() + " ]";
	}
}