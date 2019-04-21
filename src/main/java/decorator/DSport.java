package main.java.decorator;

public class DSport extends CarDecorator {
    public DSport(DCar c) {
        super(c);
    }
    
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Assembling Sports Car.");
        System.out.println("Adding Sports Car Part: Turbocharger.\n");
    }

}
