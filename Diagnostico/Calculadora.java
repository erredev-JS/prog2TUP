package Diagnostico;

import java.util.Locale;
import java.util.Scanner;
public class Calculadora{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String again = "si";
        String operation;
        do {
            System.out.println("Ingrese la operación a realizar: \n 1) Suma. \n 2) Resta. \n 3) Multiplicación. \n 4) División \n");
            operation = sc.next();
            operation.toLowerCase();
            switch (operation) {
                case "suma":
                case "1":
                    System.out.println("El resultado es: " + suma());
                    break;
                case "resta":
                case "2":
                    System.out.println("El resultado es: " + resta());
                    break;
                case "multiplicacion":
                case "3":
                    System.out.println("El resultado es: " + multiplicacion());
                    break;
                case "division":
                case "4":
                    System.out.println("El resultado es : " + divison());
                    break;
                default:
                    System.out.println("Opción inválida");
            }
            while (true){
                System.out.println("¿Desea realizar otra operación?\n  1)Si.\n  2)No");
                again = sc.next();
                again.toLowerCase();
                if (again.equals("si")||again.equals("no")||again.equals("1")||again.equals("2")){
                    break;
                }else {
                    System.out.println("Ingrese una opción válida");
                }
            }


        } while (again.equals("si")||again.equals("1"));
    }

    public static double suma(){
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        System.out.println("Ingrese el primer número:");
        // Validación del primer número
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num1 = sc.nextDouble();
        // Validación del segundo número
        System.out.println("Ingrese el segundo número:");
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num2 = sc.nextDouble();
        result = num1 + num2;
        return result;
    }

    public static double resta(){
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        System.out.println("Ingrese el primer número:");
        // Validación del primer número
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num1 = sc.nextDouble();
        // Validación del segundo número
        System.out.println("Ingrese el segundo número:");
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num2 = sc.nextDouble();
        result = num1 - num2;
        return result;
    }

    public static double multiplicacion(){
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        System.out.println("Ingrese el primer número:");
        // Validación del primer número
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num1 = sc.nextDouble();
        // Validación del segundo número
        System.out.println("Ingrese el segundo número:");
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num2 = sc.nextDouble();
        result = num1 * num2;
        return result;
    }


    public static double divison(){
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        System.out.println("Ingrese el primer número:");
        // Validación del primer número
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        num1 = sc.nextDouble();
        // Validación del segundo número
        System.out.println("Ingrese el segundo número:");
        while (!sc.hasNextDouble() || (num2 = sc.nextDouble()) == 0) {
            if (!sc.hasNextDouble()) {
                System.out.println("Error: Por favor, ingrese un número válido.");
                sc.next(); // Limpiar el búfer del scanner
            } else {
                System.out.println("El número ingresado no puede ser cero");
            }
        }

        result = num1 / num2;
        return result;
    }

}