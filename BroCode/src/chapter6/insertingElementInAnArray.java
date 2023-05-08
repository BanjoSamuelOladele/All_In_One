package chapter6;

import java.util.Arrays;

public class insertingElementInAnArray {
    public static void main(String[] args) {

        int [] arrayOfNumbers = new int[10];

        for (int index = 0; index < arrayOfNumbers.length; index++) {arrayOfNumbers[index] += index+1;}
//        for (int element : arrayOfNumbers){
//            arrayOfNumbers[element] += element;
//        }
        System.out.println(convertToString(arrayOfNumbers));
        int [] arrayNumbers = new int[10];
        System.out.println(Arrays.toString(checkIfCorrect(arrayNumbers)));
        //System.out.println(arrayOfNumbers);

    }

    private static String convertToString(int [] arrayOfNumber){
        String getArray = "[";
        for (int index = 0; index < arrayOfNumber.length; index++) {
            if (index < arrayOfNumber.length-1) getArray += arrayOfNumber[index] + ",";
            if (index == arrayOfNumber.length - 1) getArray += arrayOfNumber[index];
        }
        getArray += "]";
        return getArray;
    }
    public static int[] checkIfCorrect(int[] arrayOfNumber){
        for (int index = 0; index < arrayOfNumber.length; index++) {
            arrayOfNumber[index] += index + 1;
        }
//        for (int element : arrayOfNumber){
//            arrayOfNumber[element] += element;
//        }
       return arrayOfNumber;
    }
}
