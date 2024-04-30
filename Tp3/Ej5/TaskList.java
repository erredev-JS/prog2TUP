package TPs.Tp3.Ej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TaskList implements Iterable<Task> {
    private ArrayList<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<Task>();
        tasks.add(new Task("Hacer la cama", 1));
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String description, int prio) {
        tasks.add(new Task(description, prio));
        System.out.println("Se añadió una tarea");
    }

    public void removeTask(String description) {
        int cantTask = tasks.size();
        Task toRemove = null;
        for (Task task : getTasks()) {
            if (task.getDescription().equals(description)) {
                toRemove = task;
            }
        }
        tasks.remove(toRemove);
        if (cantTask == tasks.size()){
            System.out.println("No se pudo borrar la tarea");

        }else {
            System.out.println("Se borró la tarea exitosamente");
        }

    }

    public void showCantTasks() {
        System.out.println("En la lista hay " + tasks.size() + " tareas");
    }

    public void showTasks() {
        System.out.println("Mostrando tareas por orden de prioridad");
        ArrayList<Integer> priorities = new ArrayList<Integer>();
        for (Task toDo : tasks) {
            priorities.add(toDo.getPriority());
        }
        int higher = Collections.max(priorities);
        Collections.sort(priorities, Collections.reverseOrder());

        for (int prio : priorities) {
            while (true)
                if (prio == higher) {
                    for (Task toSolve : tasks)
                        if (toSolve.getPriority() == higher)
                            System.out.println(toSolve.getDescription() + ". Prioridad: " + toSolve.getPriority());
                    break;
                } else {
                    higher--;
                }

        }

    }

    @Override
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }
}
