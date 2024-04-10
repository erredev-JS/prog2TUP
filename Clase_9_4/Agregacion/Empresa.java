package Clase_9_4.Agregacion;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Departamento> deps = new ArrayList<>();
    private int numDep;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Departamento> getDeps() {
        return deps;
    }

    public void setDeps(ArrayList<Departamento> deps) {
        this.deps = deps;
    }

    public int getNumDep() {
        return numDep;
    }

    public void setNumDep(int numDep) {
        this.numDep = numDep;
    }
}
