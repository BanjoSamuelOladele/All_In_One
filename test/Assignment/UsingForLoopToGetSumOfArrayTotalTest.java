package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UsingForLoopToGetSumOfArrayTotalTest {
    UsingTheDifferentTypesOfLoopsToGetTheTotalInAnArray forLoop;
    @BeforeEach void setUp(){
        forLoop = new UsingTheDifferentTypesOfLoopsToGetTheTotalInAnArray();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(forLoop);
    }
    @Test public void methodSumArrayTotalReturnTheTotalOfItElement(){
        int[] arrayOfNumbers = new int[5];
        for (int index = 0; index < arrayOfNumbers.length; index++){
            arrayOfNumbers[index] = index+2;
        }
        assertEquals(20, forLoop.sumOfAnArrayUsingForLoop(arrayOfNumbers));
    }
    @Test public void methodSumArrayTotalReturnTheTotalOfItElementAgain(){
        int[] arrayOfNumbers = new int[5];
        for (int index = 0; index < arrayOfNumbers.length; index++){
            arrayOfNumbers[index] = index;
        }
        assertEquals(10, forLoop.sumOfAnArrayUsingForLoop(arrayOfNumbers));
    }
    @Test public void methodInClassCanReturnItTotalInAnArray(){
        int[] arrayOfNumbers = new int[5];
        for (int index = 0; index < arrayOfNumbers.length; index++){
            arrayOfNumbers[index] = index+2;
        }
        assertEquals(20, forLoop.sumOfAnArrayUsingWhileLoop(arrayOfNumbers));
    }
    @Test public void methodInClassCanReturnItTotalInAnArrayAgain(){
        int[] arrayOfNumbers = new int[10];
        for (int index = 0; index < arrayOfNumbers.length; index++){
            arrayOfNumbers[index] = index;
        }
        assertEquals(45, forLoop.sumOfAnArrayUsingWhileLoop(arrayOfNumbers));
    }
    @Test public void methodCanDoYetAnotherRun(){
        int[] arrayOfNumbers = new int[10];
        for (int index = 0; index < arrayOfNumbers.length; index++){
            arrayOfNumbers[index] = index;
        }
        assertEquals(45, forLoop.sumOfAnArrayUsingDoWhileLoop(arrayOfNumbers));
    }
}
