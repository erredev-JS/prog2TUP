package Clase_16_04.Iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class Equipo implements Iterable<Jugador>{
    private String nombre;
    private ArrayList<Jugador> team  = new ArrayList<Jugador>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Jugador> team) {
        this.team = team;
    }

    public void addPlayers(Jugador player){
        team.add(player);
    }

    @Override
    public Iterator<Jugador> iterator() {
        return team.iterator();
    }
}
