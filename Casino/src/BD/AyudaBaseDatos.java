package BD;

/**Clase para crear tablas con inicio y cierrre de la BD incluidos.
 * @author rober
 *
 */
public class AyudaBaseDatos {
	
	private static BaseDeDatos BD = new BaseDeDatos();
	
	/**M�todo para la creaci�n de la tabla Apuestas con establecimiento y cierre de conexi�n de la BD.
	 */
	public void tablaApuestas() {
		BD.establecerConexion();
		BD.tablaApuestas();
		BD.cerrarConexion();
	}
}
