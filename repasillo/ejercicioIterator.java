package repasillo;

import java.util.ArrayList;
import java.util.Iterator;

public class ejercicioIterator {
	public static ArrayList<String> pueblaLista() {
		ArrayList<String> numeros = new ArrayList<String>();
		numeros.add("uno");
		numeros.add("dos");
		numeros.add("tres");
		numeros.add("cuatro");
		numeros.add("cinco");
		numeros.add("seis");
		numeros.add("siete");
		numeros.add("ocho");
		numeros.add("nueve");
		numeros.add("diez");

		return numeros;
	}

	public static void main(String[] args) {
		ArrayList<String> array = pueblaLista();
		/*
		 * for (int i = 0; i < array.size(); i++) { System.out.println(array.get(i)); }
		 */
		// empleando un elemento iterator para recorrer la coleccion

		System.out.println("Elementos de array recorridos por Iterator");
		Iterator<String> iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		iterator.remove();
		System.out.println("Elementos después del remover Iterator:");
		// Reasignamos de nuevo un iterador a la referencia que tenemos
		iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println("Que ha pasado?");
		System.out.println(array);
	}
}
