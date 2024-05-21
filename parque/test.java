package parque;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {

		ArrayList<Vehiculo> gar = new ArrayList<Vehiculo>();
		Terrestre t = new Terrestre(100, 200);
		Acuatico A = new Acuatico(100, 150);
		Aereo fly=new Aereo(2000, 856445);
		gar.add(t);
		gar.add(A);
		gar.add(fly);
		for (Vehiculo vehiculo : gar) {
			System.out.println(vehiculo);
			if (vehiculo instanceof Terrestre) {
				vehiculo.acelerar(25);
			}
			if (vehiculo instanceof Acuatico) {
				vehiculo.frenar(5);
				System.out.println(((Acuatico) vehiculo).recomendarVelocidad(50));
			}if (vehiculo instanceof Aereo) {
				((Aereo) vehiculo).despegar();
				((Aereo) vehiculo).aterrizar();
				((Aereo) vehiculo).volar();
				((Aereo) vehiculo).apagar();
				((Aereo) vehiculo).encender();
				((Aereo) vehiculo).subir();
				((Aereo) vehiculo).soltar();
			}
			
			System.out.println(vehiculo);
		}
	}
}
