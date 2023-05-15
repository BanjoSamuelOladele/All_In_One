package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementOnOddPositionTest {
    ElementOnOddPosition oddPosition;
    @BeforeEach void setUp(){
        oddPosition = new ElementOnOddPosition();
    }
    @Test public void objectOfClassExist(){
        oddPosition = new ElementOnOddPosition();
    }
    @Test public void methodCanPrintOddIndex(){
        int[] arr = new int[6];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index;
        }
        System.out.println(Arrays.toString(arr));
        assertEquals("[0, 1, 0, 3, 0, 5]", Arrays.toString(oddPosition.methodOddIndex(arr)));
    }
    @Test public void methodCanPrintOddIndexAgain(){
        int[] arr = new int[10];
        for (int index = 1; index < arr.length; index++) {
            arr[index] = index;
        }
        assertEquals("[0, 1, 0, 3, 0, 5, 0, 7, 0, 9]", Arrays.toString(oddPosition.methodOddIndex(arr)));
    }
}
