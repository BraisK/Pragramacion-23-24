package Propuesto2;

public class CasaUrbana extends Casa{

	public CasaUrbana(int id, int area, String direccion, int num_habitaciones, int num_baños, int numeroPisos) {
		super(id, area, direccion, num_habitaciones, num_baños, numeroPisos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CasaUrbana [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	

}
