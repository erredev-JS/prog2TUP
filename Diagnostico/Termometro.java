package Diagnostico;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Termometro {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        byte option = 0;
        System.out.println("Ingrese la opción deseada: \n 1)Convertir Celsius a Fahrenheit. \n 2)Convertir Fahrenheit a Celsius. ");
        while (true){
            if (sc.hasNextByte()){
                option = sc.nextByte();
            }else {
                System.out.println("Ingrese una opción válida");
            }

            if (option == 1){
                System.out.println("La temperatura en Fahrenheit es: " + ToFahr());
                break;
            } else if (option == 2) {
                System.out.println("La temperatura en Celsius es: " + ToCels());
                break;
            }

        }
        System.out.println("Proceso finalizado");
    }

    public static double ToFahr(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double cels, fahr;
        System.out.println("Ingrese la temperatura en Celsius");
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        cels = sc.nextDouble();
        fahr = (cels * 1.8) +32;
        return fahr;
    }


    public static double ToCels(){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double cels, fahr;
        System.out.println("Ingrese la temperatura en Fahrenheit");
        while (!sc.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido.");
            sc.next(); // Limpiar el búfer del scanner
        }
        fahr = sc.nextDouble();
        cels = (fahr - 32) * ((double) 5 /9);
        return cels;
    }

}
