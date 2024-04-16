package Clase_16_04.Iteradores;

public class Jugador {
    private String nombre;
    private String posicion;
    private int numeroCamiseta;

    public Jugador(String nombre, String posicion, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public void showDetails(){
        System.out.println(this.nombre + ", posicion: " + this.posicion + ", numero: " + this.numeroCamiseta);
    }
}
