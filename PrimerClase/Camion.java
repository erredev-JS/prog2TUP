package PrimerClase;

public class Camion extends Vehiculo{

    private float carga;

    public Camion(String dueño, int puertas, int ruedas, float carga) {
        super(dueño, puertas, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public void cargar(){

    }

    @Override
    void caracteristicas() {

        System.out.println("La carga es: " + this.carga + "kg");
        if (carga > 1000){
            System.out.println("El camion está sobrecargado");
        }else {
            System.out.println("Puede continuar");
        }
    }
}
