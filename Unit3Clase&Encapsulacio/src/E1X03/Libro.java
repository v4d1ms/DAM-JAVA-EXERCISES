package E1X03;

public class Libro {
	private String titulo;
	private int ejemplares;
	private double precio;
	
	public Libro(String titulo, int ejemplares, double precio) {
		this.titulo = titulo;
		this.ejemplares = ejemplares;
		this.precio = precio;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	 
	public String getTitulo() {
		return titulo;
	}
	
	public int getEjemplares() {
		return ejemplares;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String devolverEstado() {
		return "Libro [Titulo = " + titulo + " Ejemplares = " + ejemplares + " Precio = " + precio + "]";
	}
}
