package Assignment;

import java.util.Arrays;

public class ElementOnOddPosition {

    public int[] methodOddIndex(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int index = 1; index < arr.length; index+=2) {
            if (index%2 != 0) newArray[index] = index;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
