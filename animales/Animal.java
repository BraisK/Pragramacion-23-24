package animales;
public abstract class Animal {
	
	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nombreCientifico;

	public abstract String getSonido();

	public abstract String getAlimentos();

	public abstract String getHabitat();

	public abstract String getNombreCientifico();

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	
	
	
	

}
