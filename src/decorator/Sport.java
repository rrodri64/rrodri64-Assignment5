package decorator;

public class Sport extends CarDecorator {
    public Sport(Car c) {
        super(c);
    }
    
    public void assembleCar() {
        super.assembleCar();
        System.out.println("Assembling Sports Car.");
        System.out.println("Adding Sports Car Part: Turbocharger.\n");
    }

}
