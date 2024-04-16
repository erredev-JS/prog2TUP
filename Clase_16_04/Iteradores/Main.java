package Clase_16_04.Iteradores;

public class Main {
    public static void main(String[] args) {
        Equipo e1 = new Equipo("Chacarita");
        Jugador j1 = new Jugador("Thomas", "defensa", 13);
        Jugador j2 = new Jugador("Juani", "Medio Campo", 11);
        Jugador j3 = new Jugador("Mateo", "Arquero", 1);
        Jugador j4 = new Jugador("Matias", "Delantero", 9);

        e1.addPlayers(j1);
        e1.addPlayers(j2);
        e1.addPlayers(j3);
        e1.addPlayers(j4);

        for (Jugador pibe: e1) {
            pibe.showDetails();
        }

    }
}
