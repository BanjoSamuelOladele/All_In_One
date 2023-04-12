import javax.swing.text.DefaultCaret;
import java.util.Scanner;
public class ReverseMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int multiplicationNumber;
        System.out.print("Enter a number: ");
        userInput = input.nextInt();
            for (multiplicationNumber = 12; multiplicationNumber > 0; multiplicationNumber--){
                System.out.println(userInput + " * " + multiplicationNumber + " = " + (userInput * multiplicationNumber));
            }
    }
}
