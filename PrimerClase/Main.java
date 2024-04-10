package PrimerClase;

public class Main {
    public static void main(String[] args) {
        Auto fiat = new Auto("Thomas", 4, 4, true);
        Camion camion1 = new Camion("Javier", 2, 8, 551.45F);

        fiat.caracteristicas();
        camion1.caracteristicas();
        System.out.println("El dueño del camion es: " + camion1.getDueño());
    }
}
