package EjercicioHerencia;

public class Car extends Vehicle{
    protected double velocity;
    protected int displacement;

    public Car(String color, int wheels, double velocity, int displacement) {
        super(color, wheels);
        this.velocity = velocity;
        this.displacement = displacement;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println(velocity + "km/h, " + displacement + "cc");
    }

}
