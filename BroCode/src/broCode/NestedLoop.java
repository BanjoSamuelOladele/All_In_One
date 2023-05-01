package broCode;
import java.util.Scanner;
public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter thw number of column: ");
        int columns = input.nextInt();
        System.out.print("Enter the symbol to print: ");
        String symbols = input.next();

        for (int index = 1; index <= rows; index++){
            for (int indexx = 1; indexx <= columns; indexx++){
                System.out.print(symbols);
            }
            System.out.println();
        }
    }
}
