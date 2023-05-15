package Assignment;

import java.util.Arrays;

public class ReverseAnArray {
    public int[] methodReverseArray(int[] arr) {
        int[] reversed  = new int[arr.length];
        for (int index = arr.length - 1; index >= 0; index--) {
            reversed[arr.length - index -1] = arr[index];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;
    }
}
