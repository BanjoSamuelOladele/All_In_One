package broCode;
import java.util.Scanner;
public class LargestNumberInASet {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int index = 0;
        int maximUnNumber =0;
        int minumumNumber = 1;
        int userchoices = 0;
        int anotherNumber;

        for (index = 0; index < 5; index++) {
            System.out.print("Enter a number: ");
            userchoices = userInput.nextInt();
            if (userchoices > 0) {

                    if (userchoices > maximUnNumber) maximUnNumber = userchoices;
                    if (userchoices > minumumNumber && userchoices < maximUnNumber) minumumNumber = userchoices;
            }
        }
        System.out.println("the largest number is "+ maximUnNumber);
        System.out.println("the smallest number is: "+ minumumNumber);

    }
}
