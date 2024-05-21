package human;

public class Cuerpo {
	Cabeza cabeza;
	Tronco tronco;
	Brazo brazo1;
	Brazo brazo2;
	
	Pierna pierna1;
	Pierna pierna2;
	
	
	
	public Cuerpo() {
	System.out.println("Creando un cuerpecito...");
		this.cabeza = new Cabeza();
		this.tronco = new Tronco();
		this.brazo1 = new Brazo();
		this.brazo2 = new Brazo();
		this.pierna1 = new Pierna();
		this.pierna2 = new Pierna();
	}

	

	@Override
	public String toString() {
		return "Cuerpo [\n "+
				 "brazo1=" + brazo1 + ",\n brazo2=" + brazo2 + ",\n cabeza=" + cabeza + ",\n pierna1=" + pierna1
				+ ",\n pierna2=" + pierna2 + ",\n tronco=" + tronco + "]";
	}
	
	
}
