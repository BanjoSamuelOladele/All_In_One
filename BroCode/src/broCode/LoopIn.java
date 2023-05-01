package broCode;
import java.util.Scanner;
public class LoopIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()){
            System.out.print("ENter a name: ");
            name = input.nextLine();
        }
        System.out.println("Hello "+ name);

    }
}
