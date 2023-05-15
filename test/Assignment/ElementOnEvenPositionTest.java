package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ElementOnEvenPositionTest {
    ElementOnEvenPosition evenPosition;
    @BeforeEach void setUp(){
        evenPosition = new ElementOnEvenPosition();
    }
    @Test public void assertClassObjectExist(){
        assertNotNull(evenPosition);
    }
    @Test public void methodOfClassCanGetTheEvenPostionElements(){
        int[] arr = new int[6];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index;
        }
        System.out.println(Arrays.toString(arr));
        assertEquals("[0, 0, 2, 0, 4, 0]", Arrays.toString(evenPosition.evenElement(arr)));
    }
    @Test public void methodCanGetEvenIndex(){
        int[] arr = new int[12];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index;
        }
        System.out.println(Arrays.toString(arr));
        assertEquals("[0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0]", Arrays.toString(evenPosition.evenElement(arr)));
    }
}
