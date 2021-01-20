package BD;

public class AyudaBaseDatos {
	
	private static BaseDeDatos BD = new BaseDeDatos();
	
	/**Método para la cre
	 */
	public void tablaApuestas() {
		BD.establecerConexion();
		BD.tablaApuestas();
		BD.cerrarConexion();
	}
}
