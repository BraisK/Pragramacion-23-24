package Pedido;

public class Producto {

	private int indentificador;
	private String nombre;
	private String descripcion;
	private double precio;
	public Producto(int indentificador, String nombre, String descripcion, double precio) {
		this.indentificador = indentificador;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	public int getIndentificador() {
		return indentificador;
	}
	public void setIndentificador(int indentificador) {
		this.indentificador = indentificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	 @Override
	    public String toString() {
	        return "Producto [nombre=" + nombre +	                          
	               ", precio=" + precio + "]";
	    }
	
	
	
}
