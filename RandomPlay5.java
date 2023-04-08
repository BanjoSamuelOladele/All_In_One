import java.util.Scanner;

public class RandomPlay5 {
    public static void main(String[] args) {
        int newValid = 1;
        int sum24 = 0;
        Scanner input = new Scanner(System.in);
        while (newValid <= 100) {
            System.out.print("Enter score no" + newValid + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
                if (newValid % 2 == 0) sum24 += score;
                newValid++;
            }
        }
        System.out.println("Total sum is: " + sum24);
    }
}