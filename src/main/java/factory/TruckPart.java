package main.java.factory;

public class TruckPart implements Car {

    @Override
    public void construct() {
        System.out.println("Added Truck Part: Truck Bed\n");
    }

}
