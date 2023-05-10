package classLearning;

import java.util.Arrays;

public class PopulatingAnArray {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[100];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            arrayOfNumbers[index] += 5;
        }
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}
