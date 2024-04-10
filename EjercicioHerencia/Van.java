package EjercicioHerencia;

public class Van extends Car{
    private double weight;

    public Van(String color, int wheels, double velocity, int displacement, double weight) {
        super(color, wheels, velocity, displacement);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println(weight + " kg");
    }

}
