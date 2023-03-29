import org.junit.jupiter.api.Test;
import takehome.Televison;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisonTest {
    Televison myTv = new Televison();

    @Test public void objectCanBeCreated(){
       myTv = new Televison();
       assertNotNull(myTv);
    }

    @Test public void televisionState(){
       myTv.onTv(true);
       assertTrue(myTv.tvState());
    }
    @Test public void televisionStateA(){
        myTv.onTv(false);
        assertFalse(myTv.tvState());
    }
    @Test public void televisionStateB(){
        myTv.onTv(true);
        assertFalse(myTv.toggle());
    }
    @Test public void televisionStateC(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
    }
    @Test public void televisionVolumn(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.increaseVolumn();
        assertEquals(2, myTv.volumnMeasure());
    }
    @Test public void televisionVolumnA(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        assertEquals(4, myTv.volumnMeasure());
    }
    @Test public void televisonVolumnB(){
        myTv.onTv(true);
        assertFalse(myTv.toggle());
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        assertEquals(0, myTv.volumnMeasure());
    }
    @Test public void televisonVolumnC(){
        assertTrue(myTv.toggle());
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.decreaseVolumn();
        assertEquals(6, myTv.volumnMeasure());
    }
    @Test public void televisionVolumnD(){
        myTv.onTv(true);
        assertFalse(myTv.toggle());
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.decreaseVolumn();
        assertEquals(0, myTv.volumnMeasure());
    }
    @Test public void televisionVolumnE(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.increaseVolumn();
        myTv.increaseVolumn();
        myTv.decreaseVolumn();
        myTv.decreaseVolumn();
        assertEquals(0, myTv.volumnMeasure());
    }
    @Test public void televisionVolumnF(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.increaseVolumn();
        myTv.decreaseVolumn();
        myTv.decreaseVolumn();
        assertEquals(0, myTv.volumnMeasure());
    }
    @Test public void televisonVolumnG(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.increaseVolumn();
        myTv.decreaseVolumn();
        myTv.decreaseVolumn();
        myTv.decreaseVolumn();
        assertEquals(0, myTv.volumnMeasure());
    }
    @Test public void televisionMode(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.tvMode(1);
        assertEquals("TV MODE", myTv.getMode());
    }
    @Test public void televisionModeA(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.tvMode(2);
        assertEquals("AV MODE", myTv.getMode());
    }
    @Test public void televisionModeB(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.tvMode(3);
        assertEquals("HDMI MODE", myTv.getMode());
    }
    @Test public void televisionModeC(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.tvMode(4);
        assertEquals("NETFLIX", myTv.getMode());
    }
    @Test public void televisionModeD(){
        myTv.onTv(false);
        assertTrue(myTv.toggle());
        myTv.tvMode(0);
        assertEquals("CHROME", myTv.getMode());
    }
    @Test public void televisonModeE(){
        myTv.onTv(true);
        assertFalse(myTv.toggle());
        myTv.tvMode(2);
        assertEquals(" ", myTv.getMode());
    }
}
