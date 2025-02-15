package E2X02;

public class Inventario {

	private Bebida[] bebidas;
	private int indice;
	
	
	public Inventario(int capacidad) {
		this.bebidas = new Bebida[capacidad];
		this.indice = 0;
	}
	
	public boolean insertar(Bebida bebida) {
		if (indice < bebidas.length) {
			bebidas[indice] = bebida;
			indice++;
			return true;
		}
		return false;
	}
	
	public boolean estaVacio() {
		return (indice == 0);
	}
	
	public boolean estaLleno() {
		return (indice == bebidas.length);
	}
	
	public int obtenerNumeroStock() {
		return indice;
	}
	
	public int obtenerGaseosas() {
		int contador = 0;
		for (int i = 0; i < indice; i++) {
			Bebida gas = bebidas[i];
			if (gas instanceof Refresco) {
				if (((Refresco) gas).esGaseoso()) {
					contador++;
				}
			}
		}
		return contador;
	}
	
	public Inventario consultaRefrescos() {
		Inventario refrescos = new Inventario(bebidas.length);
		for (int i = 0; i < indice; i++) {
			Bebida bebida = bebidas[i];
			if (bebida instanceof Refresco) {
				refrescos.insertar(bebida);
			}
		}
		return refrescos;
	}
	
	public Inventario consultarPorPrecio(double min, double max) {
		Inventario refrescos = new Inventario(bebidas.length);
		for (int i = 0; i < indice; i++) {
			Bebida bebida = bebidas[i];
			if (bebida.calcularPrecio() >= min && bebida.calcularPrecio() <= max) {
				refrescos.insertar(bebida);
			}
		}
		return refrescos;
	}
	
	public String toString() {
		String cadena = "";
		
		for (int i = 0; i < indice; i++) {
			Bebida bebida = bebidas[i];
			cadena += "(" + i + ")" 
			+  bebida.toString() 
			+ "\n" + "Precio : " + bebida.calcularPrecio() + "\n";
		}
		
		return cadena;
	}
}
