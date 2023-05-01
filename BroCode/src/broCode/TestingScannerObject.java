package broCode;
import java.util.Scanner;
public class TestingScannerObject {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int grade = 0;
        int total =0;
        System.out.print("Enter a number: ");
        while (userInput.hasNextInt()){
            int counter =1;
            grade = userInput.nextInt();
            total += grade;

            System.out.print("Enter a number: ");
            System.out.println(counter +" and "+ grade);
            counter++;
        }
        System.out.println(total);
    }
}
