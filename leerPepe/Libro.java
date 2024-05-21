package leerPepe;

import java.io.Serializable;

public class Libro implements Serializable{

	protected String titulo;
	protected String autor;
	protected int año;
	protected String editorial;
	protected String ISBN;
	
	public Libro() {}
	
	public Libro(String titulo, String autor, int año, String editorial, String bibliografia) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.editorial = editorial;
		this.ISBN = bibliografia;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setBibliografia(String ISBN) {
		this.ISBN = ISBN;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", editorial=" + editorial
				+ ", ISBN=" + ISBN + "]";
	}
	
}
