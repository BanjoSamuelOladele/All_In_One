package InClass;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOFUserInput {
    private static final int ZERO = 0;
    public static void main(String[] args) {
        //inputToAnArray();
        System.out.println("the average is "+sumOfAnArray());

    }
    public static int[] inputToAnArray(){
        int[] arrayOfUserInput = new int[5];
        Scanner userChoice = new Scanner(System.in);
        String askingUser;
            try {
                for (int index = ZERO; index < arrayOfUserInput.length; index++) {
                    if (index + 1 % 10 == 1) askingUser = "st";
                    else if (index + 1 % 10 == 2) askingUser = "nd";
                    else if (index +1%10 == 3)askingUser = "rd";
                else askingUser = "th";
                    System.out.print("Enter " + (index + 1) + "." + askingUser + " number: ");
                    arrayOfUserInput[index] = userChoice.nextInt();
                }
                System.out.println(Arrays.toString(arrayOfUserInput));
            } catch (java.util.InputMismatchException exception) {
                System.out.println(exception);
                System.out.println("Ode enter an integer");
            } catch (ArrayIndexOutOfBoundsException exceptionOfAnArray){
                System.out.println(exceptionOfAnArray);
            }
        return arrayOfUserInput;
    }
    private static double sumOfAnArray(){
        int[] sum = inputToAnArray();
        int total = 0;
        for (int index : sum) {
            total += index;
        }
        return (double)total/sum.length;
    }
}
