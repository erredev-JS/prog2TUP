package TPs.Tp3.Ej1;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor(44523668, "Rigoni", "Guaymayen");

        Signature s1 = new Signature(10, "10:30", "Programacion");
        Signature s2 = new Signature(5, "8:00", "Programacion 2");
        Signature s3 = new Signature(1, "10:30", "Matematica");

        Group g1 = new Group("Comision 3", 'A');
        Group g2 = new Group("Quinto", 'B');
        Group g3 = new Group("Deporte", 'D');

        p1.addSignature(s1);
        p1.addSignature(s2);
        p1.addSignature(s3);
        s1.setProfessor(p1);

        g1.addAlumns(94219667, "Thomas");
        g1.addAlumns(45123789, "Paula");
        g2.addAlumns(46122389, "Renzo");
        g2.addAlumns(94219667, "Thomas");
        g3.addAlumns(94219667, "Thomas");

        g1.addSignature(s1);

        s2.setGroup(g1);
        s3.setGroup(g1);
        s1.setGroup(g2);
        //a
        System.out.println("El aula de la tercera asignatura de la profesora " + p1.getName() + " es la: " + p1.getSignature().get(2).getClassroom());

        //b
        System.out.println("La profesora " + p1.getName() + " imparte las siguientes materias:");
        for (Signature signature: p1.getSignature()) {
            System.out.println(signature.getName());
        }

        //c
        System.out.println("Los nombres y DNI de los alumnos de la asignatura " + s2.getName() + " son:");
        for (Alumn alumn: s2.getGroup().getAlumns()) {
            System.out.println(alumn.getName() + " " + alumn.getDni());
        }

        //d
        /*
        System.out.println(" waos " +g1.getAlumns().get(1).getName());
        System.out.println(" waos 2 " +g1.getAlumns().get(1).getGropus().get(2).getLetter());

         */

        //e

        for(Signature s : g1.getAlumns().get(1).getGropus().get(0).getSignatures()){
            System.out.println("Las asignaturas son : " + s.getName());
        }

        //f
        System.out.println("El profesor es: " + g1.getSignatures().get(0).getProfessor().getName());

        //g
        for (Alumn alumn : p1.getSignature().get(1).getGroup().getAlumns()){
            System.out.println(alumn.getName());
        }
    }
}
