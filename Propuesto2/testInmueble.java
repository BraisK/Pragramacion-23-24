package Propuesto2;

import java.util.ArrayList;

import Propuesto2.Local.tipo;

public class testInmueble {
	
	//area random para inmueble y herederas
	public static int generaArea() {
		return (int) (30+Math.random() * 120);
	}

	public static void main(String[] args) {
		ArrayList<Inmueble> col=new ArrayList();
		col.add(new Oficina(1, generaArea(), "CAmia", tipo.CALLE, false));
		col.add(new LocalComercial(2, generaArea(), "CAsa", tipo.CALLE, "efaq"));
		col.add(new ApartaEstudio(3, generaArea(), null, 5, 4));
		col.add(new ApartamentoFamiliar(4, generaArea(), null, 2, 6, 45));
		col.add(new CasaConjuntoCerrado(5, generaArea(), null, 7, 1, 3, 65, false, false));
		col.add(new CasaIndependiente(6, generaArea(), null, 2, 2, 4));
		col.add(new CasaRural(7, generaArea(), null, 3, 3, 4, 123, 54));
		double total=0d;
		for (Inmueble inmueble : col) {
			System.out.println(inmueble.calcularPrecioVenta());
			total+=inmueble.calcularPrecioVenta();
			System.out.println(inmueble);
		}
		System.out.println("Precio todos "+total);
		System.out.println("Iva 21%: "+total*0.21);
		System.out.println("Total: "+total*1.21);
	}
}
