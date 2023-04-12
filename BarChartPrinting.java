import java.util.Scanner;
public class BarChartPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber;

        System.out.print("Enter the first Number: ");
        firstNumber = input.nextInt();
        System.out.print("Enter the second Number: ");
        secondNumber = input.nextInt();
        System.out.print("Enter the third Number: ");
        thirdNumber = input.nextInt();
        System.out.print("Enter the fourth Number: ");
        fourthNumber = input.nextInt();
        System.out.print("Enter the fifth Number: ");
        fifthNumber = input.nextInt();
        if (firstNumber > 0 && firstNumber <= 30) {
            System.out.print(firstNumber + " = ");
            for (int numberForFirst = 0; numberForFirst < firstNumber; numberForFirst++) {
                System.out.print("*");
            }
        }
        System.out.println( );
        if (secondNumber > 0 && secondNumber <= 30) {
            System.out.print(secondNumber + " = ");
            for (int numberForFirst = 0; numberForFirst < secondNumber; numberForFirst++) {
                System.out.print("*");
            }
        }
        System.out.println( );
        if (thirdNumber > 0 && thirdNumber <= 30) {
            System.out.print(thirdNumber + " = ");
            for (int numberForFirst = 0; numberForFirst < thirdNumber; numberForFirst++) {
                System.out.print("*");
            }
        }
        System.out.println( );
        if (fourthNumber > 0 && fourthNumber <= 30) {
            System.out.print(fourthNumber + " = ");
            for (int numberForFirst = 0; numberForFirst < fourthNumber; numberForFirst++) {
                System.out.print("*");
            }
        }
        System.out.println( );
        if (fifthNumber > 0 && fifthNumber <= 30) {
            System.out.print(fifthNumber + " = ");
            for (int numberForFirst = 0; numberForFirst < fifthNumber; numberForFirst++) {
                System.out.print("*");
            }
        }
    }
}
