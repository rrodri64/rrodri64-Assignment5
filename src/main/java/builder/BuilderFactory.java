package main.java.builder;

public class BuilderFactory {

    private SpecificBuilder carBuilder;

    public BuilderFactory(SpecificBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarPlanBuilder getCar() {
        return this.carBuilder.getCar();
    }

    public void constructCar() {
        this.carBuilder.buildCarType();
        this.carBuilder.buildCarPart();

    }
}
