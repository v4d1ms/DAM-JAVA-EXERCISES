package E2X03AMP;

import java.util.Comparator;

public class OrdenarPrecioDesc implements Comparator<LIBROAMP>{

	@Override
	public int compare(LIBROAMP l1, LIBROAMP l2) {
		Double precio = l1.getPrecio();
		Double precio2 = l2.getPrecio();
		
		return precio2.compareTo(precio);
	}
	
}
