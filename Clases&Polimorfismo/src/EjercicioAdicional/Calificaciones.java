package EjercicioAdicional;

public class Calificaciones {
	
	private String materia;
	private double nota;
	
	public Calificaciones(String materia, double nota) {
		this.materia = materia;
		this.nota = nota;
	}
	
	public double getNota() {
		return nota;
	}
	
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return materia + ": " + nota;
	}

}
