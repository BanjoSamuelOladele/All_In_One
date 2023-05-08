package chapter5;

import java.util.Scanner;

public class Palindromes {
    static Scanner userchoice = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        String userInput = userchoice.nextLine();
        String result = getinputStatus(userInput);
        System.out.println(result);
    }

    public static String getinputStatus(String input){
        int userInput = Integer.parseInt(input);
        int firstNumber= 0;
        int secondNumber =0;
        int thirdNumber =0;
        int fourthNumber =0;
        int fifthNumber = 0;

        for (int index = 0; index < input.length(); index++) {
            int remainder = userInput % 10;
            if (index == 0) {firstNumber = remainder;}
            if (index == 1) secondNumber = remainder;
            if (index == 3) fourthNumber = remainder;
            if (index == 4) fifthNumber = remainder;
            userInput = userInput / 10;
        }
        String result;
        if (firstNumber == fifthNumber && secondNumber == fourthNumber) result = "Palindromes";
        else result = "not palindromes";
        return result;
    }
}
