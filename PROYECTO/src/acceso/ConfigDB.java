package acceso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.SQLiteConfig;

public class ConfigDB {
	private final static String NOMBRE_DRIVER = "org.sqlite.JDBC";
	private final static String RUTA_DB = "jdbc:sqlite:BaseDatos/Campeonato.db";
	
	public static Connection abrirConexion() throws SQLException, ClassNotFoundException {
		Connection conexion = null;
		Class.forName(NOMBRE_DRIVER);
		SQLiteConfig cfg = new SQLiteConfig();
		cfg.enforceForeignKeys(true);
		conexion = DriverManager.getConnection(RUTA_DB, cfg.toProperties());
		
		return conexion;
	}

	public static void cerrarConexion(Connection conexion) throws ClassNotFoundException, SQLException {
		
		if (conexion != null && !conexion.isClosed()) {			
			conexion.close();		
		}
	}
	
}
