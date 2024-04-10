package Clase04Del04.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuad1 = new Cuadrado(5);
        Circulo circ1 = new Circulo(3);
        System.out.println("El área del cuadrado es " + cuad1.area());
        System.out.println("El área del circulo es " + circ1.area());
        cuad1.draw();
        cuad1.rotar();
        circ1.draw();
    }
}
