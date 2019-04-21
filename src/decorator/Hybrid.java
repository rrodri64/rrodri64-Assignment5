package decorator;

public class Hybrid extends CarDecorator {
    public Hybrid(Car c) {
        super(c);
    }
    
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Assembling Hybrid.");
        System.out.println("Adding Hybrid Part: Electric Motor.\n");
    }

}
