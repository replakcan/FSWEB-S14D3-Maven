package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double averageKmPerLiter;
    private int batterySize;
    private int cylinders;

    public double getAvgKmPerLiter() {
        return averageKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    public HybridCar(String name, String description, double averageKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.averageKmPerLiter = averageKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public String drive() {
        return "run from Hybrid car";
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting...";
    }
}
