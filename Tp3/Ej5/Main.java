package TPs.Tp3.Ej5;
import java.util.InputMismatchException;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //declaro valiarbles
        int option = 0;
        String desc;
        int prio;
        TaskList tl1 = new TaskList();

        //pregunta si ingresar tareas

        while (true){
            while (true){
                System.out.println("Ingrese una descripcion para la tarea");
                desc = sc.next();
                if (desc.matches("\\d+")){
                    System.out.println("No debe ingresar números en la descripción");
                    sc.next();
                }
                break;
            }
            while (true){
                System.out.println("Asigne una prioridad a la tarea");
                try{
                    prio = sc.nextInt();
                    break;
                }catch (InputMismatchException me){
                    System.out.println("Ingrese un dato numérico");
                    sc.next();
                }

            }
            tl1.addTask(desc, prio);

            while (true){
                System.out.println("¿Desea ingresar tareas nuevas?\n Si(1)\n No(0)");
                try {
                    sc.next();
                    option = sc.nextInt();
                    if (option != 1 && option != 0){
                        throw new InputMismatchException();
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Debe ingresar una de las opciones");
                }
            }
            if (option == 0){
                break;
            }

        }



        tl1.showTasks();
        while (true){
            System.out.println("Ingrese una descripcion para borrar una tarea");
            desc = sc.next();
            if (desc.matches("\\d+")){
                System.out.println("No debe ingresar números en la descripción");
                sc.next();
                continue;
            }
            tl1.removeTask(desc);
            break;
        }

        tl1.showTasks();

    }
}
