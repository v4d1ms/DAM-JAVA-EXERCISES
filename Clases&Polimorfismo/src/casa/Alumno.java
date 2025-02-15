package casa;

public class Alumno {

    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private Calificacion[] notas;
    private int contador;

    public Alumno(String nombre, String apellido, String dni, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.notas = new Calificacion[7];
        contador = 0;
    }

    public String getDni() {
        return this.dni;
    }

    public String getApellido() {
        return this.apellido;
    }

    public boolean insertarCalificacion(Calificacion nota) {
        if (contador < notas.length) {
            notas[contador] = nota;
            contador++;
            return true;
        }
        return false;
    }

    public boolean modificarCalificacion(String asign, double nota) {
        for (int i = 0; i < contador; i++) {
            if (notas[i].getAsignatura().equals(asign)) {
                notas[i].setNota(nota);
                return true;
            }
        }
        return  false;
    }

    @Override
    public String toString() {
        String cadenaNotas = "";

        if (contador == 0) {
            cadenaNotas = "Este alumno aun no fue calificado";
        } else {
            cadenaNotas += "[";
            for (int i = 0; i < contador; i++) {
                if (i == contador - 1) {
                    cadenaNotas += notas[i].toString();
                } else {
                    cadenaNotas += notas[i].toString() + ", ";
                }
            }
            cadenaNotas += "]";
        }

        return "[ Nombre = " + nombre
                + ", Apellido = " + apellido
                + ", Dni = " + dni
                + ", Edad = " + edad
                + ", Notas = " + cadenaNotas + "]";
    }
}
