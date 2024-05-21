package Coche;

import java.util.ArrayList;
import java.util.Scanner;

import Coche.Carroceria.tipoCarroceria;
import Coche.Chasis.tipoChasis;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Motor m1 = new Motor(12);
		Chasis ch1 = new Chasis(tipoChasis.INDEPENDIENTE);
		ArrayList<Llantas> llantas = new ArrayList<Llantas>();
		Llantas l1 = new Llantas("Audi", 45, 2, 6);
		Llantas l2 = new Llantas("Audi", 45, 2, 6);
		Llantas l3 = new Llantas("Audi", 45, 2, 6);
		Llantas l4 = new Llantas("Audi", 45, 2, 6);
		llantas.add(l1);
		llantas.add(l2);
		llantas.add(l3);
		llantas.add(l4);
		Carroceria ca1 = new Carroceria("verde", tipoCarroceria.INDEPENDIENTE);
		Coche c1 = new Coche(m1, ch1, llantas, ca1);
		System.out.println(c1);

		Coche c2 = new Coche(null, null, null, null);
		System.out.println("Vamos a crear un coche");
		System.out.println("Dame el volumen del coche");
		int volu = sc.nextInt();
		c2.setMotor(new Motor(volu));
		;
		System.out.println("Dime que tipo de chasis tiene (1=Inde,2=Mono)");
		int el = sc.nextInt();
		if (el == 1)
			c2.setChasis(new Chasis(tipoChasis.INDEPENDIENTE));
		else if (el == 2)
			c2.setChasis(new Chasis(tipoChasis.MONOCASCO));
		else
			System.out.println("Por tonto te quedas sin chasis");
		System.out.println("Vamos a suponer que las llantas son todas iguales");
		System.out.println("Dime cuantas llantas quieres");
		int num = sc.nextInt();
		System.out.println("Dime marca");
		String marca = sc.next();
		System.out.println("Dime diametro");
		int dia = sc.nextInt();
		System.out.println("Dime altura");
		int alt = sc.nextInt();
		System.out.println("Dime anchura");
		int anchura = sc.nextInt();
		ArrayList<Llantas> llan = new ArrayList<Llantas>();
		for (int i = 0; i < num; i++) {
			Llantas lla = new Llantas(marca, dia, alt, anchura);
			llan.add(lla);

		}
		c2.setLlantas(llan);
		System.out.println("Dime el color de la carroceria");
		String color = sc.next();
		System.out.println("Dime que tipo de carroceria(1=inde,2=auto,3=tubu)");
		int carror = sc.nextInt();
		if (carror == 1) {
			c2.setCarroceria(new Carroceria(color, tipoCarroceria.INDEPENDIENTE));
		} else if (carror == 2) {
			c2.setCarroceria(new Carroceria(color, tipoCarroceria.AUTOPORTANTE));
		} else if (carror == 3) {
			c2.setCarroceria(new Carroceria(color, tipoCarroceria.TUBULAR));
		} else {
			System.out.println("Por tonto te quedas sin carroceria");
		}
		System.out.println(c2);
	}
}
