package Diagnostico;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculadoraPolacaInversaApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String operation;
        double result;

        System.out.println("Ingrese el primer operando: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }

        System.out.println("Ingrese el segundo operando: ");
        num1 = sc.nextInt();
        while (!sc.hasNextInt()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num2 = sc.nextInt();

        System.out.println("Ingrese un signo aritmético: ");

        operation = sc.next();

        switch (operation){
            case "+":
                result = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + result);
                break;
            case "-":
                result = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + result);
                break;
            case "*":
                result = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + result);
                break;
            case "/":
                result = (double) num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + result);
                break;
            case "^":
                result = 1;
                for (int i = 0; i < num2; i++){
                    result *= num1;
                }
                JOptionPane.showMessageDialog(null, "El resultado es: " + result);
            case "%":
                result = num1 % num2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + result);
        }

    }
}
