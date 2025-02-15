package principal;

import java.sql.SQLException;
import java.util.List;

import acceso.AccesoDepartamento;
import acceso.AccesoEmpleado;
import entrada.Teclado;
import modelo.Departamento;
import modelo.Empleado;

public class Principal2 {

	public static void mostrarMenu() {
		System.out.println("0) Salir del programa");
		System.out.println("1) Insertar un empleado en la base de datos");
		System.out.println("2) Consultar todos los empleados de la base de datos");
		System.out.println("3) Consultar un empleado, por codigo de la base de datos.");
		System.out.println("4) Actualizar un empleado, por codigo, de la base de datos");
		System.out.println("5) Eliminar un empleado por codigo, de la base de datos.");
	}
	
	public static void main(String[] args)  {

		int opcion;
		int codigoDepartamento;
		String nombre;
		String fechaAlta;
		double salario;
		Empleado emp;
		List<Departamento> deps;
		List<Empleado> emps;
		
		do {
		
			mostrarMenu();
			opcion = Teclado.leerEntero("Opcion : ");
			try {
				switch(opcion) {
				case 1:
					deps = AccesoDepartamento.consultarDepartamentos();
					
					for (Departamento d: deps) {
						System.out.println(d.toString());
					}
					
					codigoDepartamento = Teclado.leerEntero("Departamento del empleado : ");
					
					if (AccesoDepartamento.consultarDepartamentoPorcodigo(codigoDepartamento)  == null) {
						
						nombre = Teclado.leerCadena("Nombre del empleado : ");
						fechaAlta = Teclado.leerCadena("Fecha Alta: ");
						salario = Teclado.leerReal("Salario : ");
						emp = new Empleado(nombre, fechaAlta, salario, codigoDepartamento);
						
						if (AccesoEmpleado.insertarEmpleadoEnDepartamento(emp) != 0) {
							System.out.println("Se ha insertado el empleado solicitado.");
						}
						
					}
					
					break;
				case 2:

					emps = AccesoEmpleado.consultarEmpleados();
					
					if (!emps.isEmpty()) {
						for (Empleado e: emps) {
							System.out.println(e.toString());
						}
					} else {
						System.out.println("No hay ningun empleado en esta base de datos.");
					}

					break;
				case 3:
					
					
					
					
					break;
				case 4:
					break;
				case 5:
					break;
				default: 
					System.out.println("No se ha encontrado la opcion indicada..");
					break;
				}
				
			} catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			} catch (SQLException sqe) {
				sqe.printStackTrace();
			}
			
		} while (opcion != 0);
			
	}
	
	
}
