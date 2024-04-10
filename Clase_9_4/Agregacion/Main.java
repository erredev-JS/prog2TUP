package Clase_9_4.Agregacion;

public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Rodrigo Zapata", "cartonero");
        Empleado e2 = new Empleado("Thomas Muñoz", "Jefe de " + e1.getNombre());
        Departamento d1 = new Departamento("Capos");
        d1.agregarEmpleado(e1);
        d1.agregarEmpleado(e2);
        d1.mostrarEmpleados();
    }
}
