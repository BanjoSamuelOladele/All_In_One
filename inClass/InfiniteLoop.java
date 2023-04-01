package inClass;
import java.util.Scanner;
public class InfiniteLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSales = 0;
               int userInput = 0;
        System.out.print("Enter product price: ");
        userInput = input.nextInt();

        while(userInput != -1){
            totalSales = totalSales + userInput;
            System.out.print("Enter product price: ");
            userInput = input.nextInt();
        }
        System.out.print("Total Sales is: " + totalSales);
    }

}
