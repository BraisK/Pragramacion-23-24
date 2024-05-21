package herencia_animales;

public class PerroGrande extends Perro{
	
	public static int impuesto=150;
	public enum tipos {
		PASTOR_ALEMAN, DOBERMAN, ROTWEILLRT
	};

	protected tipos tipo;

	

	public PerroGrande(String nombre, int edad, colores color, double peso, boolean morder, tipos tipo) {
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
		return super.toString() + " PerroGrande [tipo=" + tipo + "]";
	}
public int pagarImpuestosMunicipales() {
		
		return prueba+impuesto+super.impuesto;
	}
}
