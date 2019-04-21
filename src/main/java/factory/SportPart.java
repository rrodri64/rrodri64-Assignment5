package main.java.factory;

public class SportPart implements Car {

    @Override
    public void construct() {
        System.out.println("Added Sport Part: Turbocharger");
    }

}
