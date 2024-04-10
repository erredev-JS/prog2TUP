package EjercicioHerencia;

public class Bike extends Vehicle{

    protected String type;

    public Bike(String color, int wheels, String type) {
        super(color, wheels);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("type " + type);
    }

}
