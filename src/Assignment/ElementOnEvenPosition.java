package Assignment;

public class ElementOnEvenPosition {
    public int[] evenElement(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            if (index%2 == 0) newArray[index] = index;
        }
        return newArray;
    }
}
