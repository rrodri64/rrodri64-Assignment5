package main.java.decorator;

public class DHybrid extends CarDecorator {
    public DHybrid(DCar c) {
        super(c);
    }
    
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Assembling Hybrid.");
        System.out.println("Adding Hybrid Part: Electric Motor.\n");
    }

}
