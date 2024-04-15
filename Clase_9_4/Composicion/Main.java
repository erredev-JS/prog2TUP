package Composicion;

public class Main {
    public static void main(String[] args) {
        Casa c1 = new Casa(3);


        c1.agregarPuertas(new Puerta("Adamantio"));
        c1.agregarPuertas(new Puerta("Cristal"));
        c1.agregarPuertas(new Puerta("Diamante"));
        c1.agregarPuertas(new Puerta("Obsidiana"));
        c1.getPuertas();


    }
}