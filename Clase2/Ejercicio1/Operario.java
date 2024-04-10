package Clase2.Ejercicio1;

public class Operario extends Empleado{
    private String apellido;

    public Operario(String nombre, String apellido) {
        super(nombre);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void operar(){
        System.out.println("El operario " + this.getNombre() + apellido + " está operando maquinaria");
    }
    @Override
    public String toString(){
        String s = super.toString() + " " + apellido;
        return s;
    }
}
