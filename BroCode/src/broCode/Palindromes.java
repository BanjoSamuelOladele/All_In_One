package broCode;
import java.util.Scanner;
public class Palindromes {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number to checker if yoor input is a possible palindrome number: ");
        int userChoice = userinput.nextInt();
        System.out.println();
        System.out.println();
        if(userChoice >= 10_000 && userChoice <= 99_999) System.out.println(palindromes(userChoice));
        else {
            System.out.println("enter number between 10,000 and 99,999");
            System.out.print("Enter a number to checker if yoor input is a possible palindrome number: ");
            userChoice = userinput.nextInt();
            System.out.println();
            System.out.println();
            if(userChoice >= 10_000 && userChoice <= 99_999) System.out.println(palindromes(userChoice));
        }

    }
    public static String palindromes(int userInput){
        int firstNumber=0, secondNumber=0, thirdNumber=0, fourthNumber=0, fifthNumber = 0;
        String choices;
        for (int index = 1; index <=5; index++) {
            if (userInput >= 10_000 && userInput <= 99_999) fifthNumber = userInput% 10;
            else if (userInput >= 1_000 && userInput <= 9_999) fourthNumber = userInput%10;
            else if (userInput >= 100 && userInput <= 999) thirdNumber = userInput%10;
            else if (userInput >= 10 && userInput <= 99) secondNumber = userInput%10;
            else firstNumber = userInput %10;
            userInput = userInput/10;
        }
        if ((fifthNumber == firstNumber) && (fourthNumber == secondNumber)) choices = "it is a palindromes";
        else choices = "It is not a palindromes";
        return choices;
    }

}
