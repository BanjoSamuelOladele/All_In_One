import java.util.Scanner;

public class RandomPlay4 {
    public static void main(String[] args) {
        int counter = 1;
        int newValid = 1;
        int sum24 = 0;
        Scanner input = new Scanner(System.in);
        while (newValid < 100) {
            System.out.print("Enter score no" + counter + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
                if (newValid == 2) sum24 += score;
                if (newValid == 4) sum24 += score;
                if (newValid == 6) sum24 += score;
                if (newValid == 8) sum24 += score;
                newValid++;
            }
        }
        System.out.printf("Total sum is: %d%n", sum24);
    }
}
