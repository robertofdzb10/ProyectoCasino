package BD;

/**Clase para crear tablas con inicio y cierrre de la BD incluidos.
 * @author rober
 *
 */
public class AyudaBaseDatos {
	
	private static BaseDeDatos BD = new BaseDeDatos();
	
	/**Método para la creación de la tabla Apuestas con establecimiento y cierre de conexión de la BD.
	 */
	public void tablaApuestas() {
		BD.establecerConexion();
		BD.tablaApuestas();
		BD.cerrarConexion();
	}
}
