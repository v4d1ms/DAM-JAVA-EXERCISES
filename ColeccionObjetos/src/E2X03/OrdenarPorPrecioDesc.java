package E2X03;

import java.util.Comparator;

public class OrdenarPorPrecioDesc implements Comparator<Libro>{

	// Compara 2 libros por precio de forma descendente
	
	@Override
	public int compare(Libro l1, Libro l2) {
		Double precio = l1.getPrecio();
		Double precio2 = l2.getPrecio();
		
		return precio2.compareTo(precio);
	}
}
