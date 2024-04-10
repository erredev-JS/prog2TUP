package Clase2.Ejercicio1;

public class Tecnico extends Operario{
    private int hijos;

    public Tecnico(String nombre, String apellido, int hijos) {
        super(nombre, apellido);
        this.hijos = hijos;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public void masHijos(){
        this.hijos += 1;
        System.out.println("El técnico "+ this.getNombre() +" ha tenido otro hijo");
    }
    @Override
    public String toString(){
        String s = "El nombre del Oficial es " + super.toString() + " y tiene "+ hijos + " hijos";
        return s;
    }
}
