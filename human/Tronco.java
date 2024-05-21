package human;

public class Tronco {
	String nombre;
	double ancho;
	double largo;
	boolean Ombligo=true;
	public Tronco() {
		// TODO Auto-generated constructor stub
	}
	public Tronco(String nombre, double ancho, double largo, boolean ombligo) {
		super();
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		Ombligo = ombligo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public boolean isOmbligo() {
		return Ombligo;
	}
	public void setOmbligo(boolean ombligo) {
		Ombligo = ombligo;
	}
	@Override
	public String toString() {
		return "Tronco [nombre=" + nombre + ", ancho=" + ancho + ", largo=" + largo + ", Ombligo=" + Ombligo + "]";
	}
	
}
