package main.java.factory;

public class Truck implements Car {

    @Override
    public void construct() {
        System.out.println("Created New Vehicle: Truck");
    }

}
