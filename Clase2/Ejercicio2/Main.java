package Clase2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CurrentAccount ca1 = new CurrentAccount(1000, 50);
        ca1.calculateInterest();
        ca1.monthlyStatement();
        ca1.withdraw(1500);
        ca1.print();
        ca1.consign(2000);
        ca1.print();
        ca1.print();
    }
}
