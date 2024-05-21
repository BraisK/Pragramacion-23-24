package Propuesto2;

public class Vivienda extends Inmueble{
	
	protected int numeroHabitaciones = 0;
	protected int numeroBanos = 0;
	
	public Vivienda(int id, int area, String direccion, int num_habitaciones, int num_baños) {
		super(id, area, direccion);
		// TODO Auto-generated constructor stub
		this.numeroHabitaciones = num_habitaciones;
		this.numeroBanos = num_baños;
	}
	
//	GETTERS Y SETTERS
	public int getNum_habitaciones() {
		return numeroHabitaciones;
	}

	public int getNum_baños() {
		return numeroBanos;
	}

	public void setNum_habitaciones(int num_habitaciones) {
		this.numeroHabitaciones = num_habitaciones;
	}

	public void setNum_baños(int num_baños) {
		this.numeroBanos = num_baños;
	}

	@Override
	public String toString() {
		return "Vivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id="
				+ id + ", area=" + area + ", direccion=" + direccion + "]";
	}

}
