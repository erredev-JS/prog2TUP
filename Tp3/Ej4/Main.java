package TPs.Tp3.Ej4;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentsArray = new ArrayList<>();


        int option = 0;


        while (option != 5) {
            System.out.println("Menú de gestión UTN:");
            System.out.println("1. Agregar alumnos a la lista.");
            System.out.println("2. Mostrar lista completa de alumnos");
            System.out.println("3. Mostrar nota promedio de todos los alumnos");
            System.out.println("4. Mostrar alumno con la nota mas alta");
            System.out.println("5. Buscar alumno por nombre");
            System.out.print("Ingrese su opción: ");
            option = sc.nextInt();


            switch (option) {
                case 1:
                    addStudent(studentsArray);
                    break;
                case 2:
                    printStudents(studentsArray);
                    break;
                case 3:
                    System.out.println("La nota promedio entre todos los alumnos es: " + averageRating(studentsArray));
                    break;
                case 4:
                    System.out.println("El estudiante con la nota mas alta es: " + maxRating(studentsArray));
                    break;
                case 5:
                    searchStudent(studentsArray);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }


        sc.close();
    }








    public static void addStudent(ArrayList array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del estudiante: ");
        String name = sc.nextLine();
        System.out.println("Edad del estudiante: ");
        int age = sc.nextInt();
        System.out.println("Nota del estudiante: ");
        double studentRating = sc.nextDouble();
        array.add(new Student(name,age,studentRating));
    }


    public static void printStudents(ArrayList<Student> array){
        for(int i = 0; i < array.size(); i++){
            Student a =  array.get(i);
            System.out.println(a.toString());
        }
    }


    public static double averageRating(ArrayList<Student> array){
        double average = 0;
        for(int i = 0; i < array.size(); i++){
            Student a =  array.get(i);
            average += a.getStudentRating();
        }
        return average / array.size();
    }
    public static Student maxRating(ArrayList<Student> array){
        return Collections.max(array, Comparator.comparingDouble(Student::getStudentRating));
    }


    public static void searchStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del estudiante que quieres buscar: ");
        String name = sc.nextLine();
        for (Student student: array
        ) {
            if(student.getName().equals(name)){
                System.out.println(student.toString());
            }
        }
        System.out.println("Estudiante no encontrado");
    }


}
