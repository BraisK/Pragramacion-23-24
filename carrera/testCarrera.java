package carrera;

import java.util.ArrayList;
import java.util.Scanner;

public class testCarrera {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Equipo> esp = new ArrayList<Equipo>();
		Ciclista dos = new Velocista(1, "aa", 12, 1.2);
		Ciclista uno = new Escalador(2, "bb", 1, 0.5);
		Ciclista tres = new Contrarrelojista(3, "cc", 14);
		ArrayList<Equipo> bra = new ArrayList<Equipo>();
		Ciclista cuatro = new Velocista(1, "dd", 12, 1.2);
		Ciclista cinco = new Escalador(2, "ee", 1, 0.5);
		Ciclista seis = new Contrarrelojista(3, "ff", 14);
		Equipo alfa = new Equipo("Vodafone", "BRA");
		alfa.añadirCiclista(uno);
		alfa.añadirCiclista(dos);
		alfa.añadirCiclista(tres);
		Equipo beta = new Equipo("Vodafone", "SPA");
		beta.añadirCiclista(uno);
		beta.añadirCiclista(dos);
		beta.añadirCiclista(tres);
		Carrera facil= new Carrera("Tourete","VIN");
		beta.añadirCiclista(uno);
		beta.añadirCiclista(dos);
		beta.añadirCiclista(tres);
		ArrayList<Ciclista> varios=new ArrayList<Ciclista>();
		facil.setClasGeneral(varios);
		facil.añadirEquip(beta);
		facil.añadirEquip(alfa);
		
		facil.calcularYMuetraTiempoParcial();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
