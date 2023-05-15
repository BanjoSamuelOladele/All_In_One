package Assignment;

import java.util.Arrays;

public class ConcatenateTwoArraysSequentially {
    public int[] concatenateSequentially(int[] firstArray, int[] secondArray) {
        int i = 0;
        int j = 0;
        int ij = 0;
        int k = 0;
        int[] totalArray = new int[firstArray.length + secondArray.length];
        for (int index = 0; index < totalArray.length; index++) {
            for (; i < firstArray.length; i++) {
                for (; ij == index; ij++) {
                    totalArray[index+i] = firstArray[i];
                }
            }
            for (; j < secondArray.length; j++) {
                for (; k == index; k++) {
                    totalArray[index+j + 1] = secondArray[j];
                }
            }
        }
        System.out.println(Arrays.toString(totalArray));
        return totalArray;
    }
}
