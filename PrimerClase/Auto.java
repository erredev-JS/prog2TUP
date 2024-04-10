package PrimerClase;

public class Auto extends Vehiculo{
    private Boolean descapotable;

    public Auto(String dueño, int puertas, int ruedas, Boolean descapotable) {
        super(dueño, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public Boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(Boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void bajar(){

    }
    public void subir(){

    }

    @Override
    void caracteristicas() {
        System.out.println("Puertas: " + this.getPuertas());
        System.out.println("Ruedas: " + this.getRuedas());
        if (descapotable == Boolean.TRUE){
            System.out.println("Es descapotable");
        }
    }
}
