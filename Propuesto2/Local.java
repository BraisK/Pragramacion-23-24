package Propuesto2;

public class Local extends Inmueble {

	public enum tipo {
		INTERNO, CALLE
	}

	protected tipo tipo;

	public Local(int id, int area, String direccion, tipo localizacion) {
		super(id, area, direccion);
		// TODO Auto-generated constructor stub
		this.tipo = localizacion;
	}

	public tipo getTipo() {
		return tipo;
	}

	public void setTipo(tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Local [tipo=" + tipo + ", id=" + id + ", area=" + area + ", direccion=" + direccion + "]";
	}

	// TO STRING
	

}
