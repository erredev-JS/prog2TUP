package EjercicioHerencia.Ej2;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void hunt(){
        System.out.println("El gato está cazando");
    }

    @Override
    void makeSound() {
        System.out.println("El gato maulla");
    }
    @Override
    void information() {
        System.out.println("El gato " +this.name+ " tiene " + this.age + " años, es " + this.gender + " y es de color " + color);
    }
}


