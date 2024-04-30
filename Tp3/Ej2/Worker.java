package TPs.Tp3.Ej2;

public class Worker {
    private String name;
    private Worker supervisor;


    public Worker(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Worker getSupervisor() {
        return supervisor;
    }


    public void setSupervisor(Worker supervisor) {
        this.supervisor = supervisor;
    }


    public void asignSupervisor(Worker supervisor){
        this.supervisor = supervisor;
    }
    public void getSupervisorName(){
        if (this.supervisor != null){
            System.out.println(supervisor.name);
        }else{
            System.out.println("El empleado no tiene un supervisor asignado");;
        }


    };
}
