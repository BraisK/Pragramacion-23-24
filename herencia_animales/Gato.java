package herencia_animales;

public class Gato extends Mascota{
	public int prueba=super.impuesto;
	public int impuesto=75;
	protected double alturaSalto,longitudSalto;

	public Gato(String nombre, int edad, colores color, double alturaSalto, double longitudSalto) {
		super(nombre, edad, color);
		this.alturaSalto = alturaSalto;
		this.longitudSalto = longitudSalto;
	}

	public double getAlturaSalto() {
		return alturaSalto;
	}

	public void setAlturaSalto(double alturaSalto) {
		this.alturaSalto = alturaSalto;
	}

	public double getLongitudSalto() {
		return longitudSalto;
	}

	public void setLongitudSalto(double longitudSalto) {
		this.longitudSalto = longitudSalto;
	}

	@Override
	public String toString() {
		return super.toString()+" Gato [alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto + "]";
	}
	public String maullar() {
		return "miau mira como maúllo";
	}
	public int pagarImpuestosMunicipales() {
		prueba+=impuesto;
		return prueba;
	}
	public  String sonido() {
		String soni=super.sonido();
		return soni+" y además un gato que hace: "+maullar();
		
	}

}
