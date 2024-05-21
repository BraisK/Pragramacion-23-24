package Propuesto2;

public class Apartamento extends Vivienda{

	public Apartamento(int id, int area, String direccion, int num_habitaciones, int num_baños) {
		super(id, area, direccion, num_habitaciones, num_baños);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apartamento [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + "]";
	}

	
}
