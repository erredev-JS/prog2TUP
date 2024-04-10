package Clase3.Actividad;

public class Dog extends Canine{
    public Dog(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }
    @Override
    public void eat(){
        System.out.println("Perro come " + this.food);
    }

    @Override
    public void sleep() {
        System.out.println("El perro duerme");
    }

    @Override
    public void makeNoise(){
        System.out.println("Guau guau");
    }
    public void vaccinate(){
        System.out.println("El perro se ha vacunado");
    }
    public void takeaWalk(){
        System.out.println("Se sacó a pasear al perro");
    }
}
