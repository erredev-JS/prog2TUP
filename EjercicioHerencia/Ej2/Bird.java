package EjercicioHerencia.Ej2;

public class Bird extends Animal{

    private boolean flying;

    public Bird(String name, int age, String gender, boolean flying) {
        super(name, age, gender);
        this.flying = flying;
    }
    
    public void fly(){
        if (this.flying == true){
            System.out.println("El pajaro está volando");
        }else {
            System.out.println("El pájaro no está volando");
        }
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    @Override
    void makeSound() {
        System.out.println("El pájaro canta");
    }
    @Override
    void information() {
        System.out.println("El pajaro " +this.name+ " tiene " + this.age + " años, es " + this.gender + " y ");
        fly();
    }
}
