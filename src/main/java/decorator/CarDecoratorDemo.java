package main.java.decorator;

public class CarDecoratorDemo {

    /**
     * @param args Main method default argument
     */
    public static void main(String[] args) {
        
        DCar sport1 = new DSport(new BaseCar());
        sport1.assembleCar();
        
        System.out.println("----------\n");
        
        DCar hybrid1 = new DHybrid(new BaseCar());
        hybrid1.assembleCar();
        
        System.out.println("----------\n");
        
        DCar truck1 = new DTruck(new BaseCar());
        truck1.assembleCar();
    }

}
