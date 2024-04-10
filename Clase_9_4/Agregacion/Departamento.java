package Clase_9_4.Agregacion;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private ArrayList<Empleado> empl = new ArrayList<>();
    private int numEmpl = 0;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpl() {
        return empl;
    }

    public void setEmpl(ArrayList<Empleado> empl) {
        this.empl = empl;
    }

    public void agregarEmpleado(Empleado empleado){
        empl.add(empleado);
        numEmpl ++;
    }
    public void mostrarEmpleados (){
        for (Empleado empleado : empl) {
            System.out.println(empleado.nombre + " tiene el cargo " + empleado.cargo);
        }
    }
}
