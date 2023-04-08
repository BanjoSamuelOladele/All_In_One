import java.util.Scanner;
class PhoneMenuTest{
    public static void main(String[] args) {
        int choice;
        int subchoice;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("choice: ");
            choice = input.nextByte();

            switch (choice) {
                case 1 -> {
                    System.out.println("sub choice: ");
                    do {
                        System.out.println("Enter preferred choie: ");
                        subchoice = input.nextByte();
                        switch (subchoice) {
                            case 1:
                                System.out.println("welcome");
                                break;
                            case 2:
                                break;
                        }
                    } while (subchoice != 2);
                }
                case 2 -> System.out.println("my choice 2");
                case 3 -> System.exit(0);
            }
        }
    }
}