package acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Empleado;

public class AccesoEmpleado {

	public static int insertarEmpleadoEnDepartamento(Empleado emp) throws ClassNotFoundException, SQLException {
		Connection conex = null;
		int filasActualizadas = 0;
		
		try {
			conex = ConfigDB.abrirConexion();
			String sentenciaSQL = "INSERT INTO empleado(nombre, fecha_alta, salario, codigo_departamento) values(?, ?, ?, ?)";
			
			PreparedStatement preparar = conex.prepareStatement(sentenciaSQL);
			
			preparar.setString(1, emp.getNombre());
			preparar.setString(2, emp.getFechaAlta());
			preparar.setDouble(3, emp.getSalario());
			preparar.setInt(4, emp.getCodigoDepartamento());
			
			filasActualizadas = preparar.executeUpdate();
			
		} finally {
			ConfigDB.cerrarConexion(conex);
		}

		return filasActualizadas;
	}
	
	public static List<Empleado> consultarEmpleados() throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado emp;
		
		try {
			
			conexion = ConfigDB.abrirConexion();
			String sentenciaSQL = "select * from empleado";
			Statement estado = conexion.createStatement();
			ResultSet datos = estado.executeQuery(sentenciaSQL);
			
			while (datos.next()) {
				emp = new Empleado(datos.getInt("codigo"),
						datos.getString("nombre"), 
						datos.getString("fecha_alta"), 
						datos.getDouble("salario"),
						datos.getInt("codigo_departamento"));
				
				empleados.add(emp);
			}
			
			return empleados;
			
		} finally {
			ConfigDB.cerrarConexion(conexion);
		}

	}
	
}
