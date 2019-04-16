package main.java;

public class Truck implements Car {

    @Override
    public void construct() {
        System.out.println("Inside Truck::construct() method.");
    }

}
