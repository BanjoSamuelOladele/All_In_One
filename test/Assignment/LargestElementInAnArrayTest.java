package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LargestElementInAnArrayTest {
    LargestElementInAnArray largeElement;

    @BeforeEach void setUp(){
        largeElement = new LargestElementInAnArray();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(largeElement);
    }
    @Test public void returnLargestElementInAList(){
        int[] arr = new int[]{3,5,7,8,9,1};
        largeElement.getLargeNumber(arr);
        assertEquals(9, largeElement.getLargeNumber(arr));
    }
    @Test public void maximumNumberInAnArray(){
        int[] arr = new int[]{-10, -20,-1, 0,-2,-5,-6};
        assertEquals(0, largeElement.getLargeNumber(arr));
    }
    @Test public void maximumNumberInAnArrayAgain(){
        int[] arr = new int[]{-10, -20,-1,-2,-5,-6};
        assertEquals(-1, largeElement.getLargeNumber(arr));
    }
}
