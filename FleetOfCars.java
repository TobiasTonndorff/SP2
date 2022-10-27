import java.util.ArrayList;

public class FleetOfCars {
  private final ArrayList<Car> fleet = new ArrayList<>();


    public void addCar(Car car){
     fleet.add(car);

    }

    public int totalFeeCar(){
        int totalFee = 0;
        for( Car c : fleet){
            totalFee += c.getRegistrationFee();
        }
        return totalFee;
    }
//EVT: kig på toString metoden til sidst.
    @Override
    public String toString() {
        return "FleetOfCars{" +
                "fleet=" + fleet +
                '}';
    }
}
