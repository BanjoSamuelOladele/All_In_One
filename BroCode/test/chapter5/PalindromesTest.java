package chapter5;

import broCode.AbsoluteRandomNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest{

    Palindromes palindromes;
    @BeforeEach
    void setUp() {
        palindromes = new Palindromes();
    }

    @Test public void getMethodPalindromesStatus(){
        assertEquals("Palindromes", Palindromes.getinputStatus("22122"));
    }
    @Test public void getMethodPalindromeState(){
        assertEquals("not palindromes", Palindromes.getinputStatus("21121"));
    }
}