import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        Car car1 = new DieselCar("CFR1234", "Nissan", "Qasquai", 5, 20, false);
        Car car2 = new GasolinCar("GHJ4321", "Mercedes", "cl103", 5, 28);
        Car car3 = new ElectricCar("GHJK1234", "Tesla", "c2", 5, 20, 400, 25);

        fleet.addCar(car1);
        fleet.addCar(car2);
        fleet.addCar(car3);

        System.out.println(fleet);
        System.out.println("Total registration fee is: " + fleet.totalFeeCar());



    }
}