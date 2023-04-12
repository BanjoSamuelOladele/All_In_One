import java.util.Scanner;
public class PowerOfTheOtherNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int numberOfOccurence;;
        long resultOfPowerOfFirstNumber = 1L;

        System.out.print("Enter first Number: ");
        firstNumber = input.nextInt();
        input.nextLine();
        System.out.print("Enter second Number: ");
        secondNumber = input.nextInt();

        if (secondNumber == 0) System.out.println("Any number raise to the power of zero is 1");
        if (secondNumber == 1) System.out.println(firstNumber);
        if (secondNumber > 1) {
            for (numberOfOccurence = 0; numberOfOccurence < secondNumber; numberOfOccurence++){
                resultOfPowerOfFirstNumber  *= firstNumber;
            }
            System.out.printf("%s%d%s%d%s%d%n", "The power of the two numbers ", firstNumber, " and ", secondNumber, " is = ", resultOfPowerOfFirstNumber);
        }
    }
}
