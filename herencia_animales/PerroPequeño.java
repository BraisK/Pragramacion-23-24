package herencia_animales;

public class PerroPequeño extends Perro {
	public static int impuesto = 100;

	enum tipos {
		CANICHE, YORKSHIRE_TERRIER, SCHANUZER, CHIHUAHUA;
	}

	tipos tipo;

	public PerroPequeño(String nombre, int edad, colores color, double peso, boolean morder, tipos tipo) {
		super(nombre, edad, color, peso, morder);
		this.tipo = tipo;
	}

	public tipos getTipo() {
		return tipo;
	}

	public void setTipo(tipos tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " PerroPequeño [tipo=" + tipo + "]";
	}

	public int pagarImpuestosMunicipales() {

		return prueba+impuesto+super.impuesto;
	}
}
