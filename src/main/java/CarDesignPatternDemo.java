package main.java;

import main.java.builder.CarPlanBuilder;
import main.java.builder.SpecificBuilder;
import main.java.builder.BuilderFactory;
import main.java.builder.BHybrid;
import main.java.builder.BSport;
import main.java.builder.BTruck;

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
        
        System.out.println("\n---*Factory Design Pattern*---\n");

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
        
        System.out.println("\n---*Decorator Design Pattern*---\n");
        
        DCar sport1 = new DSport(new BaseCar());
        sport1.assembleCar();
        
        
        DCar hybrid1 = new DHybrid(new BaseCar());
        hybrid1.assembleCar();
        
        DCar truck1 = new DTruck(new BaseCar());
        truck1.assembleCar();
        
        System.out.println("\n---*Builder Design Pattern*---\n");
        
        SpecificBuilder sportBuilder = new BSport();
        SpecificBuilder hybridBuilder = new BHybrid();
        SpecificBuilder truckBuilder = new BTruck();
        BuilderFactory factory1 = new BuilderFactory(sportBuilder);
        BuilderFactory factory2 = new BuilderFactory(hybridBuilder);
        BuilderFactory factory3 = new BuilderFactory(truckBuilder);
        
        factory1.constructCar();
        factory2.constructCar();
        factory3.constructCar();
        
        CarPlanBuilder bCar1 = factory1.getCar();
        CarPlanBuilder bCar2 = factory2.getCar();
        CarPlanBuilder bCar3 = factory3.getCar();
        
        System.out.println("Builder constructed hybrid car: " + bCar1);
        System.out.println("\nBuilder constructed sport car: " + bCar2);
        System.out.println("\nBuilder constructed truck car: " + bCar3);
        
    }
}
