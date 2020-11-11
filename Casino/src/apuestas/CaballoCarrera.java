package apuestas;

public class CaballoCarrera {
	private float probabilidad;
	private String nombre;
	private float cuota;
	private int prueba;
	public CaballoCarrera(float probabilidad, String nombre, float cuota) {
		super();
		this.probabilidad = probabilidad;
		this.nombre = nombre;
		this.cuota = cuota;
		
	}
	public float getProbabilidad() {
		return probabilidad;
	}
	public void setProbabilidad(float probabilidad) {
		this.probabilidad = probabilidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getCuota() {
		return cuota;
	}
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
}
