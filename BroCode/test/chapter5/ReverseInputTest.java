package chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseInputTest {
    ReverseInput reverser;
    @BeforeEach
    void setUp() {
        reverser = new ReverseInput();
    }
    @Test public void getMethodReverseToWork(){
        assertEquals("eled", ReverseInput.reverseUserInput("dele"));
    }
    @Test public void getMethodReverseToisFunctioning(){
        assertEquals("saidat", ReverseInput.reverseUserInput("tadias"));
    }
    @Test public void getMethodReverseToisFunctioning2(){
        assertEquals("leumas", ReverseInput.reverseUserInput("samuel"));
    }
}