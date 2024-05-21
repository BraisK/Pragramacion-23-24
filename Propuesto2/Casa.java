package Propuesto2;

public class Casa extends Vivienda {

	protected int numeroPisos;	
	
	public Casa(int id, int area, String direccion, int num_habitaciones, int num_baños, int numeroPisos) {
		super(id, area, direccion, num_habitaciones, num_baños);
		this.numeroPisos = numeroPisos;
	}

	public int getNumeroPisos() {
		return numeroPisos;
	}

	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}

	@Override
	public String toString() {
		return "Casa [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos="
				+ numeroBanos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	

}
