package parque;

public class Terrestre extends Vehiculo implements Motor{

	public Terrestre(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}

	
	public int calcularRevolucionMotor(int fuerza,int radio) {
		return fuerza*radio;
	}
}
