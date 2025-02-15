package E1X01;

public class Videojuego {
	
	private static int totalVideojuego = 0;
	
	private int codigo;
	private String titulo;
	private double precio;
	private int unidades;
	
	public Videojuego(String titulo, double precio) {
		totalVideojuego++;
		this.codigo = totalVideojuego;
		this.titulo = titulo;
		this.precio = precio;
		this.unidades = 10;
	}

	@Override
	public String toString() {
		return "Videojuego [ codigo = " + codigo + " titulo=" + titulo + 
				", precio=" + String.format("%.2f", precio) + 
				", cantidad=" + unidades + "]";
	}


}