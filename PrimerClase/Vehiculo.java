package PrimerClase;

public abstract class Vehiculo {
    private String dueño;
    private int puertas;
    private int ruedas;

    public Vehiculo(String dueño, int puertas, int ruedas) {
        this.dueño = dueño;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    abstract void caracteristicas();
}
