package apuestas;

public class Partido {

	protected Equipo equipo1;
	protected Equipo equipo2;
	protected Equipo ganador;
	protected String hora;
	protected String fecha;
	protected float cuotaEquipo1;
	protected float cuotaEquipo2;
	protected float cuotaEmpate;
	protected String marcador;
	
	public Partido(Equipo equipo1, Equipo equipo2, Equipo ganador, String hora, String fecha, float cuotaEquipo1,
			float cuotaEquipo2, float cuotaEmpate, String marcador) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.ganador = ganador;
		this.hora = hora;
		this.fecha = fecha;
		this.cuotaEquipo1 = cuotaEquipo1;
		this.cuotaEquipo2 = cuotaEquipo2;
		this.cuotaEmpate = cuotaEmpate;
		this.marcador = marcador;
	}
	
	
	public Equipo getEquipo1() {
		return equipo1;
	}


	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}


	public Equipo getEquipo2() {
		return equipo2;
	}


	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}


	public Equipo getGanador() {
		return ganador;
	}


	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public float getCuotaEquipo1() {
		return cuotaEquipo1;
	}


	public void setCuotaEquipo1(float cuotaEquipo1) {
		this.cuotaEquipo1 = cuotaEquipo1;
	}


	public float getCuotaEquipo2() {
		return cuotaEquipo2;
	}


	public void setCuotaEquipo2(float cuotaEquipo2) {
		this.cuotaEquipo2 = cuotaEquipo2;
	}


	public float getCuotaEmpate() {
		return cuotaEmpate;
	}


	public void setCuotaEmpate(float cuotaEmpate) {
		this.cuotaEmpate = cuotaEmpate;
	}


	public String getMarcador() {
		return marcador;
	}


	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}



	
}
