package Coche;

public class Chasis {

	public enum tipoChasis{
		INDEPENDIENTE,MONOCASCO;
	}
	private tipoChasis tipo;
	public tipoChasis getTipo() {
		return tipo;
	}
	public void setTipo(tipoChasis tipo) {
		this.tipo = tipo;
	}
	public Chasis(tipoChasis tipo) {
		super();
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Chasis [tipo=" + tipo + "]";
	}
	
}
