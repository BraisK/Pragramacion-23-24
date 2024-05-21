package Coche;

public class Motor {
private double volumen;

public double getVolumen() {
	return volumen;
}

public void setVolumen(double volumen) {
	this.volumen = volumen;
}

public Motor(double volumen) {
	super();
	this.volumen = volumen;
}

@Override
public String toString() {
	return "Motor [volumen=" + volumen + "]";
}

}
