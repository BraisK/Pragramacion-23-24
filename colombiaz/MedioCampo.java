package colombiaz;

public class MedioCampo extends Jugador{
    
    int numeroAsistencia;

    public MedioCampo(String nombre, String apellidos, int edad, boolean esTitular, int numeroAsistencia) {
        super(nombre, apellidos, edad, esTitular);
        this.numeroAsistencia = numeroAsistencia;
    }

    @Override
    public String toString() {
        return "MedioCampo [numeroAsistencia=" + numeroAsistencia + ", isEsTitular()=" + isEsTitular()
                + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad()
                + "]";
    }
}
