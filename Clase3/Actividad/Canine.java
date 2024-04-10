package Clase3.Actividad;

public abstract class Canine extends Animal{
    public Canine(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }
    @Override
    public void roar(){
        System.out.println("Ruge como canino");
    }
}
