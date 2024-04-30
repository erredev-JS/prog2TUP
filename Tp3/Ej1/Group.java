package TPs.Tp3.Ej1;

import java.util.ArrayList;

public class Group {
    private String course;
    private char letter;
    private ArrayList<Alumn> alumns;
    private ArrayList<Signature> signatures;

    public Group(String course, char letter) {
        this.course = course;
        this.letter = letter;
        this.alumns = new ArrayList<Alumn>() ;
        this.alumns.add(new Alumn(46542148, "Pepe"));
        this.signatures = new ArrayList<Signature>();
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public ArrayList<Alumn> getAlumns() {
        return alumns;
    }

    public void setAlumns(ArrayList<Alumn> alumns) {
        this.alumns = alumns;
    }

    public ArrayList<Signature> getSignatures() {
        return signatures;
    }

    public void setSignatures(ArrayList<Signature> signatures) {
        this.signatures = signatures;
    }

    public void addAlumns(int dni, String name){

        this.alumns.add(new Alumn(dni, name));
        this.alumns.get(this.alumns.size() - 1).addGroup(this);

    }

    public void addSignature(Signature sign){
        this.signatures.add(sign);
    }


}
