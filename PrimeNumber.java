import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int numberOfOccurrence;
        int countOfZero = 0;
        System.out.print("Enter a number: ");
        userInput = input.nextInt();
        for (numberOfOccurrence = 1; numberOfOccurrence <= userInput; numberOfOccurrence++) {
            if (userInput % numberOfOccurrence == 0) countOfZero++;
            if (countOfZero > 2) break;       }
        if (countOfZero == 2) System.out.println(userInput + " is a prime number");
        else System.out.println(userInput + " is not a prime number.");
    }

}

