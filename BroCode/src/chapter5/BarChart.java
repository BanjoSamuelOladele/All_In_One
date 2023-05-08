package chapter5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int firstNumber = 0, secondNumber = 0, thirdNumber = 0, fourthNumber = 0, fifthNumber = 0;

        for (int index = 0; index < 5;) {
            System.out.print("Enter a number between 1 and 30: ");
            int collect = userInput.nextInt();
            ;
            if (collect > 0 && collect < 31) {
                if (index == 0) firstNumber = collect;
                if (index == 1) secondNumber = collect;
                if (index == 2) thirdNumber = collect;
                if (index == 3) fourthNumber = collect;
                if (index == 4) fifthNumber = collect;
                index++;
            }
        }
        System.out.println();

        for (int index = 0; index < firstNumber; index++){
            System.out.print("*");
        }
        System.out.println();
        for (int index = 0; index < secondNumber; index++){
            System.out.print("*");
        }
        System.out.println();
        for (int index = 0; index < thirdNumber; index++){
            System.out.print("*");
        }
        System.out.println();
        for (int index = 0; index < fourthNumber; index++){
            System.out.print("*");
        }
        System.out.println();
        for (int index = 0; index < fifthNumber; index++){
            System.out.print("*");
        }
        System.out.println();
    }
}
