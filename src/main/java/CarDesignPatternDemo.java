package main.java;

import main.java.decorator.BaseCar;
import main.java.decorator.DCar;
import main.java.decorator.DHybrid;
import main.java.decorator.DSport;
import main.java.decorator.DTruck;
import main.java.factory.Car;
import main.java.factory.CarFactory;

public class CarDesignPatternDemo {
    
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
        
        DCar sport1 = new DSport(new BaseCar());
        sport1.assembleCar();
        
        System.out.println("----------\n");
        
        DCar hybrid1 = new DHybrid(new BaseCar());
        hybrid1.assembleCar();
        
        System.out.println("----------\n");
        
        DCar truck1 = new DTruck(new BaseCar());
        truck1.assembleCar();
    }
}
