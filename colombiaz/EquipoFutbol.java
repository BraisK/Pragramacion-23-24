package colombiaz;

import java.util.ArrayList;

public class EquipoFutbol {

	String nombre;
	String pais;
	Portero portero;
	Tecnico tecnico;
	ArrayList<MedioCampo> medioCampos = new ArrayList<>();
	ArrayList<Delantero> delanteros = new ArrayList<>();
	ArrayList<Defensa> defensas = new ArrayList<>();

//	Defensa[] atras= new Defensa[4];
//	MedioCampo[] centro= new MedioCampo[4];
//	Delantero[] punta= new Delantero[2];

	public EquipoFutbol(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	public EquipoFutbol(String nombre, String pais, Portero portero, Tecnico tecnico, ArrayList<MedioCampo> medioCampos,
			ArrayList<Delantero> delanteros, ArrayList<Defensa> defensas) {
		//Estoy haciendo una llamada al otro constructor más sencillo, dentro de uno más complejo
		this(nombre, pais);

		this.portero = portero;
		this.tecnico = tecnico;
		this.medioCampos = medioCampos;
		this.delanteros = delanteros;
		this.defensas = defensas;
	}

	public void imprimir() {
		System.out.println("\n			FICHA TÉCNICA - " + nombre);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\n             \tNOMBRE     \tEDAD");
		System.out.println("");
		System.out.println("\nTÉCNICOS     \t-          \t-   ");
		System.out.println();
		System.out.println("             \t" + tecnico.getNombre() + "     \t" + tecnico.getEdad());
		System.out.println("");
		System.out.println("\nPORTERO      \t-          \t-       \tGOLES RECIBIDOS");
		System.out.println();
		System.out.println("             \t" + portero.getNombre() + "     \t" + portero.getEdad() + "            \t"
				+ portero.golesRecibidos);
		System.out.println("");
		System.out.println("\nDEFENSAS      \t-          \t-       \tTARJETAS RECIBIDAS");
		System.out.println();
		for (Defensa de : defensas) {
			System.out.println("             \t" + de.getNombre() + "     \t" + de.getEdad()+ " 	\t"
					+de.getNumTarjetas());
		}
		System.out.println("");
		System.out.println("\nMEDIOCAMPOS  \t-          \t-       \tASISTENCIAS");
		System.out.println();
		for (MedioCampo m : medioCampos) {
			System.out.println("             \t" + m.getNombre() + "     \t" + m.getEdad() + "            \t"
					+ m.numeroAsistencia);
		}
		System.out.println("");
		System.out.println("\nDELANTEROS   \t-          \t-       \tGOLES");
		System.out.println();
		for (Delantero d : delanteros) {
			System.out.println(
					"             \t" + d.getNombre() + "     \t" + d.getEdad() + "            \t" + d.golesAnotados);
		}
		
	}
}
