import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        while(true){
            System.out.println("Calculadora Aritmetica By ErreDev");
            System.out.println("[1] Suma");
            System.out.println("[2] Resta");
            System.out.println("[3] Multiplicación");
            System.out.println("[4] Division");
            System.out.println("[5] Salir de la calculadora");

            System.out.println("Ingresa la operacion deseada:");
            try {
                opt = sc.nextInt();
                switch (opt) {
                    case 1 -> sum();
                    case 2 -> res();
                    case 3 -> mul();
                    case 4 -> div();
                    case 5 -> {
                        System.out.println("Saliendo del programa...");
                        return;
                    }
                    default -> System.out.println("Opción inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                sc.nextLine(); // Limpia el buffer de entrada
            }
        }
    }

    public static void sum(){
        double[] numbers = twoNumbersInput();
        System.out.println("La suma de " + numbers[0] + " y " + numbers[1] + " es: " + (numbers[0] + numbers[1]));
    }
    public static void res(){
        double[] numbers = twoNumbersInput();
        System.out.println("La resta de " + numbers[0] + " y " + numbers[1] + " es: " + (numbers[0] - numbers[1]));
    }
    public static void mul(){
        double[] numbers = twoNumbersInput();
        System.out.println("La multiplicación de " + numbers[0] + " y " + numbers[1] + " es: " + (numbers[0] * numbers[1]));
    }
    public static void div(){
        double[] numbers = twoNumbersInput();
        try{
            if(numbers[1] == 0) {
                throw new ArithmeticException("Error: No puedes dividir por cero.");
            }
            System.out.println("La división de " + numbers[0] + " y " + numbers[1] + " es: " + (numbers[0] / numbers[1]));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static double[] twoNumbersInput(){
        Scanner sc = new Scanner(System.in);
        double n1, n2;
        try {
            System.out.println("Ingresa el primer numero: ");
            n1 = sc.nextDouble();
            System.out.println("Ingresa el segundo numero: ");
            n2 = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresa números válidos.");
            sc.nextLine(); // Limpia el buffer de entrada
            return twoNumbersInput(); // Intenta obtener los números nuevamente
        }
        return new double[]{n1, n2};
    }
}
