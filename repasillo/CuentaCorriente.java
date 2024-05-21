package repasillo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// TODO Auto-generated constructor stub
	}

	float sobregiro = 0;

	@Override
	public void retirar(float cantidad) {
		if (cantidad > this.getSaldo()) {
			sobregiro = cantidad - this.getSaldo();
			super.retirar(getSaldo());
		} else
			super.retirar(cantidad);
	}

	@Override
	public void consignar(float cantidad) {
		if (sobregiro > 0) {
			if (cantidad > sobregiro) {
				super.consignar(cantidad - sobregiro);
				sobregiro = 0;
			} else {
				sobregiro -= cantidad;
				super.consignar(0);
			}
		} else {
			super.consignar(cantidad);
		}
	}
	/*
	 * public void extractoMensual() { super.extractoMensual(); }
	 */
	// COMO NO VOY A MODIFICAR EL METODO, USO EL QUE HEREDO DIRECTAMENTE

	@Override
	public String toString() {
		return "CuentaCorriente [sobregiro=" + sobregiro + ", getSaldo()=" + getSaldo() + ", getNumeroConsignaciones()="
				+ getNumeroConsignaciones() + ", getNumeroRetiros()=" + getNumeroRetiros() + ", getComisionMensual()="
				+ getComisionMensual() + "]";
	}
	
}