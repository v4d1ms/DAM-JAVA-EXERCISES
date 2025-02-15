package E3XPlataforma;

public abstract class Video {
	
	private static int contadorCod = 0;
	protected int codigo;
	protected String titulo;
	
	public Video(String titulo) {
		contadorCod++;
		this.codigo = contadorCod;
		this.titulo = titulo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
}
