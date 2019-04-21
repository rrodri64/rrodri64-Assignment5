package decorator;

public class CarDecorator implements Car {
    
    protected Car car;
    
    public CarDecorator(Car c) {
        this.car = c;
    }
    
    public void assembleCar() {
        this.car.assembleCar();
    }

}
