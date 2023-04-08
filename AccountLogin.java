import java.util.Scanner;
public class AccountLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int UserLanguageChoice;
        System.out.printf("%s%s%n%s%s%n", "1 --- English", "    2 --- Yoruba", "3 --- Igbo", "   4 --- Hausa");
        System.out.print("Welcome, enter preferred language: ");
        UserLanguageChoice = input.nextInt();
        switch (UserLanguageChoice) {
            case 1 -> System.out.println("ENGLISH");
            case 2 -> System.out.println("YORUBA");
            case 3 -> System.out.println("IGBO");
            case 4 -> System.out.println("HAUSA");
            default -> {
                System.out.println("Enter valid choice");
                System.out.print("Welcome, enter preferred language: ");
                UserLanguageChoice = input.nextInt();
                switch (UserLanguageChoice) {
                    case 1 -> System.out.println("ENGLISH");
                    case 2 -> System.out.println("YORUBA");
                    case 3 -> System.out.println("IGBO");
                    case 4 -> System.out.println("HAUSA");
                }
            }
        }
    }
}
