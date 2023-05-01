package chapter5;
import java.util.Scanner;
public class SumOfASeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0L;
        int numberOfOccurrence = 0;
        int index;
        System.out.print("Enter the number concatenate: ");
        numberOfOccurrence = input.nextInt();
        System.out.printf("%s\t%s%n","number of times", "Times Result");

        for (index = 1; index <= numberOfOccurrence; index++){
            sum += index;
        }
        System.out.printf("%d\t%d",index-1, sum);
    }
}
