package main.java.builder;

public class BHybrid implements SpecificBuilder {
    
    private CarPlanBuilder car;
    
    public BHybrid() {
        this.car = new CarPlanBuilder();
    }
    
    public void buildCarType() {
        car.setCarType("HYBRID");
    }
    
    public void buildCarPart() {
        car.setCarPart("HYBRIDPART");
    }
    
    public CarPlanBuilder getCar() {
        return this.car;
    }
}
