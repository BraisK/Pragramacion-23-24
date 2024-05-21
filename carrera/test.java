package carrera;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<Equipo> esp = new ArrayList<Equipo>();
		Ciclista dos = new Velocista(1, "Pepe", 12, 1.2);
		Ciclista uno = new Escalador(2, "PEPA", 1, 0.5);
		Ciclista tres = new Contrarrelojista(3, "Pepo", 14);

		Equipo alfa = new Equipo("Movistar", "SPA");
		alfa.añadirCiclista(uno);
		alfa.añadirCiclista(dos);
		alfa.añadirCiclista(tres);
		alfa.imprimir();
		alfa.listarEquipo();
		System.out.println("Busca ciclista");
		//System.out.println("Dame nombre");
		alfa.buscarCiclista();
	}
}
