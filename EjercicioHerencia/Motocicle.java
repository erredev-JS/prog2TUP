package EjercicioHerencia;

public class Motocicle extends Bike{
    private double velocity;
    private int displacement;

    public Motocicle(String color, int wheels, String type, double velocity, int displacement) {
        super(color, wheels, type);
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
