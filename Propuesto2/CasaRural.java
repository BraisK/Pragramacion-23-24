package Propuesto2;

public class CasaRural extends Casa{
 
	public static final int VALOR_AREA=1500;
	
	protected int distanciaCabecera,altura;

	public CasaRural(int id, int area, String direccion, int num_habitaciones, int num_baños, int numeroPisos,
			int distanciaCabecera, int altura) {
		super(id, area, direccion, num_habitaciones, num_baños, numeroPisos);
		this.distanciaCabecera = distanciaCabecera;
		this.altura = altura;
	}

	public int getDistanciaCabecera() {
		return distanciaCabecera;
	}

	public void setDistanciaCabecera(int distanciaCabecera) {
		this.distanciaCabecera = distanciaCabecera;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "CasaRural [distanciaCabecera=" + distanciaCabecera + ", altura=" + altura + ", numeroPisos="
				+ numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id="
				+ id + ", area=" + area + ", direccion=" + direccion + "]";
	}
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return area * VALOR_AREA;
	}

}
