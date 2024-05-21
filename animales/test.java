package animales;

import java.util.ArrayList;

public class test {
public static void main(String[] args) {
		
		ArrayList<Animal> animal = new ArrayList();
		
		Animal perro1 = new Perro();
		Animal lobo1 = new Lobo();
		animal.add(perro1);
		animal.add(lobo1);
		
		Animal gato1 = new Gato();
		Animal leon1 = new Leon();
		animal.add(gato1);
		animal.add(leon1);
		
		for(Animal a : animal) {
			
			System.out.println("\nEspecificaciones de "+a.getNombreCientifico()+": ");
			System.out.println(" -Alimento: "+a.getAlimentos());
			System.out.println(" -Habitat: "+a.getHabitat());
			System.out.println(" -Sonido: "+a.getSonido());
			
		}
		
	}
}
