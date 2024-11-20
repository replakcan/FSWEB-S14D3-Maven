package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double averageKmPerLiter;
    private int cylinders;

    public double getAverageKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public GasPoweredCar(String name, String description, double averageKmPerLiter, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public String drive() {
        return "run from gasgasgas car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting...";
    }

}
