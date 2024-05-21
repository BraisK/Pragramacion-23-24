package carrera;

public class Contrarrelojista extends Ciclista {
	private double velocidadMax;

	public Contrarrelojista(int identificador, String nombre, double velocidadMax) {
		super(identificador, nombre);
		this.velocidadMax = velocidadMax;
	}

	public double getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	protected void imprimir() {
		super.imprimir();
		System.out.println("Velocidad máxima = " + velocidadMax);
	}

	protected String imprimirTipo() {
		return "Es un contrarrelojista";

	}
}
