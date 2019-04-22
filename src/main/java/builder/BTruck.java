package main.java.builder;

public class BTruck implements SpecificBuilder {

    private CarPlanBuilder car;
    
    public BTruck() {
        this.car = new CarPlanBuilder();
    }
    
    public void buildCarType() {
        car.setCarType("TRUCK");
    }
    
    public void buildCarPart() {
        car.setCarPart("TRUCKPART");
    }
    
    public CarPlanBuilder getCar() {
        return this.car;
    }
}
