package takeHome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest<secondNumber, firstNumber> {
    Calculator calculate = new Calculator();

    @Test
    public void addNumberTest(){
        assertEquals(8, calculate.add(3,5));
    }
    @Test
    public void subtractNumber(){
        assertEquals(2,calculate.subtract(5,3));
    }
    @Test
    public void absoluteNumber(){
        assertEquals(2, calculate.absolute(3,5));
    }
    @Test
    public void absoluteNumber2Test(){
        assertEquals(2, calculate.absolute(5,3));
    }
    @Test public void multipleTest(){
        assertEquals(10, calculate.multiply(5,2));
    }
    @Test
    public void absoluteMultiple(){
        assertEquals(10, calculate.absoluteMulti(-2,5));
    }
    @Test public void division(){
        assertEquals(10, calculate.divide(20,2));
    }
    @Test public void absoluteDivision(){
        assertEquals(0, calculate.absDivide(20,0));
    }
    @Test public void modulusTest(){
        assertEquals(1, calculate.module(5,2));
    }

}