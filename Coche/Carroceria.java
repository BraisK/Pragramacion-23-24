package Coche;

public class Carroceria {

	private String color;
	
	private tipoCarroceria tipoCarroceria;
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public tipoCarroceria getTipoCarroceria() {
		return tipoCarroceria;
	}



	public void setTipoCarroceria(tipoCarroceria tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}



	@Override
	public String toString() {
		return "Carroceria [color=" + color + ", tipoCarroceria=" + tipoCarroceria + "]";
	}





	public Carroceria(String color, tipoCarroceria tipoCarroceria) {
		super();
		this.color = color;
		this.tipoCarroceria = tipoCarroceria;
	}





	public enum tipoCarroceria{
		INDEPENDIENTE,AUTOPORTANTE,TUBULAR;
	}
}
