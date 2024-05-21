package Propuesto1;

public class Novela extends Libro {

	protected tNovela tNovela;

	public Novela(String titulo, String autor, float precio, tNovela tNovela) {
		super(titulo, autor, precio);
		this.tNovela = tNovela;
		// TODO Auto-generated constructor stub
	}

	public Novela(String titulo, String autor, tNovela tNovela) {
		super(titulo, autor);
		this.tNovela = tNovela;
		// TODO Auto-generated constructor stub
	}

	public enum tNovela {
		HISTORICA, ROMANTICA, POLICIACA, REALISTA, CIENCIAFICCION, AVENTURAS
	}

	@Override
	public String toString() {
		return "Novela [tNovela=" + tNovela + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	public tNovela gettNovela() {
		return tNovela;
	}

	public void settNovela(tNovela tNovela) {
		this.tNovela = tNovela;
	}

}
