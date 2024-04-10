package Diagnostico;
import java.util.Scanner;
public class RandomNums {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int min, max, ranNum;
        System.out.println("Ingrese el número mínimo: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        min = sc.nextInt();
        System.out.println("Ingrese el número máximo: ");
        while (!sc.hasNextInt()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        max = sc.nextInt();
        for (int i = 0; i <= 10; i++){
            ranNum = min + (int)(Math.random() * ((max - min) +1));
            System.out.println(ranNum);
        }
    }
}
