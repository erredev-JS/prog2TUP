package Clase2.Ejercicio1;

public class Directivo extends Empleado{
    private int dni;

    public Directivo(String nombre, int dni) {
        super(nombre);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public void reganiarOper(Operario op){
        if (op == null){
            System.out.println("El directivo " + this.getNombre() + " con DNI " + dni + " no está regañando a nadie");
        }else {
            System.out.println("El directivo " + this.getNombre() + " con DNI " + dni + " está regañando al operario " + op.getNombre() + " " + op.getApellido());
        }
    }
    @Override
    public String toString(){
        return "El nombre del Directivo es " + this.getNombre() + " y su DNI es " + dni;
    }
}
