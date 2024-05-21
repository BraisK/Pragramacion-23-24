package colombiaz;

public class Defensa extends Jugador{

	private int numTarjetas;    

    public Defensa(String nombre, String apellidos, int edad, boolean esTitular, int numTarjetas) {
		super(nombre, apellidos, edad, esTitular);
		this.numTarjetas = numTarjetas;
	}

	public int getNumTarjetas() {
		return numTarjetas;
	}

	public void setNumTarjetas(int numTarjetas) {
		this.numTarjetas = numTarjetas;
	}

	@Override
	public String toString() {
		return "Defensa [numTarjetas=" + numTarjetas + ", toString()=" + super.toString() + "]";
	}
 
}
