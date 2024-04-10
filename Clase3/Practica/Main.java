package Clase3.Practica;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1 = new FullTimeEmployee(1, "Rodrigo", 500, 50);
        System.out.println("El salario del empleado " + e1.getName() + " es: " + e1.calculateSalary());

        PartTimeEmployee e2 = new PartTimeEmployee(2, "Thomas", 1000, 7, 500);
        System.out.println("El salario del empleado " + e2.getName() + " es: " + e2.calculateSalary());
    }
}
