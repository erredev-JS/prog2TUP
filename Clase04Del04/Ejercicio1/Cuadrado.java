package Clase04Del04.Ejercicio1;

public class Cuadrado implements Figura, Rotable, Drawble{
    private float side;

    public Cuadrado(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float area() {
        return side*side;
    }

    @Override
    public void draw() {
        System.out.println("Se dibujó un cuadrado ██ ");
    }

    @Override
    public void rotar() {
        System.out.println("Se rotó el cuadrado ▀▀");
    }
}
