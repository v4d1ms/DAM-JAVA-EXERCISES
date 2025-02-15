package x1_ejemplo_asociacion;

public class Album {
	private String nombre;
	private String artista;
	private int ano;
	private String genero;
	
	public Album(String nombre, String artista, int ano, String genero) {
		this.nombre = nombre;
		this.artista = artista;
		this.ano = ano;
		this.genero = genero;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "album ["
				+ "nombre=" + nombre + 
				", artista=" + artista + 
				", ano=" + ano + 
				", genero=" + genero + 
				"]";
	}
	
}
