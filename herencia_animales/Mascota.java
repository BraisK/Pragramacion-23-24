package herencia_animales;

/*
 * Por ser mascota 50€
 * todos los perros pagarán 100€
 * los gatos 65€
 * la vacuna correspondiente a los perros grandes es 150€ mediano 125€, pequeño 100€
 * a su vez la desparasitacion de los gatos con pelo largo 200€ corto 100€ pelado 50€
 * calcule los impuestos municipales que hay que pagar una protectora, sabiendo que tiene
 * 2 Perros Grande, 1 Perro mediano, 3 PQ, 2GPL, 3GPC, 1GSP
 * */
public class Mascota {
	public static int impuesto=50;
	public enum colores {
		BLANCO, GRIS, NEGRO, NARANJA
	};
	protected String nombre;
	protected int edad;
	protected colores color;
	public Mascota(String nombre, int edad, colores color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public colores getColor() {
		return color;
	}
	public void setColor(colores color) {
		this.color = color;
	}
	public int pagarImpuestosMunicipales() {
		
		return impuesto;
	}
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	public String sonido() {
		return "soy una mascota";
	}
	

}
