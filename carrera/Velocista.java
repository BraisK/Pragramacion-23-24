package carrera;

public class Velocista extends Ciclista {
	private double potenciaPro, VelocidadPro;

	public Velocista(int identificador, String nombre, double potenciaPro, double velocidadPro) {
		super(identificador, nombre);
		this.potenciaPro = potenciaPro;
		VelocidadPro = velocidadPro;
	}

	public double getPotenciaPro() {
		return potenciaPro;
	}

	public void setPotenciaPro(double potenciaPro) {
		this.potenciaPro = potenciaPro;
	}

	public double getVelocidadPro() {
		return VelocidadPro;
	}

	public void setVelocidadPro(double velocidadPro) {
		VelocidadPro = velocidadPro;
	}

	protected void imprimir() {
		super.imprimir();
		System.out.println("Potencia promedio = " + potenciaPro);
		System.out.println("Velocidad promedio = " + VelocidadPro);
	}

	protected String imprimirTipo() {
		return "Es un velocista";

	}

}
