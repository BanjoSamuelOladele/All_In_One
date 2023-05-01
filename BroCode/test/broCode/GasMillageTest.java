package broCode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMillageTest{
    GasMillage millage;
    @BeforeEach
    void setUp() {
        millage = new GasMillage();
    }
    @Test public void milesCoveredForAYTripCanBeGotten(){
        int milesCovered = millage.milesPerTrip();
        assertEquals(0, milesCovered);
    }
    @Test public void totalFuelUsedFotTrip(){
        int usedFuel = millage.fuelConsumed();
        assertEquals(0, usedFuel);
    }
    @Test public void milesTravelled(){
        millage.tripDistance(200);
        assertEquals(200, millage.milesPerTrip());
    }
    @Test public void fuelUsedForTrip(){
        millage.consumedFuel(30);
        assertEquals(30,millage.fuelConsumed());
    }
    @Test public void getTotalDistand(){
        millage.consumedFuel(30);

        assertEquals(30,millage.getTotalAverage());
    }
}