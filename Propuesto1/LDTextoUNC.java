package Propuesto1;

public class LDTextoUNC extends LDTexto{

	public LDTextoUNC(String titulo, String autor, float precio,curso curso,String facultad) {
		super(titulo, autor, precio, curso);
		this.facultad=facultad;
		// TODO Auto-generated constructor stub
	}
	protected String facultad;
	@Override
	public String toString() {
		return "LDTextoUNC [facultad=" + facultad + ", curso=" + curso + ", titulo=" + titulo + ", autor=" + autor
				+ ", precio=" + precio + "]";
	}
	
	

}
