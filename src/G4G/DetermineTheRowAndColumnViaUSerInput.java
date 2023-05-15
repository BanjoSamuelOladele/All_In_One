package G4G;

import java.util.Arrays;
import java.util.Scanner;

public class DetermineTheRowAndColumnViaUSerInput {
    public static void main(String[] args) {
        Scanner collect = new Scanner(System.in);
        System.out.print("Enter a number for the row of the array: ");
        int row = collect.nextInt();
        System.out.print("Enter a number for the column of the array: ");
        int column = collect.nextInt();

        int [][] arrayNumbers = new int[row][column];
        for (int index = 0; index < row; index++){
            for (int indexx = 0; indexx < column; indexx++) {
                arrayNumbers[index][indexx] = indexx;
            }
        }
        System.out.println(Arrays.deepToString(arrayNumbers));
    }
}
