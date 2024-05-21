package herencia_animales;

public class Perro extends Mascota {
	public int prueba = super.impuesto;
	public static int impuesto = 100;

	protected double peso;
	protected boolean morder;

	public Perro(String nombre, int edad, colores color, double peso, boolean morder) {
		super(nombre, edad, color);
		this.peso = peso;
		this.morder = morder;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean isMorder() {
		return morder;
	}

	public void setMorder(boolean morder) {
		this.morder = morder;
	}

	@Override
	public String toString() {
		String salida = super.toString();
		salida += " Perro [peso=" + peso + ", morder=" + morder + "]";
		return salida;
	}

	public String ladrar() {
		return "gua mira como ladro";
	}

	public int pagarImpuestosMunicipales() {
		prueba += impuesto;
		return prueba;
	}

	public  String sonido() {
		String soni=super.sonido();
		return soni+" y además un perro que hace: "+ladrar();
		
	}

}
