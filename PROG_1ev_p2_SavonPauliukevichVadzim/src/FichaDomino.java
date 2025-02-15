 
public class FichaDomino {

	private int extremoA;
	private int extremoB;
	
	public FichaDomino(int extremoA, int extremoB) {
		this.extremoA = extremoA;
		this.extremoB = extremoB;
	}
	
	public int getExtremoA() {
		return extremoA;
	}
	
	public int getExtremoB() {
		return extremoB;
	}	
	
	public boolean esDoble() {
		return (this.extremoA == this.extremoB);
	}
	
	public int calcularPuntuacion() {
		return (this.extremoA + this.extremoB);
	}
	
	public boolean puedeColocarseAlLado(FichaDomino ficha) {
		return (ficha.getExtremoA() == this.extremoA || ficha.getExtremoA() == this.extremoB || ficha.getExtremoB() == this.extremoB || ficha.getExtremoB() == this.extremoA);
	}

	public static boolean esValida(int extremoA, int extremoB) {
		return (extremoA > 0 && extremoA <= 6 && extremoB > 0 && extremoB <= 6);
	}
	
	public String obtenerEstado() {
		return "[" + this.extremoA + "|" + this.extremoB + "]";
	}
}
