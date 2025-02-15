package casa;

public class Calificacion {

    private String asignatura;
    private double nota;

    public Calificacion(String asign, double nota){
        this.asignatura = asign;
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString() {
        return asignatura + "=" + nota;
    }
}
