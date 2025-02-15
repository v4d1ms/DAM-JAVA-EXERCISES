package E2X03;

import java.util.Objects;

public class Libro {
	private String isbn;
	private String titulo;
	private String escritor; 
	private int agno; 
	private int stock; 
	private double precio;

	
	public Libro(String isbn, String titulo, String escritor,int agno, int stock, double precio) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.escritor = escritor;
		this.agno = agno;
		this.stock = stock;
		this.precio = precio;
	}
	
	public String getEscritor() {
		return this.escritor;
	}

	public double getPrecio() {
		return this.precio;
	}
	
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", escritor=" + escritor + ", agno=" + agno + ", stock="
				+ stock + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Libro)) {
			return false;
		}
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}
}
