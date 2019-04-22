package main.java.builder;

public class BSport implements SpecificBuilder {

    private CarPlanBuilder car;
    
    public BSport() {
        this.car = new CarPlanBuilder();
    }
    
    public void buildCarType() {
        car.setCarType("SPORT");
    }
    
    public void buildCarPart() {
        car.setCarPart("SPORTPART");
    }
    
    public CarPlanBuilder getCar() {
        return this.car;
    }
}
