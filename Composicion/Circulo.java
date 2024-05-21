package Composicion;

import java.awt.Color;

public class Circulo {
	private Punto punto;
	private int radio;
	Color colorete;
	
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public Circulo(Punto punto, int radio) {
		
		this.punto = punto;
		this.radio = radio;
	}
	
	public Circulo(int radio,int x,int y,Color color) {
		punto=new Punto(x, y);
		this.radio = radio;
		this.colorete=color;
	}
	@Override
	public String toString() {
		return "Circulo [punto=" + punto + 
				", radio=" + radio + 
				", colorete=" + colorete + "]";
	}
	
	
	

}
