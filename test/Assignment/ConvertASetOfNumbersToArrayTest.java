package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConvertASetOfNumbersToArrayTest {
    ConvertASetOfNumbersToArray numbersToArray;
    @BeforeEach void setUp(){
        numbersToArray = new ConvertASetOfNumbersToArray();
    }
    @Test public void objectOfAClassExist(){
        assertNotNull(numbersToArray);
    }
    @Test public void getMethodToTakeNumberAndInsertThemEachToAnArray(){
        assertEquals("[2, 3, 4, 2]", Arrays.toString(numbersToArray.numberArray("2342")));
    }
    @Test public void getMethodToCheckInputIsBeenFixedEachToAList(){
        assertEquals("[1, 1, 2, 2, 3, 3, 2, 5, 4]",Arrays.toString(numbersToArray.numberArray("112233254")));
    }
}
