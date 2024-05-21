package colombiaz;

public class Tecnico extends Persona{
    
    private int anosExperiencia;
    private String nacionalidad;

    public Tecnico(String nombre, String apellidos,String nacionalidad, int edad, int anosExperiencia) {
        super(nombre, apellidos, edad);
        this.nacionalidad=nacionalidad;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Tecnico [anosExperiencia=" + anosExperiencia + ", getNombre()=" + getNombre() + ", getApellidos()="
                + getApellidos() + ", getEdad()=" + getEdad() + "]";
    }
}
