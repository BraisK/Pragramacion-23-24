package herencia_animales;

public class PerroMediano extends Perro {
	public static int impuesto=125;
	enum tipos {
		COLLIE, DALMATA, BULLDOG, GALGO, SUBUESO;
	}

	tipos tipo;

	public PerroMediano(String nombre, int edad, colores color, double peso, boolean morder, tipos tipo) {
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
		return super.toString()+" PerroMediano [tipo=" + tipo + "]";
	}
public int pagarImpuestosMunicipales() {
		
	return prueba+impuesto+super.impuesto;
	}
}
