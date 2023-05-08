package chapter5;

import java.util.Scanner;

public class Comparator {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("enter the first number: ");
        int firstNumber = userInput.nextInt();
        System.out.print("enter the second number: ");
        int secondNumber = userInput.nextInt();

        int result = comparator(firstNumber, secondNumber);
        System.out.println(result);
        if (result == 1) System.out.println(firstNumber + " is greater than " + secondNumber);
        if (result == 0) System.out.println(firstNumber + " is equals to " + secondNumber);
        if (result == -1) System.out.println(secondNumber + " is greater than " + firstNumber);
    }

    public static int comparator(int firstNumber, int secondNumber){
        int result;
        if (firstNumber == secondNumber) result = 0;
        else if (firstNumber > secondNumber) result = 1;
        else result = -1;
        return result;
    }
}
