package chapter5;



public class ReverseInput {

    public static String reverseUserInput(String input){
        String userResult = "";
        for (int index = input.length() - 1; index >= 0; index--) {
            userResult = userResult + input.charAt(index);
        }
        return userResult;
    }
}
