package takeHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike myRide = new Bike();

    @Test public void onBikeTest(){
        myRide.bikeOn(true);
        assertEquals(true, myRide.callBike());
    }
    @Test public void onBikeTest1(){
        myRide.bikeOn(false);
        assertFalse(myRide.callBike());
    }
    @Test public void gearTest(){
        myRide.bikeOn(true);
        myRide.setGear("gear1");
        assertEquals("gear1", myRide.getGear());

    }
    @Test public void gearTest1(){
        myRide.bikeOn(true);
        myRide.setGear(("gear2"));
        assertEquals("gear2", myRide.getGear());
    }
    @Test public void gearTest2(){
        myRide.bikeOn(false);
        myRide.setGear("gear1");
        assertEquals("bike is switched off", myRide.getGear());
    }
    @Test public void gearTest3(){
        myRide.bikeOn(true);
        myRide.setGear("gear2");
        assertEquals("gear2", myRide.getGear());
    }
    @Test public void accelerationTest(){
        myRide.bikeOn(true);
        myRide.setGear("gear1");
        myRide.accelerated(11);
        assertEquals("gear1", myRide.getGear());
        assertEquals(12, myRide.getAccerated());
    }
    @Test public void accelerationTest1(){
        myRide.bikeOn(true);
        myRide.setGear("gear1");
        myRide.accelerated(19);
        assertEquals("gear1", myRide.getGear());
        assertEquals(20, myRide.getAccerated());
    }
    @Test public void accelerationTest2(){
        myRide.bikeOn(false);
        myRide.setGear("gear1");
        myRide.accelerated(20);
        assertEquals("bike is switched off", myRide.getGear());
        assertEquals(0, myRide.getAccerated());
    }
    @Test public void accelerationTest3(){
        myRide.bikeOn(true);
        myRide.setGear("gear2");
        myRide.accelerated(21);
        assertEquals("gear2", myRide.getGear());
        assertEquals(23, myRide.getAccerated());
    }

}