package leer;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	Scanner sc = new Scanner(System.in);
	String nombre;
	ArrayList<Libro> libros = new ArrayList<Libro>();

	public void añadirLibro(Libro libro) {
		libros.add(libro);
	}

	public Biblioteca(String nombre) {
		super();
		this.nombre = nombre;
	}

	public void poblarLibreria() {
		libros.add(new Libro("Cien años de soledad", "Gabriel García", 1967, "Sudamericana", "858.7M/M566"));
		libros.add(new Libro("Rayuela", "Julio  Cortazar", 1963, "Sudamericana", "863.55/M667"));
		libros.add(new Libro("La tia Julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868.23/L567"));
	}

	public void listado() {
		System.out.println("Librería " + nombre);
		for (Libro libro : libros) {
			System.out.println(libro);
		}
	}

	public void modificar() {
		System.out.println("Introduzca el ISBM del libro cuyos datos desea modificar");
		String codigoIn = sc.nextLine();
		boolean esta = false;
		Libro modi = new Libro(codigoIn);
		for (int i = 0; i < libros.size(); i++) {
			if (modi.equals(libros.get(i))) {
				System.out.println("Autor: " + libros.get(i).getAutor());
				System.out.print("Nuevo autor: ");
				String autorIn = sc.nextLine();
				if (!autorIn.equals("")) {
					libros.get(i).setAutor(autorIn);
				}

				System.out.println("Título: " + libros.get(i).getTitulo());
				System.out.print("Nuevo título: ");
				String tituloIn = sc.nextLine();
				if (!tituloIn.equals("")) {
					libros.get(i).setTitulo(tituloIn);
				}

				System.out.println("Editorial: " + libros.get(i).getEditorial());
				System.out.print("Nuevo género: ");
				String editorial = sc.nextLine();
				if (!editorial.equals("")) {
					libros.get(i).setEditorial(editorial);
				}
				System.out.println("Título: " + libros.get(i).getAnhoPublicacion());
				System.out.print("Nuevo año de publicacion: ");
				int año = sc.nextInt();

				libros.get(i).setAnhoPublicacion(año);

				esta = true;
			}

		}
		if (esta) {
			System.out.println("Se ha modificado el libro correctamente");
		} else {
			System.out.println("No se ha encontrado ningun libro con ese código");
		}
	}

	public void borrarLibro() {
		System.out.println("Dime le codigo del libro que quieras eliminar");
		boolean si = false;

		String codi = sc.nextLine();
		Libro comprobar = new Libro(codi);
		for (int i = 0; i < libros.size(); i++) {
			if (comprobar.equals(libros.get(i))) {
				libros.remove(i);
				System.out.println("Disco borrado");
				si = true;
			}

		}
		if (!si) {
			System.out.println("No se ha encontrado ningun disco con ese codigo");
		}
	}

	public static void main(String[] args) {
		int opcion = 0;
		String titulo;
		String autor;
		int anhoPublicacion;
		String editorial;
		String ISBM;
		Scanner sc = new Scanner(System.in);
		Biblioteca b1 = new Biblioteca("Biblioteca Nacional");

		b1.poblarLibreria();
		do {
			System.out.println("\nBiblioteca");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo disco");
			System.out.println("3. Modificar");
			System.out.println("4. Borrar");
			System.out.println("5. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("\nLISTADO");
				System.out.println("=======");
				b1.listado();
				break;
			case 2:
				System.out.println("\nNUEVO libro");
				System.out.println("===========");
				System.out.println("Por favor, introduzca los datos del disco.");
				System.out.print("ISBM: ");
				ISBM = sc.nextLine();
				System.out.print("Autor: ");
				autor = sc.nextLine();
				System.out.print("Título: ");
				titulo = sc.nextLine();
				System.out.print("Editorial: ");
				editorial = sc.nextLine();
				System.out.print("Año de publicaión: ");
				anhoPublicacion = Integer.parseInt(sc.nextLine());
				b1.añadirLibro(new Libro(titulo, autor, anhoPublicacion, editorial, ISBM));
				break;
			case 3:
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
				System.out.println("Introduzca el código del disco cuyos datos desea modificar");
				ISBM = sc.nextLine();
				b1.modificar();
				break;
			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");

				b1.borrarLibro();
				break;
			default:

			}

		} while (opcion != 5);
	}
}
