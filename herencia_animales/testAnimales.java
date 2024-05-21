package herencia_animales;

import java.util.ArrayList;

import herencia_animales.Mascota.colores;
import herencia_animales.PerroGrande.tipos;

public class testAnimales {
	public static void main(String[] args) {
		int total = 0;
		ArrayList<Mascota> ani = new ArrayList<Mascota>();
		ani.add(new PerroGrande("PG1", 1, colores.BLANCO, 48, true, tipos.DOBERMAN));
		ani.add(new PerroGrande("PG1", 1, colores.BLANCO, 48, true, tipos.DOBERMAN));
		ani.add(new PerroMediano("PM", 15, colores.GRIS, 45, true, null));
		ani.add(new PerroPequeño("PP", 1, null, 5, false, PerroPequeño.tipos.CANICHE));
		ani.add(new PerroPequeño("PP", 1, null, 5, false, null));
		ani.add(new PerroPequeño("PP", 1, null, 5, false, null));
		ani.add(new GatoPeloLargo(null, total, null, total, total, null));
		ani.add(new GatoPeloLargo(null, total, null, total, total, null));
		ani.add(new GatoPeloCorto(null, total, null, total, total, null));
		ani.add(new GatoPeloCorto(null, total, null, total, total, null));
		ani.add(new GatoPeloCorto(null, total, null, total, total, null));
		ani.add(new GatoSinPelo(null, total, null, total, total, null));
		for (Mascota mascota : ani) {
			System.out.println(mascota);
			System.out.println(mascota.sonido());
			if (mascota instanceof Gato) { //casteo una mascota a un tipo inferior
				//en jerarquia, un gato DOWN CASTING
			 
			 System.out.println(((Gato) mascota).maullar());
			}
			if (mascota instanceof Perro) {
				System.out.println(((Perro) mascota).ladrar());
			}
			
			total += mascota.pagarImpuestosMunicipales();
			System.out.println(mascota.pagarImpuestosMunicipales());
		}
		System.out.println("total: " + total+"€");
	}
}
