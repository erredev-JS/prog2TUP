package Clase3.Actividad;

public class Wolf extends Canine{
    public Wolf(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void eat(){
        System.out.println(this.getClass().getSimpleName() + " come " + this.food);
    }

    @Override
    public void sleep() {

    }
}
