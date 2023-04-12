import java.util.Scanner;
public class MultiplicationOfSameNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userInput;
        int numberOfOccurence;

        System.out.print("Enter a number: ");
        userInput = input.nextInt();
        if (userInput > 0) {
            for (numberOfOccurence = 1; numberOfOccurence < 13; numberOfOccurence++){
                System.out.printf("%d%s%d%s%d%n",userInput, " * ", numberOfOccurence, " = ", (numberOfOccurence * userInput));
            }
        }
    }
}
