package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return getName() + " starting engine.";
    }

    public String drive() {
        this.runEngine(this);
        return getName() + " is driving...";
    }

    protected void runEngine(CarSkeleton carSkeleton) {

        if (carSkeleton instanceof ElectricCar) {
             double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            System.out.println("fizz");
            int batterySize =((ElectricCar) carSkeleton).getBatterySize();
        } else if (carSkeleton instanceof  HybridCar) {
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("fizzbuzz");
        } else if (carSkeleton instanceof GasPoweredCar) {
            GasPoweredCar gasPoweredCard = (GasPoweredCar) carSkeleton;
            System.out.println("buzz");
        } else {
            System.out.println("invalid type");
        }
    }
}
