package Unidireccional;




public class Alumno {
    String nombre;
    Universidad universidadAsiste;




    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Universidad getUniversidadAsiste() {
        return universidadAsiste;
    }


    public void setUniversidadAsiste(Universidad universidadAsiste) {
        this.universidadAsiste = universidadAsiste;
    }


    public Alumno(){};
    public Alumno(String nombre, Universidad universidadAsiste) {
        this.nombre = nombre;
        this.universidadAsiste = universidadAsiste;
    }


    public void cambiarUniversidad(Universidad universidad){
        this.setUniversidadAsiste(universidad);
    }








}
