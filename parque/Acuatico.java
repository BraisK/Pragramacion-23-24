package parque;

public class Acuatico extends Vehiculo implements Motor, Vela{

	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}

	

	
	@Override
	public int calcularRevolucionMotor(int fuerza, int radio) {
		// TODO Auto-generated method stub
		return fuerza*radio;
	}

	@Override
	public int recomendarVelocidad(int velocidadViento) {
		// TODO Auto-generated method stub
		return this.velocidadMaxima=velocidadViento/2;
	}
	
}
