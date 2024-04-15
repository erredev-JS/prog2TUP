package Composicion;

import java.util.ArrayList;


public class Casa {
    private int cantPuertas;
    private ArrayList<Puerta> puertas;
    public Casa(int cantPuertas) {
        this.cantPuertas = cantPuertas;
        puertas = new ArrayList<>();
    }


    public int getCantPuertas() {
        return cantPuertas;
    }


    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }


    public void getPuertas() {
        for (int i = 0; i < puertas.size(); i++){
            System.out.println(puertas.get(i).getMaterial());
        }
    }


    public void setPuertas(ArrayList<Puerta> puertas) {
        this.puertas = puertas;
    }


    public void agregarPuertas(Puerta p) {
        if(puertas.size() < cantPuertas){
            puertas.add(p);


        }else {
            System.out.println("Cantidad de puertas  excedida");
        }
    }


}


