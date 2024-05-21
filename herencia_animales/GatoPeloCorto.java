package herencia_animales;

public class GatoPeloCorto extends Gato {
	public static int impuesto = 100;

	enum tipos {
		AZUL_RUSO, BRITANICO, MANX, DEVON_REX
	};

	tipos tipo;

	public GatoPeloCorto(String nombre, int edad, colores color, double alturaSalto, double longitudSalto, tipos tipo) {
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
		return super.toString() + "GatoPeloCorto [tipo=" + tipo + "]";
	}

public int pagarImpuestosMunicipales() {
		
		return prueba+impuesto+super.impuesto;
	}
}
