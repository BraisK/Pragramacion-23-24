package Propuesto1;

import java.util.ArrayList;
import java.util.Scanner;

import Propuesto1.LDTexto.curso;
import Propuesto1.Novela.tNovela;

/*
 * Creame una coleccion de libros consitente en :
 * 1 Libro normal
 * 2 Libros de texto
 * 2 Libros de UNC
 * 3 Libros de novelas
 * Todos los libros tendran un precio aleatorio entre 0 y 10 €
 * Calcula el precio total de venta incluyendo un descuento que introducirá el usuario
 * */
public class testLibro {

	public static float ponPrecio() {
		float precio = (float) (Math.random() * 10);
		return precio;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Libro l1 = new Libro("Uno", "Uno", ponPrecio());
		Libro l2 = new LDTexto("Dos", "Dos", ponPrecio(), curso.dos);
		Libro l3 = new LDTexto("Tres", "Tres", ponPrecio(), curso.tres);
		Libro l4 = new LDTextoUNC("Cuatro", "Dos", ponPrecio(), curso.dos, "PerroSanchez");
		Libro l5 = new LDTextoUNC("Cinco", "Dos", ponPrecio(), curso.dos, "PerroSanchez");
		Libro l6 = new Novela("Seis", "gag", ponPrecio(), tNovela.AVENTURAS);
		Libro l7 = new Novela("Siete", "gag", ponPrecio(), tNovela.AVENTURAS);
		Libro l8 = new Novela("Ocho", "gag", ponPrecio(), tNovela.AVENTURAS);
		
		System.out.println("Dime descuento");
		float desc=sc.nextFloat();
		float total=l1.getPrecio()+l2.getPrecio()+l3.getPrecio()+l4.getPrecio()+l5.getPrecio()
		+l6.getPrecio()+l7.getPrecio()+l8.getPrecio();
		total-=total*(desc/100);
		System.out.println("El total es: "+total);
		
		ArrayList<Float> precios=new ArrayList<Float>();
		precios.add(l1.getPrecio());
		precios.add(l2.getPrecio());
		precios.add(l3.getPrecio());
		precios.add(l4.getPrecio());
		precios.add(l5.getPrecio());
		precios.add(l6.getPrecio());
		precios.add(l7.getPrecio());
		precios.add(l8.getPrecio());
		
	}
}
