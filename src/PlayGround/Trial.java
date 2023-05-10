package PlayGround;

import java.util.Arrays;

public class Trial {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[5];
        int arrayNumber[] = new int[5];
        boolean[] isArray = new boolean[3];
        String[] arrayOfCharacters = new String[5];
        int[] arrayLength = {3,4,5,6,7};

        for (int index = 0; index < arrayOfCharacters.length; index++) {
            System.out.println(arrayOfNumbers[index] += index);
        }
        for (int index = 0; index < arrayLength.length; index++) {
            System.out.print(arrayLength[index] + " ");
        }
        System.out.println();
        for (int index = 0; index < arrayNumber.length; index++){
            System.out.print(arrayNumber[index] += index);
            System.out.print(" ");
        }
        int total = 0;
        for (int index = arrayLength.length - arrayLength.length; index < arrayLength.length; index++) {
            total += arrayLength[index];
        }
        System.out.println();
        System.out.println("Total is: " + total);
    }
}
