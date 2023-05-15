package classLearning;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfUserInput {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);
        int[] arrayOfNumbers = new int[5];
        int totalOfUSerInputInArrayOfNumbers = 0;
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            System.out.print("Enter a number: ");
            int userInput = userChoice.nextInt();
            arrayOfNumbers[index] = userInput;
            totalOfUSerInputInArrayOfNumbers = totalOfUSerInputInArrayOfNumbers + arrayOfNumbers[index];
        }

//        int get = 0;
//        int counter = 0;
//        while (counter < arrayOfNumbers.length){
//            get += arrayOfNumbers[counter];
//            counter++;
//        }
//        System.out.println(get);

        System.out.println(Arrays.toString(arrayOfNumbers));
        System.out.println("Total in the array is: " + totalOfUSerInputInArrayOfNumbers);
    }
}
