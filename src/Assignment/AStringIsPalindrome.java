package Assignment;

public class AStringIsPalindrome {
    public static String reverseInputCharacter(String userInput) {
        String reversedInput = "";
        for (int index = userInput.length() -1; index >= 0; index--) {
            reversedInput += userInput.charAt(index);
        }
        String result;
        if (userInput.equals(reversedInput)) result = "Palindrome";
        else result = "Not Palindrome";
        System.out.println(reversedInput);
        return result;
    }
}
