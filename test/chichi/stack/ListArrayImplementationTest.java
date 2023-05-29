package chichi.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListArrayImplementationTest {
    ListArrayImplementation listArrayImplementation;
    @BeforeEach
    void setUp() {
        listArrayImplementation = new ListArrayImplementation();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(listArrayImplementation);
    }
    @Test public void listOfElementsIsEmpty(){
        assertTrue(listArrayImplementation.isEmpty());
    }
    @Test public void listOfEleentsIsNotEmptyWhenAnElementISAdded(){
        listArrayImplementation.add(0, "OOP");
        assertFalse(listArrayImplementation.isEmpty());
    }
    
}