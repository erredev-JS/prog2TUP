package EjercicioHerencia;

public abstract class Vehicle {
    protected String color;
    protected int wheels;

    public Vehicle(String color, int wheels) {
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void showDetails(){
        System.out.println(this.getClass().getSimpleName() + ", Color: " + color + ", " + wheels + " wheels:");
    }

}
