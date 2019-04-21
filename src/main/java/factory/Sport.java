package main.java.factory;

public class Sport implements Car {

    @Override
    public void construct() {
        System.out.println("Created New Vehicle: Sport");
    }
}
