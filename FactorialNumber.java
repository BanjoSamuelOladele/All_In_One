import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int newUserInput;
        int result;
        int numberOfOperation;
        System.out.print("Enter the factorial number: ");
        userInput = input.nextInt();
        newUserInput = userInput;
        --userInput;
        result = newUserInput * userInput;
        for (numberOfOperation = 0; numberOfOperation < userInput; numberOfOperation++){
            --userInput;
            result *= userInput;
        }
        System.out.println("The Factorial of " + newUserInput + " is: " + result);
    }
}
