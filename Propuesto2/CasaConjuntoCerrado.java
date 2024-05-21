package Propuesto2;

public class CasaConjuntoCerrado extends CasaUrbana{
	public static final int VALOR_AREA=2500;
	
	protected int valorAdministracion;
	protected boolean tienePiscina;
	protected boolean tieneCamposDeportivos;
	public double getValorAdministracion() {
		return valorAdministracion;
	}
	public void setValorAdministracion(int valorAdministracion) {
		this.valorAdministracion = valorAdministracion;
	}
	public boolean isTienePiscina() {
		return tienePiscina;
	}
	public void setTienePiscina(boolean tienePiscina) {
		this.tienePiscina = tienePiscina;
	}
	public boolean isTieneCamposDeportivos() {
		return tieneCamposDeportivos;
	}
	public void setTieneCamposDeportivos(boolean tieneCamposDeportivos) {
		this.tieneCamposDeportivos = tieneCamposDeportivos;
	}
	public CasaConjuntoCerrado(int id, int area, String direccion, int num_habitaciones, int num_baños, int numeroPisos,
			int valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
		super(id, area, direccion, num_habitaciones, num_baños, numeroPisos);
		this.valorAdministracion = valorAdministracion;
		this.tienePiscina = tienePiscina;
		this.tieneCamposDeportivos = tieneCamposDeportivos;
	}
	@Override
	public String toString() {
		return "CasaConjuntoCerrado [valorAdministracion=" + valorAdministracion + ", tienePiscina=" + tienePiscina
				+ ", tieneCamposDeportivos=" + tieneCamposDeportivos + ", numeroPisos=" + numeroPisos
				+ ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBanos=" + numeroBanos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + "]";
	}
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return area * VALOR_AREA;
	}
}
