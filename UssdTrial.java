import  java.util.Scanner;
public class UssdTrial {
    public static void ussd(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Dleex Bank");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n",
                "1. Recharge",
                "2. Transfer",
                "3. Check Balance",
                "4. Set Pin",
                "99. Exit");
        System.out.print("Enter your preferred choice: ");
        int ussdInput = input.nextInt();

        switch (ussdInput){
            case 1 -> UssdTrialRecharge.rechargePhone();
            case 2 -> System.out.println("Transfer");
            case 3 -> System.out.println("Check Balance");
            case 4 -> System.out.println("Set Pin");
            case 99 -> {System.out.println("Process Cancelled"); System.exit(99);}
            default -> {System.out.println("Invalid input");
                ussd();
            }
        }
    }
}
