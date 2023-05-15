package InClass;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNUmberToAnArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int[] array = new int[5];
        for (int index = 0; index < array.length;) {
            System.out.print("Enter an Even number: ");
            array[index] = userInput.nextInt();
            if (array[index] % 2 == 0) index++;
            else System.out.println("you enter an odd number");
        }
        System.out.println(Arrays.toString(array));
    }
}
