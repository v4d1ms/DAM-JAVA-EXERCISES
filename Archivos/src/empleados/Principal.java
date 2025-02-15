package empleados;

import java.io.File;
import java.io.IOException;
import java.util.List;

import entrada.Teclado;

public class Principal {
	
	public static void escribirMenu() {
		System.out.println("(0) Salir");
		System.out.println("(1) Insertar empleado en el fichero de texto.");
		System.out.println("(2) Consultar todos los empleados del fichero de texto.");
		System.out.println("(3) Consultar un empleado por codigo, del fichero.");
		System.out.println("(4) Actualizar un empleado, por codigo, del fichero de texto.");
		System.out.println("(5) Eliminar un empleado, por codigo, del fichero de texto.");
		System.out.println("(6) Consultar empleado de un departamento.");
		System.out.println("(7) Ordenar fichero por nombre ascendente.");
		System.out.println("(8) Insertar empleado por codigo autoincremental.");
	}

	public static void main(String[] args) {
		int opcion;
		int codigo;
		String nombre;
		String fecha;
		String departamento;
		double sueldo;
		Empleado emp = null;
		File archivo = new File("empleados.txt");
		GestorEmpleados gestoria = null;
		List<Empleado> auxiliar = null;
		
		if (archivo.exists()) {			
			gestoria = new GestorEmpleados(archivo);
		} else {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		do {
			escribirMenu();
			opcion = Teclado.leerEntero("Opcion :");
			
			try {
				switch(opcion) {
				case 1:
					codigo = Teclado.leerEntero("Codigo: ");
					
					if (gestoria.consultarEmpleado(codigo) == null) {
						nombre = Teclado.leerCadena("Nombre : ");
						fecha = Teclado.leerCadena("Fecha de nacimiento : ");
						departamento = Teclado.leerCadena("Departamento : ");
						sueldo = Teclado.leerReal("Sueldo : ");
						emp = new Empleado(codigo, nombre, fecha, departamento, sueldo);
						gestoria.insertarEmpleado(emp);
						System.out.println("Se ha añadido el empleado solicitado.");
					} else {
						System.out.println("Ya existe un usuario con este codigo.");
					}
					break;
				case 2:
					auxiliar = gestoria.mostrarEmpleados();
					
					if (auxiliar.size() != 0) {						
						for (Empleado e: auxiliar) {
							System.out.println(e.toString());
						}
						System.out.println("Se han consultado " + auxiliar.size() + " empleados.");
					} else {
						System.out.println("La lista esta vacia");
					}
					
					break;
				case 4:
					codigo = Teclado.leerEntero("Codigo empleado a actualizar : ");
					
					if (gestoria.consultarEmpleado(codigo) != null) {
						nombre = Teclado.leerCadena("Nombre : ");
						fecha = Teclado.leerCadena("Fecha de nacimiento : ");
						departamento = Teclado.leerCadena("Departamento : ");
						sueldo = Teclado.leerReal("Sueldo : ");
						
						emp = new Empleado(codigo, nombre, fecha, departamento, sueldo);
						
						if (gestoria.actualizarEmpleado(codigo, emp)) {
							System.out.println("El empleado se ha modificado correctamente.");
						}
					} else {
						System.out.println("No se ha encontrado el empleado solicitado.");
					}
							
					break;
					
				case 5:
					codigo = Teclado.leerEntero("Codigo empleado a eliminar : ");
					
					if (gestoria.consultarEmpleado(codigo) != null) {
						if (gestoria.eliminarEmpleado(codigo)) {
							System.out.println("Se ha eliminado el empleado seleccionado.");
						}
					} else {
						System.out.println("No se ha encontrado el empleado.");
					}
					break;
				case 6:
					departamento = Teclado.leerCadena("Departamento : ");
					auxiliar = gestoria.mostrarEmpleadosPorDepartamento(departamento);
					if (auxiliar.size() != 0) {
						for (Empleado e : auxiliar) {
							System.out.println(e.toString());
						}
					} else {
						System.out.println("No se encontro ningun empleado con este departamento.");
					}
					break;
				case 7:
					auxiliar = gestoria.ordenarAscPorNombre();
					
					if (auxiliar.size() != 0) {
						for (Empleado m : auxiliar) {
							System.out.println(m);
						}
						System.out.println("Se ha ordenado el fichero correctamente.");
					} else {
						System.out.println("Esta gestoria no tiene empleados.");
					}
					break;
				case 8:
					nombre = Teclado.leerCadena("Nombre : ");
					fecha = Teclado.leerCadena("Fecha de nacimiento : ");
					departamento = Teclado.leerCadena("Departamento : ");
					sueldo = Teclado.leerReal("Sueldo : ");
					emp = new Empleado(0, nombre, fecha, departamento, sueldo);
					gestoria.insertarEmpleadoPorCodigoAutoincremental(emp);
					System.out.println("Se ha añadido el empleado solicitado.");
					break;
				default:
					System.out.println("No se encontro la opcion indicada");
				}
			
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			
			
		} while (opcion != 0);

	}

}
