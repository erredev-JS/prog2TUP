package TPs.Tp3.Ej3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> week = new ArrayList<>();
        week.add("Lunes");
        week.add("Martes");
        week.add("Miercoles");
        week.add("Jueves");
        week.add("Viernes");
        week.add("Sábado");
        week.add("Domingo");


// Inserta en la posición 4 el elemento “Juernes”
        week.add(4,"Juernes");
        System.out.println(week);


//Muestra el contenido de las posiciones 3 y 4 de la lista
        System.out.println("Dia de la semana 3: " + week.get(3));
        System.out.println("Dia de la semana 4: " + week.get(4));


// Muestra el primer elemento y el último de la lista.
        System.out.println("Primer elemento: "+week.get(1));
        System.out.println("Ultimo elemento: "+week.get(week.size()-1));


//Elimina el elemento que contenga “Juernes” de la lista y comprueba que haya sido  eliminado.


        if (week.remove("Juernes")){
            System.out.println("Juernes ha sido eliminado");
        } else {
            System.out.println("Juernes no se ha encontrado");
        }


        System.out.println(week);

//Crea un iterador y muestras uno a uno los valores de la lista.
        System.out.println("Creamos un iterador para recorrer el arrayList");
        Iterator<String> iteradorWeek = week.iterator();
        while (iteradorWeek.hasNext()) {
            System.out.println(iteradorWeek.next());
        }


//Busca si existe en la lista un elemento que se denomine “Lunes”.
        if( week.lastIndexOf("Lunes")>-1){
            System.out.println("El elemento denominado Lunes sí existe. y se encuentra en la posición: "+week.lastIndexOf("Lunes"));
        } else{
            System.out.println("El elemento denominado Lunes no existe");
        }
//Busca si existe en la lista un elemento que se denomine “Lunes”. No importa si está en  mayúscula o minúscula.
        System.out.println("Buscando LUNES/Lunes/lunes");
        String day = "LUNES";
        for (String dia : week) {
            if (dia.equalsIgnoreCase(day)) {
                System.out.println(day+" fue encontrado.");
                break;
            }
        }
        //Borra todos los elementos de la lista.
        System.out.println("Borramos todos los elementos");
        week.clear();
        System.out.println(week);
    }

}
