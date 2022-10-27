public class DieselCar extends AFuelCar {
   private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }


    public boolean hasParticleFilter(){
       return hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return null;
    }

    public int getRegistrationFee(){
        int particlePenalty = hasParticleFilter ? 1000 : 0;
        if(kmPrLitre > 20  && kmPrLitre <= 50){
            return 330 + 130 + particlePenalty;
        } else if(kmPrLitre > 15 && kmPrLitre <= 20){
            return 1050 + 1390 + particlePenalty;
        }else if(kmPrLitre > 10 && kmPrLitre <= 15){
            return 2340 + 1850 + particlePenalty;
        }else if(kmPrLitre > 5 && kmPrLitre <= 10){
            return 5500 + 2770 + particlePenalty;
        }else {
            return 10470 + 15260 + particlePenalty;
        }

    }
//kigges på senere
    @Override
    public String toString() {
        return "DieaselCar{" +
                "particleFilter=" + hasParticleFilter +
                ", kmPrLitre=" + kmPrLitre +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
