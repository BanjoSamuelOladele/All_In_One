package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RunningTotalOfAnArrayTest {
    RunningTotalOfAnArray totalInArray;
    @BeforeEach void setUp(){
        totalInArray = new RunningTotalOfAnArray();
    }
    @Test public void objectOfAClassExist(){
        assertNotNull(totalInArray);
    }
    @Test public void methodCalledCanSumElementOfAnArray(){
        int[] arrayOfNumbers = new int[10];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            arrayOfNumbers[index] = index+1;
        }
        assertEquals(55, totalInArray.sumOfAnArray(arrayOfNumbers));
    }
    @Test public void methodCalledCanSumElementOfAnArrayAgain(){
        int[] arrayOfNumbers = new int[4];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            arrayOfNumbers[index] = index;
        }
        assertEquals(6, totalInArray.sumOfAnArray(arrayOfNumbers));
    }
}
