package classLearning;

import java.util.Arrays;

public class ArrayObjectOut {
    public static void main(String[] args) {
//        int[] nums = {3,6,7,8,9};
//        for (int index = 0; index < nums.length; index++) {
//            System.out.println(nums[index]);
//        }
        int [] nums = {2,4,5,6,1,3,4,3};
//        System.out.println(nums[8]);
//        System.out.println("The maximum number in the array is: " + getMaximumNumberOfAnArrayList(nums));
//
//        System.out.println("The minimum number in the array is: " + getMinimumNumberOfAnArrayList(nums));
        System.out.println(getMinimumAndMaximumNumberOfAnArray(nums));
        System.out.println((Arrays.toString(getMaxAndMin(nums))));
    }
    public static int getMaximumNumberOfAnArrayList(int [] arrayOfNumbers){
        int maximumNumber = arrayOfNumbers[0];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            if (arrayOfNumbers[index] > maximumNumber) maximumNumber = arrayOfNumbers[index];
        }
        return maximumNumber;
    }
    public static int getMinimumNumberOfAnArrayList(int[] arrayOfNumbers){
        int minimumNumber = arrayOfNumbers[0];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            if (arrayOfNumbers[index] < minimumNumber){minimumNumber = arrayOfNumbers[index];}
        }
        return minimumNumber;
    }
    public static String getMinimumAndMaximumNumberOfAnArray(int[] arrayOfNumbers){
        int maximumNumber = maximumNumber(arrayOfNumbers);
        int minimumNumber = minimumNumber(arrayOfNumbers);
        return "Minimum number is: " + minimumNumber + " Maximum Number is: " + maximumNumber;
    }
    public static int[] getMaxAndMin(int[] arrayOfNumbers){
        int [] maxAndMin = new int[2];
        maxAndMin[0] = minimumNumber(arrayOfNumbers);
        maxAndMin[1] = maximumNumber(arrayOfNumbers);
        return maxAndMin;
    }
    private static int maximumNumber(int[] arrayOfNumbers) {
    int maximumNumber = arrayOfNumbers[0];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            if (arrayOfNumbers[index] > maximumNumber) maximumNumber = arrayOfNumbers[index];
        }
        return maximumNumber;
    }
    private static int minimumNumber(int [] arrayOfNumbers){
        int minimumNumber = arrayOfNumbers[0];
        for (int index = 0; index < arrayOfNumbers.length; index++) {
            if (arrayOfNumbers[index] < minimumNumber) minimumNumber = arrayOfNumbers[index];
        }
        return minimumNumber;
    }
}