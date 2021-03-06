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

/**Clase responsable de la creaci�n de la Base de datos.
 */
public class BaseDeDatos {
	
	private static Connection con; // Conexi�n con la base de datos
	private static Statement stat; 
	
	/**Construye un objeto para gestionar la base de datos
	 * En el caso de error a la hora de crear la Base de Datos, saca una ventana emergente indicando que ha habido un fallo.
	 */
	public BaseDeDatos() {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error en la creaci�n de la Base de Datos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	/**Establece conexi�n con la base de datos
	 * En el caso de error a la hora de establecer conexi�n con la Base de Datos, saca una ventana emergente indicando que ha habido un fallo.
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
	/**Crea una tabla Apuestas con atributos usuario (String) y apuesta (String).
	 * En el caso de error a la hora de crear la tabla Apuestas, saca una ventana emergente indicando que ha habido un fallo.
	 */
	public static void tablaApuestas() {
		String com; //Inicalizamos el com
		//Crea tabla 
		try {
		com = "CREATE TABLE APUESTAS( USUARIO STRING, APUESTA STRING)";
		System.out.println( com );
		stat.executeUpdate( com );
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo crear la tabla Apuestas", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	
	/**Cierra la conexi�n con la base de datos. La conexi�n debe estar abierta para poder cerrarla.
	 * En el caso de error a la hora de cerrar conexi�n con la Base de Datos, saca una ventana emergente indicando que ha habido un fallo.
	 */
	public void cerrarConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "No se pudo desconectar correctamente de la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}	
