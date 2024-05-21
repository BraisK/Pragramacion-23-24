package Propuesto2;

public class ApartaEstudio extends Apartamento{
	public static final int VALOR_AREA=1500;
	public ApartaEstudio(int id, int area, String direccion, int num_habitaciones, int num_baños) {
		super(id, area, direccion, num_habitaciones, num_baños);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ApartaEstudio [numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + "]";
	}
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return area * VALOR_AREA;
	}

}
