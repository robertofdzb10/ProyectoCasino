package BD;

public class AyudaBaseDatos {
	
	private static BaseDeDatos BD = new BaseDeDatos();
	
	/**M�todo para la cre
	 */
	public void tablaApuestas() {
		BD.establecerConexion();
		BD.tablaApuestas();
		BD.cerrarConexion();
	}
}
