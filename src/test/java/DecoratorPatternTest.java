package test.java;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import main.java.decorator.BaseCar;
import main.java.decorator.DCar;
import main.java.decorator.DHybrid;
import main.java.decorator.DSport;
import main.java.decorator.DTruck;

import org.junit.Test;

public class DecoratorPatternTest {

    @Test
    public void testDSportExists() {
        DCar sport1 = new DSport(new BaseCar());
        assertNotNull(sport1);
    }
    
    @Test
    public void testDHybridExists() {
        DCar hybrid1 = new DHybrid(new BaseCar());
        assertNotNull(hybrid1);
    }
    
    @Test
    public void testDTruckExists() {
        DCar truck1 = new DTruck(new BaseCar());
        assertNotNull(truck1);
    }
    
    @Test
    public void testDifferentDCars() {
        DCar sport1 = new DSport(new BaseCar());
        sport1.assembleCar();
        DCar hybrid1 = new DHybrid(new BaseCar());
        hybrid1.assembleCar();
        System.out.println(sport1.toString());
        System.out.println(hybrid1.toString());
        assertNotSame(sport1, hybrid1);
    }
    
    @Test
    public void testNewDSport() {
        DCar sport1 = new DSport(new BaseCar());
        sport1.assembleCar();
        DCar sport2 = new DSport(new BaseCar());
        sport2.assembleCar();
        System.out.println(sport1.toString());
        System.out.println(sport2.toString());
        assertNotSame(sport1, sport2);
    }
    
    @Test
    public void testNewDHybrid() {
        DCar hybrid1 = new DHybrid(new BaseCar());
        hybrid1.assembleCar();
        DCar hybrid2 = new DHybrid(new BaseCar());
        hybrid2.assembleCar();
        System.out.println(hybrid1.toString());
        System.out.println(hybrid2.toString());
        assertNotSame(hybrid1, hybrid2);
    }
    
    @Test
    public void testNewDTruck() {
        DCar truck1 = new DTruck(new BaseCar());
        truck1.assembleCar();
        DCar truck2 = new DTruck(new BaseCar());
        truck2.assembleCar();
        System.out.println(truck1.toString());
        System.out.println(truck2.toString());
        assertNotSame(truck1, truck2);
    }
    
    

}
