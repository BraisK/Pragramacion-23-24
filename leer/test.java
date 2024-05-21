package leer;

public class test {
	public static void main(String[] args) {

		
		Biblioteca b1=new Biblioteca("Biblioteca Nacional");
		
		b1.poblarLibreria();
		b1.listado();
		b1.añadirLibro(new Libro("Prueba", "Brais", 2024, "Brais's", "1"));
		b1.listado();
		b1.borrarLibro();
		b1.listado();
		
	}
}
