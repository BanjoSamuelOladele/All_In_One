package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConcatenatingTwoArraysTest {
    ConcatenatingTwoArrays concatenateTwoArrays;
    @BeforeEach void setUp(){
        concatenateTwoArrays = new ConcatenatingTwoArrays();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(concatenateTwoArrays);
    }
    @Test public void methodInClassCanJoinTwoArrayElementsToOne(){
        int[] firstArray = new int []{2,3};
        int[] secondArray = new int[]{4,5,6};
        assertEquals("[2, 3, 4, 5, 6]", Arrays.toString(concatenateTwoArrays.joinTwoArraysSequentially(firstArray,secondArray)));
    }
    @Test public void methodInClassCanDOWonderByJoiningTwoElementsInAnArray(){
        int[] firstArray = new int []{1,2,3,4};
        int[] secondArray = new int[]{1,0,2};;
        assertEquals("[1, 2, 3, 4, 1, 0, 2]", Arrays.toString(concatenateTwoArrays.joinTwoArraysSequentially(firstArray,secondArray)));
    }
}
