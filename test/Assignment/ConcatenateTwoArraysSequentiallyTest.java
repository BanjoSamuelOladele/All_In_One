package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConcatenateTwoArraysSequentiallyTest {
    ConcatenateTwoArraysSequentially joinArrays;
    @BeforeEach void setUp(){
        joinArrays = new ConcatenateTwoArraysSequentially();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(joinArrays);
    }
    @Test public void concatenateSimply(){
        int[] firstArray = new int[]{0,1};
        int[] secondArray = new int[]{0,1,2};
        assertEquals("[0, 0, 1, 1, 2]", Arrays.toString(joinArrays.concatenateSequentially(firstArray,secondArray)));
    }
}
