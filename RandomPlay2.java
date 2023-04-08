import java.util.Scanner;

public class RandomPlay2 {
    public static void main(String[] args) {
        int sum = 0, counter = 1;
        int newValid = 0;
        Scanner input = new Scanner(System.in);
        for (; counter <= 5; counter++) {
            System.out.print("Enter score no" + counter + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
                sum += score;
                newValid++;
            }
        }
        System.out.printf("Total sum is: %d%n", sum);
        System.out.println("Average is: " + (sum/newValid));
    }
}
