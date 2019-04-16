package main.java;

public class CarFactory {
    public Car getCar(String car) {
        if (car == null) {
            return null;
        }
        if (car.equalsIgnoreCase("SPORT")) {
            return new Sport();
        }
        if (car.equalsIgnoreCase("HYBRID")) {
            return new Hybrid();
        }
        if (car.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        }
        return null;
    }
    public Car getPart(String car) {
        if (car.equalsIgnoreCase("SPORTPART")) {
            return new SportPart();
        }
        if (car.equalsIgnoreCase("HYBRIDPART")) {
            return new HybridPart();
        }
        if (car.equalsIgnoreCase("TRUCKPART")) {
            return new TruckPart();
        }
        return null;
    }
}
