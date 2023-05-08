package chapter5;

import java.util.Scanner;

public class DecimalEquivalent {
    static Scanner userChoice = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        String userInput = userChoice.nextLine();


        System.out.println(decimalEquivalent(userInput));
    }

    public static int decimalEquivalent(String input){
        int result = 0;
        int userInput = Integer.parseInt(input);
        for (int index = 0; index < userInput; index++) {
            int remainder;
            if (index == 0) {
                remainder = userInput % 10;
                result += remainder * Math.pow(2, index);
            }
            if (index > 0){
                userInput = userInput /10;
                remainder = userInput % 10;
                result += remainder * Math.pow(2, index);
            }
        }

        return result;
    }
}
