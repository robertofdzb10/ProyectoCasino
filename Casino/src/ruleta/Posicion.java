package ruleta;

public class Posicion {
	double x,y;
	
	public Posicion(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Posicion [x=" + x + ", y=" + y + "]";
	}
	
}
