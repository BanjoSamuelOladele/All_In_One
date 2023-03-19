package takeHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    AirConditioner myAc = new AirConditioner();

    @Test public void setName(){
        myAc.productName("hp");
        assertEquals("hp", myAc.getProductName());
    }
    @Test public void setName2(){
        myAc.productName("Panasonic");
        assertEquals("Panasonic", myAc.getProductName());
    }
    @Test public void setOn(){
        myAc.onIt(true);
        assertEquals(true, myAc.getState());
    }
    @Test public void setOn1(){
        myAc.onIt(false);
        assertEquals(false, myAc.getState());
    }
    @Test public void setTemperature(){
        myAc.onIt(true);
        myAc.temperatureState(18);
        assertEquals(18, myAc.getTemperatureState());
    }
    @Test public void setTemperature1(){
        myAc.onIt(true);
        myAc.temperatureState(20);
        assertEquals(20, myAc.getTemperatureState());
    }
    @Test public void setTemperature2(){
        myAc.onIt(true);
        myAc.temperatureState(22);
        assertEquals(22, myAc.getTemperatureState());
    }
    @Test
    public void setTemperature3(){
        myAc.onIt(false);
        myAc.temperatureState(20);
        assertEquals(0, myAc.getTemperatureState());
    }

    @Test public void setTemperature4(){
        myAc.onIt(true);
        myAc.temperatureState(24);
        assertEquals(24, myAc.getTemperatureState());
    }
    @Test public void upTemperature(){
        myAc.onIt(true);
        myAc.temperatureState(25);
        myAc.increaseTemperature(25);
        assertEquals(26, myAc.getTemperatureState());
    }
    @Test public void upTemperature1(){
        myAc.onIt(true);
        myAc.temperatureState(24);
        myAc.increaseTemperature(24);
        assertEquals(25, myAc.getTemperatureState());
    }
    @Test public void upTemperature2(){
        myAc.onIt(false);
        myAc.temperatureState(24);
        myAc.increaseTemperature(24);
        assertEquals(0, myAc.getTemperatureState());
    }
    @Test public void upTemperature3(){
        myAc.onIt(true);
        myAc.temperatureState(20);
        myAc.increaseTemperature(20);
        assertEquals(21, myAc.getTemperatureState());
    }
    @Test public void downTemperature(){
        myAc.onIt(true);
        myAc.temperatureState(20);
        myAc.decreaseTemperature(20);
        assertEquals(19, myAc.getTemperatureState());
    }
    @Test public void downTemperature1(){
        myAc.onIt(true);
        myAc.temperatureState(21);
        myAc.decreaseTemperature(21);
        assertEquals(20, myAc.getTemperatureState());
    }
    @Test public void downTemperature3(){
        myAc.onIt(false);
        myAc.temperatureState(19);
        myAc.decreaseTemperature(19);
        assertEquals(0, myAc.getTemperatureState());
    }
    @Test public void upFrequency(){
        myAc.onIt(true);
        myAc.temperatureState(30);
        myAc.increaseTemperature(30);
        assertEquals(30, myAc.getTemperatureState());
    }
    @Test public void upFrequency2(){
        myAc.onIt(false);
        myAc.temperatureState(30);
        myAc.increaseTemperature(30);
        assertEquals(0, myAc.getTemperatureState());
    }
    @Test public void downFrequency(){
        myAc.onIt(true);
        myAc.temperatureState(16);
        myAc.decreaseTemperature(16);
        assertEquals(16, myAc.getTemperatureState());
    }
}