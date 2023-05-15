package InClass;

import java.util.Arrays;

public class ArraysOfTesting {
    private static final int ZERO = 0;

    public static void main(String[] args) {
        int[][] arrayOfArraysElements = new int[5][];
        arrayOfArraysElements[ZERO] = new int[5];
        arrayOfArraysElements[1] = new int[3];
        arrayOfArraysElements[2] = new int[10];
        arrayOfArraysElements[3] = new int[]{400, 500};
        arrayOfArraysElements[4] = new int[5];

        int[] firstRow = arrayOfArraysElements[ZERO];
        int lengthOfFirstROw = firstRow.length;
        for (int index = ZERO; index < lengthOfFirstROw; index++) {
            firsROw(firstRow, index);
        }

        populateRow(arrayOfArraysElements[1]);
        populateRow(arrayOfArraysElements[2]);
        populateFourthROw(arrayOfArraysElements[4]);

//        for (int index = ZERO; index < lengthOfFifthRow; index++) {
//            if (index == ZERO) arrayOfArraysElements[4][index] = indexOfAtTheStart;
//            else {
//                arrayOfArraysElements[4][index] = indexOfAtTheStart * multipleOfTheStart;
//                multipleOfTheStart++;
//            }
//        }
        System.out.println(Arrays.deepToString(arrayOfArraysElements));
    }
    public static void firsROw(int[]rowOne, int index){
        rowOne[index] = index;
    }
    public static void populateRow(int[] rowAT){
        for (int index = ZERO; index < rowAT.length; index++){
            rowAT[index] = index;
        }
    }
    public static void populateFourthROw(int[] row){
        int multuplyingNumber = 2;
        for (int index = 0; index < row.length; index++) {
            if (index == 0) row[index] = 100;
            else {
                row[index] = 100 * multuplyingNumber;
                multuplyingNumber++;
            }
        }
    }
}
