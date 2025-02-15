package EjercicioAdicional;

public class Alumno {
	private String nombre;
	private String apellido;
	private int nexpediente;
	private Calificaciones[] notas;
	
	private int contador = 0;
	
	
	public Alumno(String nombre, String apellido, int nexpediente) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nexpediente = nexpediente;
		this.notas = new Calificaciones[7];
		this.contador = 0;
	}
	
	public int getNexpediente() {
		return nexpediente;
	}

	public void setNexpediente(int nexpediente) {
		this.nexpediente = nexpediente;
	}

	public Calificaciones[] getNotas() {
		return notas;
	}

	public boolean insertar(Calificaciones nota) {
		if (contador < notas.length) {
			notas[contador] = nota;
			contador++;
			return true;
		}
		return false;
	}
	
	public Calificaciones consultarMejorCalificacion() {
		if (contador == 0) {
			return null;
		} else {
			Calificaciones mejorCalif = notas[0];
			for (int i = 0; i < contador; i++) {
				if (mejorCalif.getNota() < notas[i].getNota()) {
					mejorCalif = notas[i];
				}
			}
			return mejorCalif;
		}
	}
	
	public Calificaciones consultarCalificacion(String modulo) {
		for (int i = 0; i < contador; i++) {
			if (notas[i].getMateria().equals(modulo)) {
				return notas[i];
			}
		}
		
		return null;
	}
	
	public boolean actualizar(String modulo, double nota) {
		Calificaciones calif = consultarCalificacion(modulo);
		if (calif != null) {
			calif.setNota(nota);
			return true;			
		}
		return false;
	}
	 
	
}
