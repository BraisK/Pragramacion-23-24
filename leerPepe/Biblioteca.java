package leerPepe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca implements Serializable {
	
	public static final String NOMBRE_FICHERO = "MisLibros.obj";
	
	static Scanner sc = new Scanner(System.in);
	
	protected String nombre;
	protected ArrayList<Libro> Libros;
	
	public Biblioteca(String nombre, ArrayList<Libro> libros) {
		this.nombre = nombre;
		Libros = libros;
	}
	
	public ArrayList<Libro> getLibros() {
		return Libros;
	}
	
	public void setLibros(ArrayList<Libro> libros) {
		Libros = libros;
	}

	public void PoblarLista() {
		Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Sudamericana", "858.67/M566");
		Libro libro2 = new Libro("Rayuela","Julio Cortázar", 1963,"Sudamericana","863.55/J667");
		Libro libro3 = new Libro("La tía Julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868.23/L567");
		Libros.add(libro1);
		Libros.add(libro2);
		Libros.add(libro3);		
	}
	
	public void NuevoLibro(String titulo, String autor, int año, String editorial, String ISBN) {
		Libro libroNuevo = new Libro(titulo, autor, año, editorial, ISBN);
		Libros.add(libroNuevo);
	}
	
	public void Imprimir() {
		System.out.println("Lista de libros: ");
		for(Libro l : Libros) {
			System.out.println("\n\t"+ l.toString());
		}
	}
	
	public Libro BuscarLibro() {
		boolean existe = false;
		Libro vacio = new Libro();
		do {
			System.out.println("Introduce el código del libro a buscar: ");
			String ref = sc.nextLine();

			for (Libro l : Libros) {
				if (l.getISBN().equals(ref)) {
					existe = true;
					return l;
				}
			}
			if (!existe) {
				System.out.println("Ese libro no existe");
			}
		
		}while(!existe);
		return vacio;
	}
	
	public void BorrarLibro(Libro l) {
		Libros.remove(l);
		
	}
	
	public static void GuardarLibros(Biblioteca BiblioGuardar) {

		try {
			FileOutputStream fileOut = new FileOutputStream(NOMBRE_FICHERO);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			// Escribimos objetos en el flujo de salida
			objectOut.writeObject(BiblioGuardar.getLibros());
			objectOut.close();
			fileOut.close();
			System.out.println("libros guardados en archivo correctamente.");
		} catch (IOException kagada) {
			System.out.println("Error al guardar en archivo: " + kagada.getMessage());
		}

	}

	public static void CargarLibros(Biblioteca BiblioGuardar) {

		try {
			FileInputStream fileIn = new FileInputStream(NOMBRE_FICHERO);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			// Casteamos la colección a obtener
			BiblioGuardar.setLibros((ArrayList<Libro>) objectIn.readObject());
			objectIn.close();
			fileIn.close();
			System.out.println("Libros cargados desde archivo correctamente.");
		} catch (IOException | ClassNotFoundException kagada) {
			System.out.println("Error al cargar desde archivo: " + kagada.getMessage());
		}
	}
	
}
