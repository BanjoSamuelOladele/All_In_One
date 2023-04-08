import java.util.Scanner;
public class ForLooping434 {
    public static void main(String[] args) {
        int initialNumber;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        initialNumber = input.nextInt();

        while(true){
            System.out.print("Enter the summing number: ");
            int tapIn = input.nextInt();
            sum = sum + tapIn;
            if(sum >= initialNumber) break;
        }
        System.out.println(initialNumber);
        System.out.println(sum);
    }
}
