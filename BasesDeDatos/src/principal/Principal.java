package principal;

import java.sql.SQLException;
import java.util.List;

import acceso.AccesoDepartamento;
import entrada.Teclado;
import modelo.Departamento;

public class Principal {
	
	public static void mostrarMenu() {
		System.out.println("0) Salir del programa");
		System.out.println("1) Insertar un departamento en la base de datos");
		System.out.println("2) Consultar todos los departamentos de la base de datos");
		System.out.println("3) Consultar un departamento, por codigo de la base de datos.");
		System.out.println("4) Actualizar un departamento, por codigo, de la base de datos");
		System.out.println("5) Eliminar un departamento por codigo, de la base de datos.");
	}
	
	public static void main(String[] args)  {

		int opcion;
		int codigo;
		String nombre;
		String ubicacion;
		Departamento dep;
		int filasAfectadas;
		List<Departamento> auxiliar;
		
		do {
		
			mostrarMenu();
			opcion = Teclado.leerEntero("Opcion : ");
			try {
				switch(opcion) {
				case 1:
					nombre = Teclado.leerCadena("Nombre Departamento : ");
					ubicacion = Teclado.leerCadena("Ubicacion Departamento : ");
					dep = new Departamento(nombre, ubicacion);
					filasAfectadas = AccesoDepartamento.insertartarDepartamento(dep);
					
					if (filasAfectadas == 1) {
						System.out.println("Se ha insertado un departamento en la base de datos.");
					}
					break;
				case 2:
					
					auxiliar = AccesoDepartamento.consultarDepartamentos();
					
					if (auxiliar.size() > 0) {
						for (Departamento d: auxiliar) {
							System.out.println(d.toString());
						}
					}
					break;
					
				case 3:
					codigo = Teclado.leerEntero("Codigo a buscar ? ");
					dep = AccesoDepartamento.consultarDepartamentoPorcodigo(codigo);
					
					if (dep != null) {
						System.out.println(dep.toString());
					} else {
						System.out.println("No se ha encontrado un departamento con ese codigo..");
					}
					
					break;
				case 4:
					
					codigo = Teclado.leerEntero("Codigo a actualizar ? ");
					dep = AccesoDepartamento.consultarDepartamentoPorcodigo(codigo);
					
					if (dep != null) {
						nombre = Teclado.leerCadena("Nombre Departamento : ");
						ubicacion = Teclado.leerCadena("Ubicacion Departamento : ");
						Departamento nuevo = new Departamento(codigo, nombre, ubicacion);
						
						if (AccesoDepartamento.actualizarDepartamentoPorCodigo(codigo, nuevo) == 1) {
							System.out.println("Se ha actualizado el departamento solicitado.");
						}
					}
					
					break;
				case 5:
					
					codigo = Teclado.leerEntero("Departamento a eliminar (Codigo) ? ");
					
					if (AccesoDepartamento.eliminarDepartamentoPorCodigo(codigo) != 0) {
						System.out.println("Se ha eliminado el departamento seleccionado");
					} else {
						System.out.println("No se ha encontrado el departamento seleccionado-");
					}
					
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
