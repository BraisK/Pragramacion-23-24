package Pedido;

public class test {
	public static void main(String[] args) {

		Producto p1=new Producto(1, "Carpeta", "Carpeta anillada metalica", 1000);
		Producto p2=new Producto(2, "Tinta", "Tinta china de color negro", 3000);
		Producto p3=new Producto(3, "Cinta pegante", "Cinta adhesiva de color transparente", 800);
		Producto p4=new Producto(4, "Cartulina", "Pliego de cartulina 60 x 40 cm", 600);

		Orden orden=new Orden(1);
		
		orden.añadirItem(1, 5, p1);
		orden.añadirItem(2, 3, p2);
		orden.añadirItem(3, 2, p3);
		orden.añadirItem(4, 4, p4);
		
		System.out.println(orden);
		
	}
}
