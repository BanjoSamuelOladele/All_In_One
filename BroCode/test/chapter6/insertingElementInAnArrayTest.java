package chapter6;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static chapter6.insertingElementInAnArray.checkIfCorrect;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class insertingElementInAnArrayTest {
    insertingElementInAnArray arrayTest = new insertingElementInAnArray();
    int[] arr = new int[500];

    @Test
    public void checkMethod() {
        int[] get = checkIfCorrect(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(i + 1, get[i]);
        }
//        assertEquals(1, get[0]);
    }
    @Test public void checkArrayMethodAgain(){
        int [] arr = new int[10];
        int[] anotherArrayTest = checkIfCorrect(arr);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", Arrays.toString(anotherArrayTest));
    }
    @Test public void checkArrayMethodProperly(){
        int[] expected = new int[500];
        for (int index = 0; index < expected.length; index++) {
            expected[index] +=index + 1;
        }
        int[] actual = checkIfCorrect(arr);
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}
