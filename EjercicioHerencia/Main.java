package EjercicioHerencia;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("blue", 4, 230.0, 1500);
        Bike bike1 = new Bike("black", 2, "sport");
        Van van1 = new Van("white", 6, 150.2, 1000, 825);
        Motocicle moto1 = new Motocicle("red", 2, "urban", 150, 150);

        ArrayList<Vehicle> listVehicle = new ArrayList<>(Arrays.asList(car1, bike1, van1, moto1));

        catalog(listVehicle);

    }

    public static void catalog(ArrayList<Vehicle> list){

        for (Vehicle vehicle : list) {
            vehicle.showDetails();
        }
    }

    public static void catalog(ArrayList<Vehicle> list, int whls){
        int vehicleAmount = 0;
        for (Vehicle vehicle : list) {

            if (vehicle.wheels == whls){
                vehicleAmount += 1;
                vehicle.showDetails();
            }
        }
        System.out.println("Se han encontrado {" + vehicleAmount + "} vehículos con "+ whls + " ruedas");
    }

}
