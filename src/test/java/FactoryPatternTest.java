package test.java;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import main.java.factory.Car;
import main.java.factory.CarFactory;
import main.java.factory.Hybrid;
import main.java.factory.HybridPart;
import main.java.factory.Sport;
import main.java.factory.SportPart;
import main.java.factory.Truck;
import main.java.factory.TruckPart;

import org.junit.Test;

public class FactoryPatternTest {

    CarFactory carFactory = new CarFactory();


    @Test
    public void testSportExists() {
        Car car1 = carFactory.getCar("SPORT");
        assertNotNull(car1);
    }

    @Test
    public void testHybridExists() {
        Car car1 = carFactory.getCar("HYBRID");
        assertNotNull(car1);
    }

    @Test
    public void testTruckExists() {
        Car car1 = carFactory.getCar("TRUCK");
        assertNotNull(car1);
    }

    @Test
    public void testDifferentCar() {
        Car car1 = carFactory.getCar("SPORT");
        Car car2 = carFactory.getCar("TRUCK");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        assertNotSame(car1, car2);
    }

    @Test
    public void testNewCar() {
        Car car1 = carFactory.getCar("SPORT");
        Car car2 = carFactory.getCar("SPORT");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        assertNotSame(car1, car2);
    }

    @Test
    public void testNull() {
        Car car1 = carFactory.getCar("SUV");
        assertNull(car1);
    }

    //Testing Car Parts

    @Test
    public void testSportPartExists() {
        Car car1 = carFactory.getPart("SPORTPART");
        assertNotNull(car1);
    }

    @Test
    public void testHybridPartExists() {
        Car car1 = carFactory.getPart("HYBRIDPART");
        assertNotNull(car1);
    }

    @Test
    public void testTruckPartExists() {
        Car car1 = carFactory.getPart("TRUCKPART");
        assertNotNull(car1);
    }

    @Test
    public void testDifferentCarPart() {
        Car car1 = carFactory.getPart("SPORTPART");
        Car car2 = carFactory.getPart("TRUCKPART");
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        assertNotSame(car1, car2);
    }

    @Test
    public void testNewCarPart() {
        Car car1 = carFactory.getPart("SPORTPART");
        Car car2 = carFactory.getPart("SPORTPART");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        assertNotSame(car1, car2);
    }

    @Test
    public void testNullPart() {
        Car car1 = carFactory.getPart("SUVPART");
        assertNull(car1);
    } 

    //Test individual car constructors

    @Test
    public void testSportConstruct() {
        Sport sport = new Sport();
        sport.construct();
        assertNotNull(sport);
    }

    @Test
    public void testHybridConstruct() {
        Hybrid hybrid = new Hybrid();
        hybrid.construct();
        assertNotNull(hybrid);
    }

    @Test
    public void testTruckConstruct() {
        Truck truck = new Truck();
        truck.construct();
        assertNotNull(truck);
    }

    @Test
    public void testSportPartConstruct() {
        SportPart sportpart = new SportPart();
        sportpart.construct();
        assertNotNull(sportpart);
    }

    @Test
    public void testHybridPartConstruct() {
        HybridPart hybridpart = new HybridPart();
        hybridpart.construct();
        assertNotNull(hybridpart);
    }

    @Test
    public void testTruckPartConstruct() {
        TruckPart truckpart = new TruckPart();
        truckpart.construct();
        assertNotNull(truckpart);
    }

}
