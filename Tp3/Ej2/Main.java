package TPs.Tp3.Ej2;

public class Main {
    public static void main(String[] args) {
        Worker e1 = new Worker("Hector");


        Worker g1 = new Worker("Octavio");


        e1.asignSupervisor(g1);


        g1.getSupervisorName();
    }
}
