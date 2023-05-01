package broCode;
import java.util.Scanner;
public class CheckingStringEquality {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your name");
        String response = userInput.nextLine();

        if (response.equals("S") || response.equals("s")) {
            System.out.println("baller");
        }
    }
}
