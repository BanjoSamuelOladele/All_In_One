package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CheckingAnElementInAListTest {
    CheckingAnElementInAList checkElement;

    @BeforeEach void setUp(){
        checkElement = new CheckingAnElementInAList();
    }
    @Test public void checkObjectOfClassExist(){
        assertNotNull(checkElement);
    }
    @Test public void methodCanCheckIfAnElementInAnArrayExist(){
        String[] arrayElement = new String[]{"Dele", "Tobi", "Esther", "Tayo"};
        assertEquals("Dele", checkElement.methodConfirmElement(arrayElement,"Dele"));
    }
}
