package aritmetica;

import java.util.Objects;

public class Numero {

//	atributos

	protected double valor = 0;

	public Numero() {

		this.valor = 0;
	}

	public Numero(double valor) {

		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double d) {
		this.valor = d;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero other = (Numero) obj;
		return valor == other.valor;
	}

//	constructores

	public void restar(Numero num) {
		this.setValor(this.getValor() - num.getValor());
		// return this;
	}

	public void sumar(Numero num) {
		this.setValor(this.getValor() + num.getValor());
		// return this;
	}

	public void multiplicar(Numero num) {
		this.setValor(this.getValor() * num.getValor());
		// return this;
	}

	public void dividir(Numero num) {
		if (num.getValor() != 0) {

			this.setValor(this.getValor() / num.getValor());
			// return this;
		} else
			System.out.println("Operacion no valida");

	}

	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}
	

}
