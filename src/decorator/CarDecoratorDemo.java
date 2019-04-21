package decorator;

public class CarDecoratorDemo {

    public static void main(String[] args) {
        
        Car sport1 = new Sport(new BaseCar());
        sport1.assembleCar();
        
        System.out.println("----------\n");
        
        Car hybrid1 = new Hybrid(new BaseCar());
        hybrid1.assembleCar();
        
        System.out.println("----------\n");
        
        Car truck1 = new Truck(new BaseCar());
        truck1.assembleCar();
    }

}
