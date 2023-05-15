package InClass;

import java.util.Arrays;

public class MultiDimentionalArrays {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int[][] arrayOfNumbers = new int[5][];
        arrayOfNumbers[0] = new int[10];
        arrayOfNumbers[1] = new int[]{2, 4, 6, 8, 10};
        arrayOfNumbers[2] = new int[2];
        arrayOfNumbers[3] = new int[5];
        arrayOfNumbers[4] = new int[6];

        for (int index = 0; index < array[0].length; index++) array[0][index] = index;
        System.out.println(Arrays.deepToString(array));
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            for (int indexOfIndex = 0; indexOfIndex < arrayOfNumbers[index].length; indexOfIndex++) {
                arrayOfNumbers[index][indexOfIndex] = indexOfIndex;
            }
        }
        System.out.println(Arrays.deepToString(arrayOfNumbers));
    }
}
