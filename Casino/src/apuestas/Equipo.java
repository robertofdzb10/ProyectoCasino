package apuestas;

public class Equipo {
	
	protected String nombre;
	protected int goles;

	public Equipo(String nombre, int goles) {
		super();
		this.nombre = nombre;
		this.goles = goles;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getGoles() {
		return goles;
	}
	public void setGoles(int goles) {
		this.goles = goles;
	}
	
}
