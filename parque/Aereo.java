package parque;

public class Aereo extends Vehiculo implements Reactor, tren {

	public Aereo(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
		// TODO Auto-generated constructor stub
	}

	public void despegar() {
		System.out.println("El vehiculo está despegando");
	}

	public void aterrizar() {
		System.out.println("El vehiculo está aterrizando");
	}

	public void volar() {
		System.out.println("El vehiculo está volando");
	}

	@Override
	public void soltar() {
		// TODO Auto-generated method stub
		System.out.println("Los Pasajeros bajaron");
	}

	@Override
	public void subir() {
		System.out.println("Los Pasajeros subieron");
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("El motor está encendido");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("El motor está apagado");
	}

}
