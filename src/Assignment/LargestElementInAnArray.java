package Assignment;

public class LargestElementInAnArray {
    public int getLargeNumber(int[] arr) {
        int maximumNumber = arr[0];
        for (int element: arr) {
            if (element > maximumNumber) maximumNumber = element;
        }
        return maximumNumber;
    }
}
