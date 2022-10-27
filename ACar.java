public abstract class ACar implements Car {
    protected String registrationNumber;
    protected final String make;
    protected final String model;
    protected final int numberOfDoors;
    public ACar(String registrationNumber, String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }


  public String getRegistrationNumber(){
        return registrationNumber;
    }
   public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
//EVT: kig på toString metoden til sidst
    @Override
    public String toString() {
        return "ACar{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
