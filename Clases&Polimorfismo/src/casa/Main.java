package casa;

import entrada.Teclado;

public class Main {
	
	
    public static void dibujarMenu() {
        System.out.println("----------------------------------------------");
        System.out.println("  (0) Salir del Programa");
        System.out.println("  (1) Crear Grupo");
        System.out.println("  (2) Listar Grupo");
        System.out.println("  (3) Añadir Alumno a grupo");
        System.out.println("  (4) Eliminar alumno del grupo");
        System.out.println("  (5) Mostrar Alumno por Dni");
        System.out.println("  (6) Mostrar Alumno por Apellido");
        System.out.println("  (7) Mostrar Alumno por Nª Matricula");
        System.out.println("  (8) Mostrar notas de alumno por Dni");
        System.out.println("  (9) Mostrar notas de alumno por Apellido");
        System.out.println("  (10) Mostrar nota de alumno por Asignatura");
        System.out.println("  (11) Añadir Calificacion por DNI");
        System.out.println("  (12) Añadir Calificacion por Apellido");
        System.out.println("  (13) Modificar Calificacion por Asignatura");
        System.out.println("  (14) Mostrar media Alumno filtrado por DNI");
        System.out.println("----------------------------------------------");
    }

    public static void main(String[] args) {
        int opcion = 0;
        int edad;
        int cantidad;
        Grupo[] grupos = new Grupo[10];
        String nombre, apellido, dni;
        Alumno alumno;
        Grupo clase;
        Instituto insti = new Instituto("IES SANTIAGO HERNANDEZ");

        do {
            dibujarMenu();
            opcion = Teclado.leerEntero("Seleccione una opcion : ");
            switch (opcion) {
                case 0:
                    break;
                case 1:
                	nombre = Teclado.leerCadena("Que nombre recibe el grupo ? ");
                	cantidad = Teclado.leerEntero("Cuantos alumnos tendra este grupo? ");
                	clase = new Grupo(nombre, cantidad);
                	if (insti.agregarGrupo(clase)) {
                		System.out.println("Se ha agregado el grupo correctamente.");
                	} else {
                		System.out.println("No se ha podido agregar el grupo");
                	}
                    break;
                case 2:
                	System.out.println(insti.toString());
                    break;
                case 3:
                	String nombre_grupo = Teclado.leerCadena("Nombre del grupo : ");
                	clase = insti.obtenerGrupoPorNombre(nombre_grupo);
            
                	if (clase != null) {
                		nombre = Teclado.leerCadena("Nombre del alumno :");
                		apellido = Teclado.leerCadena("Apellido de alumno :");
                		dni = Teclado.leerCadena("Dni del alumno");
                		edad = Teclado.leerEntero("Edad del alumno");
                		alumno = new Alumno(nombre, apellido, dni, edad);
                		clase.insertarAlumno(alumno);
                	}
             		break;
                default:
                    break;
            }
        } while (opcion != 0);
    }
}
