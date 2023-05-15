package Assignment;

public class ConcatenatingTwoArrays {
    public int[] joinTwoArraysSequentially(int[] firstArray, int[] secondArray) {
        int[] array = new int[firstArray.length + secondArray.length];
        for (int index = 0; index < firstArray.length; index++) {
            array[index] = firstArray[index];
        }
        for (int index = 0; index < secondArray.length; index++) {
            array[firstArray.length + index] = secondArray[index];
        }
        return array;
    }
}
