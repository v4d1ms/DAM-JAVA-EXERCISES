public class Inventario {

	private Producto[] productos;
	private int indice;
	private int indiceCaducados;

	public Inventario(int capacidad) {
		this.productos = new Producto[capacidad];
		this.indice = 0;
		this.indiceCaducados = 0;

	}

	public boolean insertarAlPrincipio(Producto producto) {
		int b = 0;
		if (indice < productos.length) {			
			indice++;
			Producto[] backup = productos;
			productos[0] = producto;
			for (int i = 1; i < indice; i++) {
				productos[b] = backup[i];
				b++;
			}
			return true;
		}
		return false;
	}

	public boolean insertar(Producto prod) {
		if (indice < productos.length) {
			productos[indice] = prod;
			indice++;
			return true;
		}
		return false;
	}
	
	
	public Producto consultar(int posicion) {
		if (posicion < 0 || posicion > indice) {
			return null;
		}
		return productos[posicion];
	}

	public String consultarPercederosCaducados() {
		String cadena = "";
		for (int i = 0; i < indice; i++) {
			if (productos[i].haCaducado()) {
				cadena += productos[i] + "\n";
				indiceCaducados++;
			}
		}

		if (indiceCaducados == 0) {
			return null;
		}

		return cadena;
	}

	@Override
	public String toString() {
		String cadena = "";

		if (indice == 0) {
			cadena = "Este inventario esta vacio";
		}

		for (int i = 0; i < indice; i++) {
			cadena +=   "(" + i + ") " + productos[i].toString() + "\n";
		}

		return cadena;
	}
}
