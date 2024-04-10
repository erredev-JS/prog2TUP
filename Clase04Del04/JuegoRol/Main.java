package Clase04Del04.JuegoRol;

public class Main {
    public static void main(String[] args) {
        Wizard w1 = new Wizard(true, 10, 1, 20, "Javier", 100, 10, 100, 30);
        Warrior war1 = new Warrior(true, 20, 1, 20, "Goliat", 150, 10, 0 );
        Rogue pic1 = new Rogue(true, 5, 1, 5, "David", 75, 30,5);
        while (w1.isAlive() && war1.isAlive() && pic1.isAlive()){
            w1.defend(war1.attack());
            war1.defend(w1.magicAttack());
            pic1.drinkPotion();
            pic1.defend(w1.magicAttack());
            pic1.defend(war1.attack());
            w1.defend(pic1.attack());
            war1.defend(pic1.attack());
        }
        if (!w1.isAlive()){
            System.out.println("Se ha declarado un empate entre el pícaro " + pic1.getName() + " y el Guerrero " + war1.getName());
        } else if (!war1.isAlive()) {
            System.out.println("Se ha declarado un empate entre el pícaro " + pic1.getName() + " y el Mago " + w1.getName());
        }else {
            System.out.println("Se ha declarado un empate entre el Mago " + w1.getName() + " y el Guerrero " + war1.getName());
        }


    }
}
