package colombiaz;

public class Delantero extends Jugador{
    
    int golesAnotados;

    public Delantero(String nombre, String apellidos, int edad, boolean esTitular, int golesAnotados) {
        super(nombre, apellidos, edad, esTitular);
        this.golesAnotados = golesAnotados;
    }

    @Override
    public String toString() {
        return "Delantero [golesAnotados=" + golesAnotados + ", isEsTitular()=" + isEsTitular() + ", getNombre()="
                + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + "]";
    }
}
