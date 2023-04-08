import java.util.Scanner;
public class PlayAroundForPreviousPage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.print("pick your choice: ");
        choice = input.nextByte();

        while (choice != 0){
            switch (choice) {
                case 1 -> {
                    System.out.println("Option Pane1");
                    System.out.print("navigate option pane1: ");
                    choice = input.nextByte();
                    while (choice != 0) {
                        System.out.println("yeah");
                        choice--;
                    }
                }
                case 2 -> {
                    System.out.println("Option pan2");
                }
            }
        }
    }
}
