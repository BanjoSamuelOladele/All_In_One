import java.util.Scanner;
public class RandomPlay {
    public static void main(String[] args) {
        int sum = 0, counter = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  welcome!");
        String name = input.nextLine();

        input.nextLine();

        for(; counter <= 5; counter++){
            System.out.print("Enter score no" + counter + ": ");
            int score = input.nextInt();
            sum +=score;
        }
        System.out.printf("%s says Total sum is: %d", name, sum);
    }
}
