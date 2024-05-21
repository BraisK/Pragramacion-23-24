package Propuesto2;

public class ApartamentoFamiliar extends Apartamento{
	public static final int VALOR_AREA=2000;
	protected int valorAdministracion;
	public int getValorAdministracion() {
		return valorAdministracion;
	}
	public void setValorAdministracion(int valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}
	public ApartamentoFamiliar(int id, int area, String direccion, int num_habitaciones, int num_baños,
			int valorAdministracion) {
		super(id, area, direccion, num_habitaciones, num_baños);
		this.valorAdministracion = valorAdministracion;
	}
	@Override
	public String toString() {
		return "ApartamentoFamiliar [valorAdministracion=" + valorAdministracion + ", numeroHabitaciones="
				+ numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return area * VALOR_AREA;
	}

}
