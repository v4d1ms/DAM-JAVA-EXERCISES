package empleados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class GestorEmpleados {
	
	private File datos;
	
	public GestorEmpleados(File datos) {
		this.datos = datos;
	}
	
	public int ultimoCodigo() throws IOException {
		List<Empleado> empleados = this.mostrarEmpleados();
		int codigo = 0;
		
		for (Empleado m : empleados) {
			if (m.getCodigo() > codigo) {
				codigo = m.getCodigo();
			}
		}
		
		return codigo;
	}
	
	
	public void insertarEmpleadoPorCodigoAutoincremental(Empleado emp) throws IOException {
		FileWriter escritor = new FileWriter(datos, true);
		BufferedWriter flujoEscritura = null;
		emp.setCodigo(this.ultimoCodigo() + 1);	
		
		try {
			flujoEscritura = new BufferedWriter(escritor);
			flujoEscritura.write(emp.toStringWithSep());
			flujoEscritura.newLine();
		}
		finally {
			if (flujoEscritura != null) {
				flujoEscritura.close();
			}
		}		
	}
	
	public List<Empleado> ordenarAscPorNombre() throws IOException {
		List<Empleado> empleados = this.mostrarEmpleados();
		Collections.sort(empleados, new OrdenarEmpleadoAsc());
		
		File aux = new File("auxiliar.txt");
		FileWriter auxiliar = new FileWriter(aux);
		BufferedWriter escritura = null;
		
		try {
			escritura = new BufferedWriter(auxiliar);
			
			for (Empleado e : empleados) {
				escritura.write(e.toStringWithSep());
				escritura.newLine();
			}
		} finally {
			
			if (escritura != null) {
				escritura.close();
			}
			
			datos.delete();
			aux.renameTo(new File("empleados.txt"));
		}

		return empleados;
	}
	
	
	public boolean eliminarEmpleado(int codigo) throws IOException {
		Empleado emp = this.consultarEmpleado(codigo);
		File aux = new File("auxiliar.txt");
		FileReader archivo = new FileReader(this.datos);
		FileWriter auxiliar = new FileWriter(aux);
		BufferedReader lectura = null;
		BufferedWriter escritura = null;
		Boolean eliminado = false;
		
		try {
			lectura = new BufferedReader(archivo);
			escritura = new BufferedWriter(auxiliar);
			String linea = lectura.readLine();
			
			while (linea != null) {
				if (!linea.equals(emp.toStringWithSep())) {						
					escritura.write(linea);
					escritura.newLine();
				}
				
				linea = lectura.readLine();
			}
			
			eliminado = true;
		} finally {
			
			if (lectura != null) {
				lectura.close();
			}
			
			if (escritura != null) {
				escritura.close();
			}
			
			datos.delete();
			aux.renameTo(new File("empleados.txt"));
		}
				
		return eliminado;
	}
	
	public boolean actualizarEmpleado(int codigo, Empleado em) throws IOException {
		Empleado emp = this.consultarEmpleado(codigo);
		File aux = new File("auxiliar.txt");
		FileReader archivo = new FileReader(this.datos);
		FileWriter auxiliar = new FileWriter(aux);
		BufferedReader lectura = null;
		BufferedWriter escritura = null;
		Boolean actualizado = false;
		
		try {
			lectura = new BufferedReader(archivo);
			escritura = new BufferedWriter(auxiliar);
			String linea = lectura.readLine();
			
			while (linea != null) {
				if (linea.equals(emp.toStringWithSep())) {						
					escritura.write(em.toStringWithSep());
					escritura.newLine();
				} else {
					escritura.write(linea);
					escritura.newLine();
				}
				
				linea = lectura.readLine();
			}
			
			actualizado = true;
		} finally {
			
			if (lectura != null) {
				lectura.close();
			}
			
			if (escritura != null) {
				escritura.close();
			}
			
			datos.delete();
			aux.renameTo(new File("empleados.txt"));
		}
				
		return actualizado;
	}
	
	public List<Empleado> mostrarEmpleadosPorDepartamento(String departamento) throws IOException {
		List<Empleado> lista = new LinkedList<>();
		FileReader archivo = new FileReader(this.datos);	
		BufferedReader lectura = null;
		try {			
			lectura = new BufferedReader(archivo);
			String linea = lectura.readLine();
			
			while (linea != null) {
				Empleado emp = new Empleado(linea);
				if (emp.getDepartamento().contentEquals(departamento)) {					
					lista.add(new Empleado(linea));
				}
				linea = lectura.readLine();
			}
		} finally {
			if (lectura != null) {
				lectura.close();
			}
		}
		return lista;
	}
	
	public List<Empleado> mostrarEmpleados() throws IOException {
		List<Empleado> lista = new LinkedList<>();
		FileReader archivo = new FileReader(this.datos);	
		BufferedReader lectura = null;
		try {			
			lectura = new BufferedReader(archivo);
			String linea = lectura.readLine();
			
			while (linea != null) {
				lista.add(new Empleado(linea));
				linea = lectura.readLine();
			}
			
		} finally {
			if (lectura != null) {
				lectura.close();
			}
		}
		
		return lista;
	}
	
	public void insertarEmpleado(Empleado emp) throws IOException {
		FileWriter escritor = new FileWriter(datos, true);
		BufferedWriter flujoEscritura = null;
			
		try {
			flujoEscritura = new BufferedWriter(escritor);
			flujoEscritura.write(emp.toStringWithSep());
			flujoEscritura.newLine();
		}
		finally {
			if (flujoEscritura != null) {
				flujoEscritura.close();
			}
		}		
	}
	
	public Empleado consultarEmpleado(int codigo) throws IOException {
		BufferedReader lectura = null;
		Empleado emp = null;
		
		try {			
			FileReader archivo = new FileReader(this.datos);	
			lectura = new BufferedReader(archivo);
			String line = lectura.readLine();

			while (line != null) {
				emp = new Empleado(line);
				if (codigo == emp.getCodigo()) {
					return emp;
				}
				line = lectura.readLine();
			}
			
			return null;
		} finally {
			if (lectura != null) {
				lectura.close();
			}			
		}
	}
}
