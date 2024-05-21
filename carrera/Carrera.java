package carrera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Carrera {

	private String nombre, pais;
	private ArrayList<Equipo> listaEquipo;
	// private ArrayList<Ciclista> clasParcial;
	private ArrayList<Ciclista> clasGeneral;

	public ArrayList<Equipo> getListaEquipo() {
		return listaEquipo;
	}

	public void setListaEquipo(ArrayList<Equipo> listaEquipo) {
		this.listaEquipo = listaEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Carrera(String nombre, String pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.listaEquipo = new ArrayList<>();
		this.clasGeneral = new ArrayList<>();
	}

	public void añadirEquip(Equipo equipo) {
		listaEquipo.add(equipo);
	}

	public void listarEquipo(Equipo equipo) {
		for (int i = 0; i < listaEquipo.size(); i++) {
			Equipo e = (Equipo) listaEquipo.get(i);
			System.out.println(e.toString());
		}
	}

	public void buscarEquipo() {
		Scanner sc = new Scanner(System.in); /* Se solicita texto ingresado por teclado */
		System.out.println("Dame nombre");
		boolean estar = false;
		String nombreCiclista = sc.nextLine();

		if (!estar) {
			System.out.println("Ningun equipo encontrado");
		}
	}

	public void clasificacionEquipos() {
		for (int i = 0; i < listaEquipo.size(); i++) {
			Equipo c = listaEquipo.get(i);
			System.out.println(c.toString());

		}

		ListIterator<Equipo> iter = listaEquipo.listIterator();

		while (iter.hasNext()) {
			iter.next().setPosicion(iter.nextIndex());
			iter.next();

		}
	}

	public void imprimirClasificacion() {
		ListIterator<Ciclista> iter = clasGeneral.listIterator();

		while (iter.hasNext()) {
			iter.next().imprimirTipo();
		}
	}

	// calcular y mostrar el tiempo parcial ("etapa")
	public void calcularYMuetraTiempoParcial() {

		/*
		 * Este codigo no funciona for (Ciclista c : clasGeneral) {
		 * c.calculaTiempoParcial(); c.acumularTiempoTotal();
		 * Collections.sort(clasGeneral, (o1, o2) -> (int) o1.getTiempoAcumulado() -
		 * (int) o2.getTiempoAcumulado()); System.out.println(c.toString()); }
		 */
		Ciclista c;
		for (int i = 0; i < clasGeneral.size(); i++) {
			c = clasGeneral.get(i);
			c.calculaTiempoParcial();
		}
		Collections.sort(clasGeneral, (o1, o2) -> (int) o1.getTiempoParcial() - (int) o2.getTiempoParcial());

		// muestra parcial
		System.out.println("Clasificacion Parcial");
		for (Ciclista manolin : clasGeneral) {
			System.out.println(manolin);
		}
		// ACUMULA el total
		for (int i = 0; i < clasGeneral.size(); i++) {
			c = clasGeneral.get(i);
			c.acumularTiempoTotal();
		}
		// Ordena por acumulado
		Collections.sort(clasGeneral, (o1, o2) -> (int) o1.getTiempoAcumulado() - (int) o2.getTiempoAcumulado());

		// muestra Acumulado
		System.out.println("Clasificacion acumulada");
		for (Ciclista manolin : clasGeneral) {
			System.out.println(manolin);
		}

	}

	public ArrayList<Ciclista> getClasGeneral() {
		return clasGeneral;
	}

	public void setClasGeneral(ArrayList<Ciclista> clasGeneral) {
		this.clasGeneral = clasGeneral;
	}

	// calcular y mostrar el tiempo total ("general").

}
