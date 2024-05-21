package repasillo;

public class CuentaAhorro extends Cuenta {

	public CuentaAhorro(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// TODO Auto-generated constructor stub
		this.activa = this.isActiva();
	}

	/*
	 * posee un atributo para determinar si la cuenta de ahorros está activa (tipo
	 * boolean). Si el saldo es menor a $10000, la cuenta está inactiva, en caso
	 * contrario se considera activa.
	 */
	private boolean activa;

	// Metodo similar a un metodo set
	public boolean isActiva() {
		if (this.getSaldo() > 10000)
			return true;
		else
			return false;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	// metodos de ejercicio
	@Override
	public void consignar(float cantidad) {
		if (isActiva())
			super.consignar(cantidad);
		else
			System.out.println("Cuenta no activa");
	}
	@Override
	public void retirar(float cantidad) {
		if (isActiva())
			super.retirar(cantidad);
		else
			System.out.println("Cuenta no activa");
	}
	@Override
	public void extractoMensual() {
		if (this.getNumeroRetiros() > 4) {
			this.comisionMensual = (this.getComisionMensual() - 4) * 1000;
			super.extractoMensual();
			activa = isActiva();
		}
	}

	@Override
	public String toString() {
		return "CuentaAhorro [getSaldo()=" + getSaldo() + ", getNumeroConsignaciones()=" + getNumeroConsignaciones()
				+ ", getNumeroRetiros()=" + getNumeroRetiros() + ", getComisionMensual()=" + getComisionMensual() + "]";
	}

	
}