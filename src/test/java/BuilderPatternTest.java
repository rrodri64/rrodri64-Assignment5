package test.java;

import static org.junit.Assert.assertNotNull;

import main.java.builder.BHybrid;
import main.java.builder.BSport;
import main.java.builder.BTruck;
import main.java.builder.BuilderFactory;
import main.java.builder.SpecificBuilder;

import org.junit.Before;

import org.junit.Test;

public class BuilderPatternTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testHybridCarBuilder() {
        BHybrid hybrid = new BHybrid();
        hybrid.buildCarType();
        hybrid.buildCarPart();
        assertNotNull(hybrid);
        assertNotNull(hybrid.getCar());
    }
    
    @Test
    public void testSportCarBuilder() {
        BSport sport = new BSport();
        sport.buildCarType();
        sport.buildCarPart();
        assertNotNull(sport);
        assertNotNull(sport.getCar());
    }
    
    @Test
    public void testTruckCarBuilder() {
        BTruck truck = new BTruck();
        truck.buildCarType();
        truck.buildCarPart();
        assertNotNull(truck);
        assertNotNull(truck.getCar());
    }

    @Test
    public void testFactory() {
        SpecificBuilder hybridBuilder = new BHybrid();
        SpecificBuilder sportBuilder = new BSport();
        SpecificBuilder truckBuilder = new BTruck();
        BuilderFactory factory1 = new BuilderFactory(hybridBuilder);
        BuilderFactory factory2 = new BuilderFactory(truckBuilder);
        BuilderFactory factory3 = new BuilderFactory(sportBuilder);
        
        factory1.constructCar();
        factory2.constructCar();
        factory3.constructCar();
        
        assertNotNull(factory1);
        assertNotNull(factory2);
        assertNotNull(factory3);
        
        assertNotNull(factory1.getCar());
        assertNotNull(factory2.getCar());
        assertNotNull(factory3.getCar());
 
    }
    
}
