package TPs.Tp3.Ej1;

import java.util.ArrayList;

public class Alumn extends Person{
    private ArrayList<Group> gropus;

    public Alumn(int dni, String name) {
        super(dni, name);
        this.gropus =  new ArrayList<Group>();
    }

    public ArrayList<Group> getGropus() {
        return gropus;
    }

    public void setGropus(ArrayList<Group> gropus) {
        this.gropus = gropus;
    }

    public void addGroup(Group group){
        this.gropus.add(group);
    }
}
