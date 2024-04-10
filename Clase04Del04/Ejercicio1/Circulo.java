package Clase04Del04.Ejercicio1;

public class Circulo implements Figura, Drawble{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return (float) (3.14 * radio * 2);
    }

    @Override
    public void draw() {
        System.out.println("Se dibujó el círculo ●");
    }
}
