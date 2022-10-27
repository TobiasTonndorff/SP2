public class ElectricCar extends ACar {
    private int batteryCapacity;
    private int maxRange;
    private int WhPrKm;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, int WhPrKm) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.WhPrKm = WhPrKm;
    }


    @Override
    public int getRegistrationFee() {
        double kmPrLitre = 100 / (getWhPrKm() / 91.25);
        if(kmPrLitre > 20 && kmPrLitre <=50){
            return 330;
        }else if( kmPrLitre > 15 && kmPrLitre <= 20){
            return 1050;
        }else if(kmPrLitre > 10 && kmPrLitre <= 15){
            return 2340;
        }else if( kmPrLitre > 5 && kmPrLitre <= 10){
            return 5500;
        }else {
            return 10470;
        }


    }
    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRange(){
        return maxRange;
    }

    public int getWhPrKm() {
        return WhPrKm;

    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", maxRange=" + maxRange +
                ", WhPrKm=" + WhPrKm +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
