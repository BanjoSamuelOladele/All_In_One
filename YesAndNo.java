import java.util.Objects;
import java.util.Scanner;
public class YesAndNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userChoice;

        do {
        sum();
        System.out.print("Press any key to continue, press n to abort? ");
        userChoice = input.nextLine();

       } while (!Objects.equals(userChoice, "n"));
    }
    public static void sum(){
        Scanner input = new Scanner(System.in);
        int userFirstNumber;
        int userSecondNumber;
        System.out.print("Enter first number: ");
        userFirstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        userSecondNumber = input.nextInt();
        int result;
        result = userFirstNumber + userSecondNumber;
        System.out.println("Result is: " + result);
    }
}
