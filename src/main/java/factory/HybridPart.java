package main.java.factory;

public class HybridPart implements Car {

    @Override
    public void construct() {
        System.out.println("Added Hybrid Part: Electric Motor\n");
    }

}
