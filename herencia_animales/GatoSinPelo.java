package herencia_animales;

public class GatoSinPelo extends Gato {
	public static int impuesto = 50;
	enum tipos {
		ESFINGE, ELFO, DONSKOY
	};

	tipos tipo;

	public GatoSinPelo(String nombre, int edad, colores color, double alturaSalto, double longitudSalto, tipos tipo) {
		super(nombre, edad, color, alturaSalto, longitudSalto);
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
		return super.toString()+"GatoSinPelo [tipo=" + tipo + "]";
	}

public int pagarImpuestosMunicipales() {
		
		return prueba+impuesto+super.impuesto;
	}
}
