import java.util.Scanner;

public class RandomPlay3 {
    public static void main(String[] args) {
        int counter = 1;
        int newValid = 0;
        int sum24 = 0;
        Scanner input = new Scanner(System.in);
        while (newValid < 5) {
            System.out.print("Enter score no" + counter + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
                if (newValid == 1) sum24 += score;
                if (newValid == 3) sum24 += score;
                newValid++;
            }
        }
        System.out.printf("Total sum is: %d%n", sum24);
    }
}
