package aritmetica;

public class Fraccion {

	private Numero numerador;
	private Numero denominador;

	public Fraccion(Numero num, Numero denominador) {
		this.numerador = num;
		this.denominador = denominador;
	}

	public Numero getNumerador() {
		return numerador;
	}

	public void setNumerador(Numero numerador) {
		this.numerador = numerador;
	}

	public Numero getDenominador() {
		return denominador;
	}

	public void setDenominador(Numero denominador) {
		this.denominador = denominador;
	}

	public void sumar(Fraccion otra) {

		double num1 = this.getNumerador().getValor();
		double den1 = this.getDenominador().getValor();
		double num2 = otra.getNumerador().getValor();
		double den2 = otra.getDenominador().getValor();
		double aux = den1 * den2;

		this.setNumerador(new Numero((aux / den1) * num1 + (aux / den2) * num2));
		this.setDenominador(new Numero(aux));

	}

	public void restar(Fraccion otra) {

		double num1 = this.getNumerador().getValor();
		double den1 = this.getDenominador().getValor();
		double num2 = otra.getNumerador().getValor();
		double den2 = otra.getDenominador().getValor();
		double aux = den1 * den2;

		this.setNumerador(new Numero((aux / den1) * num1 - (aux / den2) * num2));
		this.setDenominador(new Numero(aux));

	}

	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + " / denominador=" + denominador + "]";
	}

	public void multiplicar(Fraccion otra) {

		double num1 = this.getNumerador().getValor();
		double den1 = this.getDenominador().getValor();
		double num2 = otra.getNumerador().getValor();
		double den2 = otra.getDenominador().getValor();
		// double aux = den1 * den2;

		this.setNumerador(new Numero(num1 * num2));
		this.setDenominador(new Numero(den1 * den2));

	}
	public void dividir(Fraccion otra) {

		double num1 = this.getNumerador().getValor();
		double den1 = this.getDenominador().getValor();
		double num2 = otra.getNumerador().getValor();
		double den2 = otra.getDenominador().getValor();
		// double aux = den1 * den2;

		this.setNumerador(new Numero(num1 * num2));
		this.setDenominador(new Numero(den1 * den2));

	}
}
