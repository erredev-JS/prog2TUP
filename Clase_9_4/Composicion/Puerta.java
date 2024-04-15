package Composicion;

public class Puerta {
    private String material;
    public String getMaterial(){


        return this.material;
    };


    public void setMaterial(String material) {
        this.material = material;
    }


    public Puerta(String material) {
        this.material = material;
    }
}
