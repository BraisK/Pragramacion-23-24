package colombiaz;

import java.util.ArrayList;

public class TestEquipoFutbol {
	public static void main(String[] args) {

		Tecnico tecnico = new Tecnico("Claudio", " Giraldez","Español", 40, 10);

		Portero portero = new Portero("Iván", "Villar", 30, true, 1);

		ArrayList<MedioCampo> medioCampos = new ArrayList<>();

		MedioCampo medioCampo1 = new MedioCampo("Fran", "Beltran", 0, true, 28);
		medioCampos.add(medioCampo1);
		MedioCampo medioCampo2 = new MedioCampo("James", "Rodríguez", 28, true, 30);
		medioCampos.add(medioCampo2);
		MedioCampo medioCampo3 = new MedioCampo("Juan Guillermo", " Cuadrado", 31, true, 30);
		medioCampos.add(medioCampo3);
		MedioCampo medioCampo4 = new MedioCampo("Wilmar", "Barrios", 25, true, 12);
		medioCampos.add(medioCampo4);

		ArrayList<Delantero> delanteros = new ArrayList<>();

		Delantero delantero1 = new Delantero("Radamel Falcao", " García", 33, true, 15);
		delanteros.add(delantero1);
		Delantero delantero2 = new Delantero("Duván", "Zapata", 28, true, 12);
		delanteros.add(delantero2);

		ArrayList<Defensa> defensas = new ArrayList<>();

		Defensa defensa1 = new Defensa("Yerry ", "Mina", 24, true, 12);
		defensas.add(defensa1);
		Defensa defensa2 = new Defensa("Davison", " Sánchez ", 23, true, 23);
		defensas.add(defensa2);
		Defensa defensa3 = new Defensa("William ", " Tesillo ", 29, true, 4);
		defensas.add(defensa3);
		Defensa defensa4 = new Defensa("Stefan", " Medina ", 29, true, 7);
		defensas.add(defensa4);

		EquipoFutbol equipoFutbol = new EquipoFutbol("Columbus", "Colombia", portero, tecnico, medioCampos, delanteros,
				defensas);
		equipoFutbol.imprimir();
	}
}
