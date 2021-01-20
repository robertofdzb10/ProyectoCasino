package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**Clase responsable de la creación de la Base de datos.
 */
public class BaseDeDatos {
	
	private Connection con; // Conexión con la base de datos
	
	
	/**Construye un objeto para gestionar la base de datos
	 * En el caso de error a la hora de crear la Base de Datos, saca una ventana emergente indicando que ha habido un fallo.
	 */
	public BaseDeDatos() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error en la creación de la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	/**Establece conexión con la base de datos
	 * En el caso de error a la hora de establecer conexión con la Base de Datos, saca una ventana emergente indicando que ha habido un fallo.
	 * @return 
	 */
	public Connection establecerConexion() {
		try {
			con = DriverManager.getConnection("jdbc:sqlite:Casino.db");
			return con;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo encotrar la Base de Datos Casino.db", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
	}
	
	
	/**Cierra la conexión con la base de datos. La conexión debe estar abierta para poder cerrarla.
	 * En el caso de error a la hora de cerrar conexión con la Base de Datos, saca una ventana emergente indicando que ha habido un fallo.
	 */
	public void cerrarConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo desconectar correctamente de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}	
