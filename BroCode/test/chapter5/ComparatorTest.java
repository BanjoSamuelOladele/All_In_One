package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparatorTest {
    Comparator compareNumbers;
    @BeforeEach
    void setUp() {
        compareNumbers = new Comparator();
    }
    @Test public void getStatus(){
        assertEquals(1, Comparator.comparator(2,1));
    }
    @Test public void getComapratorState(){
        assertEquals(0, Comparator.comparator(1,1));
    }
    @Test public void getStateAgain(){
        assertEquals(-1, 20,31);
    }
}