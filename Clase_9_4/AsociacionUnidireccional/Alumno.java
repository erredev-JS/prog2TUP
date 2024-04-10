package Clase_9_4.AsociacionUnidireccional;

public class Alumno {
    private String nombre;
    private Universidad Universidad;

    public Alumno(String nombre, Universidad universidad) {
        this.nombre = nombre;
        Universidad = universidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(Universidad universidad) {
        Universidad = universidad;
    }
}
