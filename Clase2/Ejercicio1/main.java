package Clase2.Ejercicio1;

public class main {
    public static void main(String[] args) {
        Directivo d1 = new Directivo("Pablo", 94219667);
        Operario op1 = new Operario("Rodrigo", "Zapata");
        Tecnico t1 = new Tecnico("Mauro", "Garcia", 1);
        Oficial of1 = new Oficial("Leo", "Messi", 500);
        d1.reganiarOper(op1);
        op1.operar();
        System.out.println(op1.toString());
        t1.masHijos();
        System.out.println(t1.toString());
        of1.aumento();
        System.out.println(of1.toString());
    }
}
