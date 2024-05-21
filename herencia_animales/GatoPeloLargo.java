package herencia_animales;

public class GatoPeloLargo extends Gato{
	public static int impuesto = 200;
	enum tipos {ANGORA, HIMALAYO, BALINES , SOMALI	};
	tipos tipo;
	public GatoPeloLargo(String nombre, int edad, colores color, double alturaSalto, double longitudSalto, tipos tipo) {
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
		return super.toString()+" GatoPeloLargo [tipo=" + tipo + "]";
	}

public int pagarImpuestosMunicipales() {
		
		return prueba+impuesto+super.impuesto;
	}
	

}
