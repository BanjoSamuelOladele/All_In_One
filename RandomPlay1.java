import java.util.Scanner;

public class RandomPlay1 {
    public static void main(String[] args) {
        int sum = 0, counter = 1;
        Scanner input = new Scanner(System.in);
        for (; counter <= 5; counter++) {
            System.out.print("Enter score no" + counter + ": ");
            int score = input.nextInt();
            if (score >= 0 && score <= 100) sum += score;
        }
        System.out.printf("Total sum is: %d", sum);
    }
}
