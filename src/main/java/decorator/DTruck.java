package main.java.decorator;

public class DTruck extends CarDecorator {
    public DTruck(DCar c) {
        super(c);
    }
    
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Assembling Truck.");
        System.out.println("Adding Truck Part: Truck Bed.\n");
    }

}
