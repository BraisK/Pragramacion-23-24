package Propuesto2;

public class LocalComercial extends Local {
	public static final int VALOR_AREA = 3000;
	private String centroComercial;

	public LocalComercial(int id, int area, String direccion, Propuesto2.Local.tipo localizacion,
			String centroComercial) {
		super(id, area, direccion, localizacion);
		this.centroComercial = centroComercial;
	}

	public String getCentroComercial() {
		return centroComercial;
	}

	public void setCentroComercial(String centroComercial) {
		this.centroComercial = centroComercial;
	}

	@Override
	public String toString() {
		return "LocalComercial [centroComercial=" + centroComercial + ", tipo=" + tipo + ", id=" + id + ", area=" + area
				+ ", direccion=" + direccion + "]";
	}

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return area*VALOR_AREA;
	}
}
