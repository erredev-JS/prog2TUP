package EjercicioHerencia.Ej2;

import javax.swing.plaf.TreeUI;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bolt", 10, "macho", "obejero");
        Cat c1 = new Cat("Pelusa", 11, "hembra", "gris");
        Bird b1 = new Bird("Perla", 4, "hembra", true);

        d1.makeSound();
        d1.information();

        c1.makeSound();
        c1.information();

        b1.makeSound();
        b1.information();
    }
}
