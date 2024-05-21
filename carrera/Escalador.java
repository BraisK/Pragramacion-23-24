package carrera;

public class Escalador extends Ciclista{

	protected double  acelarionPro,gradoRampa;

	public Escalador(int identificador, String nombre, double acelarionPro, double gradoRampa) {
		super(identificador, nombre);
		this.acelarionPro = acelarionPro;
		this.gradoRampa = gradoRampa;
	}

	public double getAcelarionPro() {
		return acelarionPro;
	}

	public void setAcelarionPro(double acelarionPro) {
		this.acelarionPro = acelarionPro;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}
	protected void imprimir() {
		super.imprimir();
		System.out.println("Aceleracion promedio = " + acelarionPro);
		System.out.println("Grado de rampa = " + gradoRampa);
	}
	protected String imprimirTipo() {
		return "Es un escalador";

	}

}
