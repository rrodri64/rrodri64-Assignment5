package main.java.decorator;

public class CarDecorator implements DCar {
    
    protected DCar car;
    
    public CarDecorator(DCar c) {
        this.car = c;
    }
    
    public void assembleCar() {
        this.car.assembleCar();
    }

}
