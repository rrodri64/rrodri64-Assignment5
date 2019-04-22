package main.java.builder;

public class CarBuilderDemo {
    public static void main(String[] args) {
        SpecificBuilder hybridBuilder = new BHybrid();
        SpecificBuilder sportBuilder = new BSport();
        SpecificBuilder truckBuilder = new BTruck();
        BuilderFactory factory = new BuilderFactory(hybridBuilder);
        BuilderFactory factory1 = new BuilderFactory(truckBuilder);
        BuilderFactory factory2 = new BuilderFactory(sportBuilder);
        
        factory.constructCar();
        factory1.constructCar();
        factory2.constructCar();
        
        CarPlanBuilder car = factory.getCar();
        CarPlanBuilder car1 = factory.getCar();
        CarPlanBuilder car2 = factory.getCar();
        
        System.out.println("Builder constructed hybrid car: " + car);
        System.out.println("Builder constructed sport car: " + car1);
        System.out.println("Builder constructed truck car: " + car2);
    }
}
