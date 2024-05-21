package Propuesto2;

public class Oficina extends Local {
	public static final double VALOR_AREA = 3500;
	private boolean esGobierno;

	public Oficina(int id, int area, String direccion, Propuesto2.Local.tipo localizacion, boolean esGobierno) {
		super(id, area, direccion, localizacion);
		this.esGobierno = esGobierno;
	}

	public boolean isEsGobierno() {
		return esGobierno;
	}

	public void setEsGobierno(boolean esGobierno) {
		this.esGobierno = esGobierno;
	}

	@Override
	public String toString() {
		return "Oficina [esGobierno=" + esGobierno + ", tipo=" + tipo + ", id=" + id + ", area=" + area + ", direccion="
				+ direccion + "]";
	}

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return area * VALOR_AREA;
	}

}
