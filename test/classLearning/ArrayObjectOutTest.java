package classLearning;

import org.junit.jupiter.api.Test;

import static classLearning.ArrayObjectOut.*;
import static org.junit.jupiter.api.Assertions.*;

class ArrayObjectOutTest {

    ArrayObjectOut arrayType;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arrayType = new ArrayObjectOut();
    }
    @Test public void methodOfArrayInClassObjectCanBeTested(){
        int[] array = {1,2,3,4,5};
        for (int index = 0; index < array.length; index++) {
            assertEquals(1, getMinimumNumberOfAnArrayList(array));
        }
    }
    @Test public void methodOfArrayInClassObjectCanBeTestedAgain(){
        int[] array = {1,2,3,4,5};
        for (int index = 0; index < array.length; index++) {
            assertEquals(5, getMaximumNumberOfAnArrayList(array));
        }
    }
    @Test public void methodOfMaxAndMinCanBeObtained(){
        int[] array = {1,2,3,4,5};
        int max = getMaximumNumberOfAnArrayList(array);
        assertEquals(5, max);
    }
    @Test public void methodOfMaxAndMinCanYetAgainBeObtained(){
        int[] arrayOfNumbers = new int[5];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            arrayOfNumbers[index] = index + 5;
        }
        assertEquals(9, getMaximumNumberOfAnArrayList(arrayOfNumbers));
    }
//    @Test public void methodMaxAndMinOfClassArrayListCanBegotten(){
//        int[] arrayOfNumbers = new int[5];
//        for (int index = 0; index < arrayOfNumbers.length; index++) {
//            arrayOfNumbers[index] = index + 5;
//        }
//        int [] max = getMaxAndMin(arrayOfNumbers);
//    }
}