package main.java;

public class CarFactoryDemo {
    
    /**
     * @summary This main method inputs sample cars to build
     * @param args - Main method
     */
    
    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();

        Car car1 = carFactory.getCar("SPORT");
        car1.construct();
        car1 = carFactory.getPart("SPORTPART");
        car1.construct();
        Car car2 = carFactory.getCar("HYBRID");
        car2.construct();
        car2 = carFactory.getPart("HYBRIDPART");
        car2.construct();
        Car car3 = carFactory.getCar("TRUCK");
        car3.construct();
        car3 = carFactory.getPart("TRUCKPART");
        car3.construct();
    }
}
