package Clase_16_04.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1
        ArrayList<Integer> ej1 = new ArrayList<Integer>(Arrays.asList(100, 2, 44, 4, 48854, 67, 7, 77, 74, 10));
        int bigger = Collections.max(ej1);
        int indexBiggger = ej1.indexOf(bigger);
        System.out.println("El indice del número mayor es: " + indexBiggger);

        //Ejercicio 2
        //usando el array anterior
        int primeOrNot = esPrimo(ej1);
        if (primeOrNot == -1) {
            System.out.println("No habian números primos");
        } else {
            System.out.println("El indice del número primo mas grande es: " + primeOrNot);
        }

        //Ejercicio 3
        ArrayList<Integer> array = new ArrayList<>();


        for (int i = 100; i <= 300; i++) {
            if (isPrime(i) && array.size() < 10) {
                array.add(i);
            }
            ;
        }
        System.out.println("Los 10 primeros números primos desde 100 son: ");
        for (int primeNumber : array
        ) {
            System.out.println(primeNumber);
        }


        //Ejercicio 4
        //Usando el array de ejercicio 1 y 2

        ArrayList<Integer> numerosTerminanEn4 = new ArrayList<>();
        for (Integer num : ej1) {
            if (num % 10 == 4) {
                numerosTerminanEn4.add(num);
            }
        }
        ArrayList<Integer> indexs = new ArrayList<>();
        // Mostrar los números que terminan en 4
        for (Integer num : numerosTerminanEn4) {
            indexs.add(ej1.indexOf(num));
        }
        System.out.println("Los indices de los números que terminan en 4 son: ");
        for (Integer i: indexs) {
            System.out.println(i);
        }


        //Ejercicio 5
        ArrayList<Integer> array2 = new ArrayList<>();


        int contador = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Ingresa un entero: ");
            int n = sc.nextInt();
            array2.add(n);
        }
        int max = Collections.max(array2);
        for (int n: array2) {
            if (n == max){
                contador++;
            };
        }
        System.out.println("El numero maximo: " + max
                + " Se repite " + contador + " veces.");
    }



    //Métodos
    public static boolean isPrime(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int esPrimo(ArrayList<Integer> arr){
        ArrayList<Integer> primeNums = new ArrayList<>();
        for (Integer num: arr) {
            boolean isPrime = true;
            if (num <= 1){
                continue;
            }
            for (int i = 2; i <= num / 2 ; i++) {
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNums.add(num);
            }
        }
        if (primeNums.isEmpty()){
            return -1;
        }else {
            return Collections.max(primeNums);
        }
    }
}
