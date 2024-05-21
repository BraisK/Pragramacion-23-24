package leer;

import java.util.Objects;

public class Libro {

	String titulo;
	String autor;
	int anhoPublicacion;
	String editorial;
	String ISBM;

	public Libro(String titulo, String autor, int anhoPublicacion, String editorial, String ISBM) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anhoPublicacion = anhoPublicacion;
		this.editorial = editorial;
		this.ISBM = ISBM;
	}

	
	public Libro(String iSBM) {
		super();
		ISBM = iSBM;
	}


	public Libro() {
		// TODO Auto-generated constructor stub
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public int getAnhoPublicacion() {
		return anhoPublicacion;
	}


	public void setAnhoPublicacion(int anhoPublicacion) {
		this.anhoPublicacion = anhoPublicacion;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public String getISBM() {
		return ISBM;
	}


	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}


	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anhoPublicacion=" + anhoPublicacion + ", editorial="
				+ editorial + ", referencia=" + ISBM + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(ISBM);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(ISBM, other.ISBM);
	}
	

}
