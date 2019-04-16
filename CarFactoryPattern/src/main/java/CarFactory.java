package main.java;

public class CarFactory {
    
    /**
     * @summary This method specifies which car to build
     * @param car - Gets the type of car specified
     * @return
     */
    
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

    /**
     * @summary This car specifies which part to add
     * @param car - Gets the car type to specify special part
     * @return
     */
    
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
