package parque;

public class Vehiculo {
	protected int velocidadActual, velocidadMaxima;

	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		super();
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}

	public void acelerar(int num) {
		int top = this.velocidadActual += num;
		if (top <= this.velocidadMaxima) {
			this.velocidadActual = top;
		} else {
			System.out.println("Donde vas");
			this.velocidadActual = velocidadMaxima;
		}
	}

	public void frenar(int num) {
		int low = this.velocidadActual -= num;
		if (low >= 0) {
			this.velocidadActual = low;
		} else {
			System.out.println("No frenes tanto");
			this.velocidadActual=0;
		}
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

}
