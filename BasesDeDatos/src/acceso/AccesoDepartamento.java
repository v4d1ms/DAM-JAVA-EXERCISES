package acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Departamento;

public class AccesoDepartamento {

	public static int insertartarDepartamento(Departamento departamento) throws ClassNotFoundException, SQLException {
		
		Connection conexion = null;
		int filas = 0;
		
		try {
			conexion = ConfigDB.abrirConexion();
			String sentenciaSQL = "INSERT INTO departamento(nombre, ubicacion) values(?, ?)";
			
			PreparedStatement preparar = conexion.prepareStatement(sentenciaSQL);
			
			preparar.setString(1, departamento.getNombre());
			preparar.setString(2, departamento.getUbicacion());
			filas = preparar.executeUpdate();
			
			return filas;
		} finally {
			ConfigDB.cerrarConexion(conexion);
		}
	}
	
	public static List<Departamento> consultarDepartamentos() throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		List<Departamento> departamentos = new ArrayList<Departamento>();
		Departamento dep;
		
		try {
			conexion = ConfigDB.abrirConexion();
			String sentenciaSQL = "select * from departamento";
			Statement estado = conexion.createStatement();
			ResultSet datos = estado.executeQuery(sentenciaSQL);
			
			while (datos.next()) {
				dep = new Departamento(datos.getInt("codigo"),
						datos.getString("nombre"), datos.getString("ubicacion"));
				departamentos.add(dep);
			}
			
			return departamentos;
		} finally {
			ConfigDB.cerrarConexion(conexion);
		}
	}
	
	public static Departamento consultarDepartamentoPorcodigo(int codigo) throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		Departamento dep = null;
		
		try {
			conexion = ConfigDB.abrirConexion();
			String sentenciaSQL = "select * from departamento where codigo = ?";
			PreparedStatement preparar = conexion.prepareStatement(sentenciaSQL);
			preparar.setInt(1, codigo);
			
			ResultSet datos = preparar.executeQuery();
			
			if (datos.next()) {
				int cod = codigo;
				String nombre = datos.getString("nombre");
				String ubicacion = datos.getString("ubicacion");
				
				dep = new Departamento(cod, nombre, ubicacion);
			}
			
			return dep;
		} finally {
			ConfigDB.cerrarConexion(conexion);
		}
	}
	
	public static int actualizarDepartamentoPorCodigo(int codigo, Departamento dep) throws ClassNotFoundException, SQLException {
		Connection conexion = null;
		int filasActualizadas = 0;
		
		try {
			conexion = ConfigDB.abrirConexion();
						
				
			String sentenciaSQL = "UPDATE departamento set nombre = ?, ubicacion = ? where codigo = ?";
			PreparedStatement estado = conexion.prepareStatement(sentenciaSQL);
			estado.setString(1, dep.getNombre());
			estado.setString(2, dep.getUbicacion());
			estado.setInt(3, codigo);
				
			filasActualizadas = estado.executeUpdate();
			
			return filasActualizadas;
		} finally {
			ConfigDB.cerrarConexion(conexion);
		}
	}
	
	public static int eliminarDepartamentoPorCodigo(int codigo) throws ClassNotFoundException, SQLException {
		int filasActualizadas = 0;
		Connection conex = null;
		
		try {			
			
			if (consultarDepartamentoPorcodigo(codigo) != null) {				
				conex = ConfigDB.abrirConexion();
				
				String sentenciaSQL = "DELETE FROM departamento where codigo = ?";
				PreparedStatement estado = conex.prepareStatement(sentenciaSQL);
				estado.setInt(1, codigo);
				
				filasActualizadas = estado.executeUpdate();
			}
		} finally {
			ConfigDB.cerrarConexion(conex);
		}
		return filasActualizadas;
	}
}
