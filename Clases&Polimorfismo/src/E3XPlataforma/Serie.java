package E3XPlataforma;

public class Serie extends Video{

	private int inicioemision;
	private int finemision;
	
	public Serie(String titulo, int inicioemision, int finemision) {
		super(titulo);
		this.inicioemision = inicioemision;
		this.finemision = finemision;
	}
	
	public int getInicioEmision() {
		return inicioemision;
	}

	@Override
	public String toString() {
		return "Serie [Codigo= " + codigo 
				+ ", Inicio Emision= " + inicioemision 
				+ ", Fin Emision= " + finemision
				+ ", titulo=" + titulo + "]";
	}
	
	
	
	
	
}
