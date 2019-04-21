package main.java.factory;

public class Hybrid implements Car {

    @Override
    public void construct() {
        System.out.println("Created New Vehicle: Hybrid");
    }

}
