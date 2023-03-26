package takehome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TVTest {
    Tv myTv = new Tv();

    @Test public void objectOfClassCanBeCreated(){
        myTv = new Tv();
    }

    @Test public void tvIsConnected(){
        assertFalse(myTv.tvStatus(false));
    }
    @Test public void tvIsConnectedA(){
        assertTrue(myTv.tvStatus(true));
    }

    @Test public void popScreen(){
        assertTrue(myTv.tvStatus(true));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals("welcome", myTv.toggler());

    }
    @Test public void popScreenA(){
        assertFalse(myTv.tvStatus(false));
        assertEquals("0", myTv.toggler());
    }
    @Test public void popScreenB(){
        assertTrue(myTv.tvStatus(true));
        assertFalse(myTv.toggleUpdate(false));
        assertEquals("goodbye", myTv.toggler());
    }
    @Test public void tvVolumnUp(){
        assertTrue(myTv.tvStatus(true));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals(5, myTv.volumnUp(4));
    }
    @Test public void tvVolumnUpB(){
        assertTrue(myTv.tvStatus(true));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals(88, myTv.volumnUp(87));
    }
    @Test public void tvVolmunUpC(){
        assertTrue(myTv.tvStatus(true));
        assertFalse(myTv.toggleUpdate(false));
        assertEquals(0, myTv.volumnUp(87));
    }
    @Test public void tvVolmunUpD(){
        assertTrue(myTv.tvStatus(true));
        assertFalse(myTv.toggleUpdate(false));
        assertEquals(0, myTv.volumnUp(77));
    }
    @Test public void tvVolumnUpE(){
        assertTrue(myTv.tvStatus(true));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals(8, myTv.volumnUp(7));
    }
    @Test public void tvVolumnUpF(){
        assertFalse(myTv.tvStatus(false));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals(0, myTv.volumnUp(7));
    }
    @Test public void tvVolumnUpG(){
        assertFalse(myTv.tvStatus(false));
        assertEquals(0, myTv.volumnUp(44));
    }
    @Test public void tvVolumnUDownA(){
        assertTrue(myTv.tvStatus(true));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals(65, myTv.volumnDown(66));
    }
    @Test public void tvVolumnUDownB(){
        assertTrue(myTv.tvStatus(true));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals(44, myTv.volumnDown(45));
    }
    @Test public void tvVolumnUDownC(){
        assertTrue(myTv.tvStatus(true));
        assertFalse(myTv.toggleUpdate(false));
        assertEquals(0, myTv.volumnDown(78));
    }
    @Test public void tvVolumnUDownD(){
        assertFalse(myTv.tvStatus(false));
        assertTrue(myTv.toggleUpdate(true));
        assertEquals(0, myTv.volumnDown(80));
    }


}