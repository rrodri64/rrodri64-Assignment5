package main.java.builder;

public interface SpecificBuilder {
    
    public void buildCarType();
    
    public void buildCarPart();
    
    public CarPlanBuilder getCar();
}
