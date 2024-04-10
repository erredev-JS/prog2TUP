package Clase2.Ejercicio1;

public class Oficial extends Operario{
    private double sueldo;

    public Oficial(String nombre, String apellido, double sueldo) {
        super(nombre, apellido);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void aumento(){
        this.sueldo += 50;
        System.out.println("Se le ha aumentado el sueldo a el oficial " + this.getNombre());
    }
    @Override
    public String toString(){
        return "El nombre del Oficial es " + this.getNombre() + " " + this.getApellido() + " y tiene un sueldo de $" + sueldo + " dolares";
    }
}
