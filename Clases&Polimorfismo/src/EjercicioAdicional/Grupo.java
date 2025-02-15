package EjercicioAdicional;

public class Grupo {
	
	private String nombre;
	private Alumno[] alumnos;
	private int contador;
	
	public Grupo(String nombre) {
		this.nombre = nombre;
		this.alumnos = new Alumno[30];
		this.contador = 0;
	}
	
	public boolean insertar(Alumno alumn) {
		if (contador < alumnos.length) {
			alumnos[contador] = alumn;
			contador++;
			return true;
		}
		return false;
	}
	
	public Calificaciones[] notasAlumno(int expediente) {
		for (int i = 0; i < contador; i++) {
			if (alumnos[i].getNexpediente() == expediente) {
				return alumnos[i].getNotas();
			}
		}
		return null;
	}
	
}
