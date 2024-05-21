package Coche;

import java.util.ArrayList;

public class Coche {

	protected Motor motor;
	protected Chasis chasis;
	protected ArrayList<Llantas> llantas= new ArrayList<Llantas>();
	protected Carroceria carroceria;
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Chasis getChasis() {
		return chasis;
	}
	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}
	public ArrayList<Llantas> getLlantas() {
		return llantas;
	}
	public void setLlantas(ArrayList<Llantas> llantas) {
		this.llantas = llantas;
	}
	public Carroceria getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(Carroceria carroceria) {
		this.carroceria = carroceria;
	}
	public Coche(Motor motor, Chasis chasis, ArrayList<Llantas> llantas, Carroceria carroceria) {
		super();
		this.motor = motor;
		this.chasis = chasis;
		this.llantas = llantas;
		this.carroceria = carroceria;
	}
	@Override
	public String toString() {
		return "Coche [motor=" + motor + ", chasis=" + chasis + ", llantas=" + llantas + ", carroceria=" + carroceria
				+ "]";
	}
	
	
}
