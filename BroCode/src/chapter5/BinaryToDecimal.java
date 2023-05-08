package chapter5;

import java.util.Scanner;

public class BinaryToDecimal {
    private static final Scanner userChoice = new Scanner(System.in);
    public static void main(String[] args) {
        //converting string properly

        String numbers = "100";
        int sum = 0;

        for (int index = 0; index < numbers.length(); index++){
            int collect = Integer.parseInt(numbers);
            int get = collect % 10;
            sum += get * Math.pow(2, index);
            collect = collect /10;
        }
        System.out.println(sum);
    }
}
