package casa;

public class Grupo {
	
	private String nombre;
    private Alumno[] alumnos;
    private int contadorAlumnos;

    public Grupo(String nombre, int capacidad) {
    	this.nombre = nombre;
        this.alumnos = new Alumno[capacidad];
        this.contadorAlumnos = 0;
    }
    
    public String getNombre() {
    	return this.nombre;
    }

    public boolean insertarAlumno(Alumno alumno) {
        if (contadorAlumnos < alumnos.length) {
            alumnos[contadorAlumnos] = alumno;
            contadorAlumnos++;
            return true;
        }
        return false;
    }

    public Alumno obtenerAlumnoPorDni(String dni) {
        Alumno alumno = null;
        for (int i= 0; i < contadorAlumnos; i++) {
            if (alumnos[i].getDni().equals(dni)) {
                alumno = alumnos[i];
            }
        }
        return alumno;
    }

    public Alumno obtenerAlumnoPorApellido(String apellido) {
        Alumno alumno = null;
        for (int i= 0; i < contadorAlumnos; i++) {
            if (alumnos[i].getApellido().equals(apellido)) {
                alumno = alumnos[i];
            }
        }
        return alumno;
    }

    @Override
    public String toString() {
        String cadena = "";

        cadena += this.nombre + "\n";
        if (contadorAlumnos == 0) {
            cadena += "No hay alumnos en este grupo";
        } else {
            for (int i = 0; i < contadorAlumnos; i++) {
                cadena += "ALUMNO " + i + ": " + alumnos[i].toString() + "\n";
            }
        }
        return cadena;
    }

}
