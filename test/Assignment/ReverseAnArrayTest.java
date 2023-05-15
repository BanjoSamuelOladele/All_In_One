package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseAnArrayTest {
    ReverseAnArray reverseArray;

    @BeforeEach void setUp(){
        reverseArray = new ReverseAnArray();
    }
    @Test public void objectOfClassCanBeFound(){
        reverseArray = new ReverseAnArray();
    }
    @Test public void classMethodCanReverseItElement(){
        int [] arr = new int[6];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index;
        }
        System.out.println(Arrays.toString(arr));
        assertEquals("[5, 4, 3, 2, 1, 0]",Arrays.toString(reverseArray.methodReverseArray(arr)));
    }
    @Test public void classMethodCanBeReverse(){
        int [] arr = new int[10];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index;
        }
        System.out.println(Arrays.toString(arr));
        assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]",Arrays.toString(reverseArray.methodReverseArray(arr)));
    }
}
