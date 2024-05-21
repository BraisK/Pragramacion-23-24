package Propuesto2;

public class CasaIndependiente extends CasaUrbana{
	public static final int VALOR_AREA=3000;

	public CasaIndependiente(int id, int area, String direccion, int num_habitaciones, int num_baños, int numeroPisos) {
		super(id, area, direccion, num_habitaciones, num_baños, numeroPisos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CasaIndependiente [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return area * VALOR_AREA;
	}
}
