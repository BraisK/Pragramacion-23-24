package leerPepe;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaNacional {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int opcion;
		
		ArrayList<Libro> Libros = new ArrayList<>();
		
		Biblioteca BibliotecaNacional = new Biblioteca("Nacional",Libros);
		
		BibliotecaNacional.CargarLibros(BibliotecaNacional);
		
		
		do {
			System.out.println("\nBiblioteca Nacional");
			System.out.println("===================");
			System.out.println("1. Listado");
			System.out.println("2. Nuevo libro");
			System.out.println("3. Borrar libro");
			System.out.println("4. Buscar libro");
			System.out.println("5. Modificar libro");
			System.out.println("6. Guardar libros");
			System.out.println("7. Cargar libros");
			System.out.println("8. Salir");
			System.out.print("Introduzca una opción: ");
			opcion = sc.nextInt();
			sc.nextLine();
			System.out.println("");

			switch(opcion) {
			case 1:
				BibliotecaNacional.Imprimir();
				break;
				
			case 2:
				System.out.println("Introduce el título: ");
				String tituloAux = sc.nextLine();
				
				System.out.println("Introduce el autor: ");
				String autorAux = sc.nextLine();
				
				System.out.println("Introduce el año de publicación: ");
				int año = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Introduce la editorial: ");
				String editorialAux = sc.nextLine();
				
				System.out.println("Introduce la referencia bibliográfica: ");
				String biblioAux = sc.nextLine();
				
				BibliotecaNacional.NuevoLibro(tituloAux, autorAux, año, editorialAux, biblioAux);
				break;
			
			case 3:
				BibliotecaNacional.BorrarLibro(BibliotecaNacional.BuscarLibro());
				break;
			
			case 4:
				BibliotecaNacional.BuscarLibro();
				break;
			
			case 5:
				boolean cambio = true;
				Libro l = BibliotecaNacional.BuscarLibro();
				int atr;
				
				do {
				System.out.println("Que atributo quieres cambiar: ");
				System.out.println("1. Título");
				System.out.println("2. Autor");
				System.out.println("3. Año");
				System.out.println("4. Editorial");
				System.out.println("5. ISBN");
				System.out.println("6. Salir");
				atr = sc.nextInt();
				sc.nextLine();
				
				switch(atr) {
				case 1:
					System.out.println("Introduzca un nuevo título");
					String tituloNuevo = sc.nextLine();
					l.setTitulo(tituloNuevo);
					break;
					
				case 2:
					System.out.println("Introduzca un nuevo autor");
					String autorNuevo = sc.nextLine();
					l.setTitulo(autorNuevo);
					break;
				case 3:
					System.out.println("Introduzca un año de producción distinto");
					int añoNuevo = sc.nextInt();
					sc.nextLine();
					l.setAño(añoNuevo);
					break;
				case 4:
					System.out.println("Introduzca una editorial nueva");
					String editorialNueva = sc.nextLine();
					l.setEditorial(editorialNueva);
					break;
				case 5:
					System.out.println("Introduzca un ISBN nuevo");
					String ISBNNueva = sc.nextLine();
					l.setBibliografia(ISBNNueva);
					break;
				default:
				}
				}while(atr != 6);
				
				break;
			case 6:
				BibliotecaNacional.GuardarLibros(BibliotecaNacional);				
				break;
			
			case 7:
				BibliotecaNacional.CargarLibros(BibliotecaNacional);
				break;
			default:
			}
			
			
			
		}while(opcion != 8);
		BibliotecaNacional.GuardarLibros(BibliotecaNacional);
	}

}
