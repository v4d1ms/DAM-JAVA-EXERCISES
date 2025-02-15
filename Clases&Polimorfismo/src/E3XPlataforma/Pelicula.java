package E3XPlataforma;

public class Pelicula extends Video{

	private int agnoestreno;
	protected String director;
	
	public Pelicula(String titulo, String director, int agnoestreno) {
		super(titulo);
		this.director = director;
		this.agnoestreno = agnoestreno;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	@Override
	public String toString() {
		return "Pelicula [Codigo= " + codigo
				+ ", Director = " + director
				+ ", Titulo = " + titulo 
				+ ", Año Estreno=" + agnoestreno + "]";
	}
	
}
