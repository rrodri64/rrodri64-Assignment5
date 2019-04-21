package decorator;

public class Truck extends CarDecorator {
    public Truck(Car c) {
        super(c);
    }
    
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Assembling Truck.");
        System.out.println("Adding Truck Part: Truck Bed.\n");
    }

}
