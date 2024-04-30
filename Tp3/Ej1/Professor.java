package TPs.Tp3.Ej1;

import java.util.ArrayList;

public class Professor extends Person{
    private String department;
    private ArrayList<Signature> signature;

    public Professor(int dni, String name, String department) {
        super(dni, name);
        this.department = department;
        this.signature = new ArrayList<Signature>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Signature> getSignature() {
        return signature;
    }

    public void setSignature(ArrayList<Signature> signature) {
        this.signature = signature;
    }

    public void addSignature(Signature teach){
        this.signature.add(teach);
    }
}
