package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AStringIsPalindromeTest {
    AStringIsPalindrome palindrome;
    @BeforeEach void setUp(){
        palindrome = new AStringIsPalindrome();
    }
    @Test public void objectOfAClassExist(){
        assertNotNull(palindrome);
    }
    @Test public void methodCanReverseInputOfCharactersAndDetermineItStand(){
        assertEquals("Not Palindrome", AStringIsPalindrome.reverseInputCharacter("epo"));
    }
    @Test public void methodCanReverseInputOfCharactersAndDetermineItStandAgain(){
        assertEquals("Palindrome", AStringIsPalindrome.reverseInputCharacter("12221"));
    }
    @Test public void methodCanReverseInputOfCharactersAndDetermineItStandAgainAnother(){
        assertEquals("Not Palindrome", AStringIsPalindrome.reverseInputCharacter("case"));
    }
}
