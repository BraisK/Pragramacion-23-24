package Propuesto1;

public class LDTexto  extends Libro{

	


	protected curso curso;

	public LDTexto(String titulo, String autor,float precio,curso curso) {
		super(titulo, autor, precio);
		this.curso=curso;
		// TODO Auto-generated constructor stub
	}

	public enum curso{uno,dos,tres,cuatro}

	

	@Override
	public String toString() {
		return "LDTexto [curso=" + curso + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	public curso getCurso() {
		return curso;
	}

	public void setCurso(curso curso) {
		this.curso = curso;
	}

	

}
