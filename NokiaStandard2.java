import java.util.Scanner;
public class NokiaStandard2 {
    public static void main(String[] args) {
        phoneMenu();
    }

    public static void phoneMenu(){
        Scanner input = new Scanner(System.in);
        int userInput;
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Phone Book",
                "2. Messages",
                "3. Chat",
                "4. Call Register",
                "5. Tones",
                "6. Settings",
                "7. Call Divert",
                "8. Games",
                "9. Calculator",
                "10. Reminders",
                "11. Clock",
                "12. Profiles",
                "13. SIM Services",
                "0. Previous Menu");
        System.out.print("Welcome to my Phone, Enter number to navigate menu: ");
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> phoneBook();
            case 2 -> messages();
            case 3 -> System.out.println("Chat");
            case 4 -> callRegister();
            case 5 -> {
                System.out.println("Tones");
                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                        "1. Ringing tone",
                        "2. Ringing volume",
                        "3. Incoming call alert",
                        "4. Composer",
                        "5. Message alert tone",
                        "6. Keypad tones",
                        "7. Warning and game tones",
                        "8. Vibrating alert",
                        "9. Screen saver",
                        "0. Previous Menu");
                System.out.print("navigate Tones: ");
                int tones = input.nextInt();
                switch (tones) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                    case 0 -> phoneMenu();
                }
            }
            case 6 -> setting();
            case 7 -> System.out.println("Call Diver");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminder");
            case 11 -> clock();
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("Sim Services");
            case 0 -> phoneMenu();
        }
    }
    private static void clock() {
        Scanner input = new Scanner(System.in);
        System.out.println("Clock");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Alarm clock",
                "2. Clock settings",
                "3. Date setting",
                "4. Stopwatch",
                "5. Countdown timer",
                "6. Auto update of date and time",
                "0. Previous Menu");
        System.out.print("navigate Clock: ");
        int timeIs = input.nextInt();
        switch (timeIs) {
            case 1 -> System.out.println("Alarm clock");
            case 2 -> System.out.println("Clock settings");
            case 3 -> System.out.println("Date setting");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown timer");
            case 6 -> System.out.println("Auto update of date and time");
            case 0 -> phoneMenu();
        }
    }
    private static void setting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Settings");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n",
                "1. Call settings",
                "2. Phone settings",
                "3. Security settings",
                "4. Restore factory settings",
                "0. Previous Menu");
        System.out.print("navigate Settings: ");
        int phoneSettings = input.nextInt();
        switch (phoneSettings) {
            case 1 -> callSettingInSettings();
            case 2 -> phoneSettings1();
            case 3 -> securitySettings();
            case 4 -> System.out.println("Restore factory settings");
            case 0 -> phoneMenu();
        }
    }
    private static void securitySettings() {
        Scanner input = new Scanner(System.in);
        System.out.println("Settings/Security settings");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. PIN code request",
                "2. Call barring service",
                "3. Fixed dialling",
                "4. Closed user group",
                "5. Phone security",
                "6. Change access codes",
                "0. Previous Menu");
        System.out.print("navigate Settings/Security settings: ");
        int secure = input.nextInt();
        switch (secure) {
            case 1 -> System.out.println("PIN code request");
            case 2 -> System.out.println("Call barring service");
            case 3 -> System.out.println("Fixed dialling");
            case 4 -> System.out.println("Closed user group");
            case 5 -> System.out.println("Phone security");
            case 6 -> System.out.println("Change access codes");
            case 0 -> setting();
        }
    }
    private static void phoneSettings1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Settings/Phone settings");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Language",
                "2. Cell info display",
                "3. Welcome note",
                "4. Network selection",
                " 5. Lights 2",
                " 6. Confirm SIM service actions",
                "0. Previous Menu");
        System.out.print("navigate Settings/Phone settings: ");
        int settingsOfPhone = input.nextInt();
        switch (settingsOfPhone) {
            case 1 -> System.out.println("Language");
            case 2 -> System.out.println("Cell info display");
            case 3 -> System.out.println("Welcome note");
            case 4 -> System.out.println("Network selection");
            case 5 -> System.out.println("Lights");
            case 6 -> System.out.println("Confirm SIM service actions");
            case 0 -> setting();
        }
    }
    private static void callSettingInSettings() {
        Scanner input = new Scanner(System.in);
        System.out.println("Settings/Call settings");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                " 1. Automatic redial",
                "2. Speed dialling",
                "3. Call waiting options",
                "4. Own number sending",
                "5. Phone line in use",
                "6. Automatic answer",
                "0. Previous Menu");
        System.out.print("navigate Settings/Call settings: ");
        int settingOfSeeting = input.nextInt();
        switch (settingOfSeeting) {
            case 1 -> System.out.println("Automatic redial");
            case 2 -> System.out.println("Automatic redial");
            case 3 -> System.out.println("Call waiting options");
            case 4 -> System.out.println("Own number sending");
            case 5 -> System.out.println("Phone line in use");
            case 6 -> System.out.println("Automatic answer");
            case 0 -> setting();
        }
    }
    private static void callRegister() {
        Scanner input = new Scanner(System.in);
        System.out.println("Call register");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Missed calls",
                "2. Received calls",
                "3. Dialled numbers",
                "4. Erase recent call lists",
                "5. Show call duration",
                "6. Show call costs",
                "7. Call cost settings",
                "8. Prepaid credit",
                "0. Previous Menu");
        System.out.print("navigate Call register: ");
        int callRegister1 = input.nextInt();
        switch (callRegister1) {
            case 1 -> System.out.println("Missed calls");
            case 2 -> System.out.println("Received calls");
            case 3 -> System.out.println("Dialled numbers");
            case 4 -> System.out.println("Erase recent call lists");
            case 5 -> callDuration();
            case 6 -> callCosts();
            case 7 -> callSettings();
            case 8 -> System.out.println("Prepaid credit");
            case 0 -> phoneMenu();
        }
    }

    private static void callSettings() {
        Scanner input = new Scanner(System.in);
        System.out.println("Call Register/Call cost settings");
        System.out.printf("%s%n%s%n%s%n",
                "1. Call cost limit",
                "2. Show costs in",
                "0. Previous Menu");
        System.out.print("navigate Call Register/Call cost settings: ");
        int settingOfCalls = input.nextInt();
        switch (settingOfCalls) {
            case 1 -> System.out.println("Call cost limit");
            case 2 -> System.out.println("Show costs in");
            case 0 -> callRegister();
        }
    }
    private static void callCosts() {
        Scanner input = new Scanner(System.in);
        System.out.println("call Register/Show call costs");
        System.out.printf("%s%n%s%n%s%n%s%n",
                " 1. Last call cost",
                "2. All calls’ cost",
                "3. Clear counters",
                "0. Previous Menu");
        System.out.print("navigate call Register/call cost: ");
        int costOfCall = input.nextInt();
        switch (costOfCall) {
            case 1 -> System.out.println("Last call cost");
            case 2 -> System.out.println("All calls’ cost");
            case 3 -> System.out.println("Clear counters");
            case 0 -> callRegister();
        }
    }
    private static void callDuration() {
        Scanner input = new Scanner(System.in);
        System.out.println("Call Register/Show call duration");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Last call duration",
                "2. All calls’ duration",
                "3. Received calls’ duration",
                "4. Dialled calls’ duration",
                "5. Clear timers",
                "0. Previous Menu");
        System.out.print("navigate Call duration: ");
        int durationOfCall = input.nextInt();
        switch (durationOfCall) {
            case 1 -> System.out.println("Last call duration");
            case 2 -> System.out.println("All calls’ duration");
            case 3 -> System.out.println("Received calls’ duration");
            case 4 -> System.out.println("Dialled calls’ duration");
            case 5 -> System.out.println("Clear timers");
            case 0 -> callRegister();
        }
    }
    private static void messages() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n", "My Messages");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Write messages",
                "2. Inbox",
                "3. Outbox",
                "4. Picture messages",
                "5. Templates",
                "6. Smileys",
                "7. Message settings",
                "8. Info service",
                "9. Voice mailbox number",
                "10.Service command edit",
                "0. Previous Menu");
        System.out.print("navigate through Messages: ");
        int message = input.nextInt();
        switch (message) {
            case 1 -> System.out.println("Write messages");
            case 2 -> System.out.println("Inbox");
            case 3 -> System.out.println("Outbox");
            case 4 -> System.out.println("Picture messages");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> messageSettings();
            case 8 -> System.out.println("Info service");
            case 9 -> System.out.println("Voice mailbox number");
            case 10 -> System.out.println("Service command editor");
            case 0 -> phoneMenu();
        }
    }
    private static void messageSettings() {
        Scanner input = new Scanner(System.in);
        System.out.println("Messages/Message settings");
        System.out.printf("%s%n%s%n%s%n",
                "1. Set 1",
                "2. Common",
                "0. Previous Menu");
        System.out.print("navigate Messages/Message settings: ");
        int messagesSettings = input.nextInt();
        switch (messagesSettings) {
            case 1 -> set1();
            case 2 -> common();
            case 3 -> messages();
        }
    }

    private static void common() {
        Scanner input = new Scanner(System.in);
        System.out.println("Messages/Message settings/Common");
        System.out.printf("%s%n%s%n%s%n%s%n",
                "1. Delivery reports",
                "2. Reply via same centre",
                "3. Character support",
                "0. Previous Menu");
        System.out.print("navigate Messages/Message settings/Common: ");
        int common = input.nextInt();
        switch (common) {
            case 1 -> System.out.println("Delivery reports");
            case 2 -> System.out.println("Reply via same centre");
            case 3 -> System.out.println("Character support");
            case 0 -> messageSettings();
        }
    }
    private static void set1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Messages/Message settings/Set 1");
        System.out.printf("%s%n%s%n%s%n%s%n",
                "1. Message centre number",
                " 2. Messages sent as",
                "3. Message validity",
                "0. Previous Menu");
        System.out.print("navigate Messages/Message settings/Set 1: ");
        int set1 = input.nextInt();
        switch (set1) {
            case 1 -> System.out.println("Message centre number");
            case 2 -> System.out.println("Messages sent as");
            case 3 -> System.out.println("Message validity");
            case 0 -> messageSettings();
        }
    }
    private static void phoneBook() {
        Scanner input = new Scanner(System.in);
        System.out.println("My Phone Book");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Search",
                "2. Service Nos. 1",
                "3. Add name",
                "4. Erase",
                "5. Edit",
                "6. Assign tone",
                "7. Send b’card",
                "8. Options",
                "9. Speed dials",
                "10. Voice tags",
                "0. Previous Menu"
        );
        System.out.print("navigate through PhoneBook: ");
        int phoneBook = input.nextInt();
        System.out.println(" ");
        switch (phoneBook) {
            case 1 -> System.out.println("search");
            case 2 -> System.out.println("Service Nos. 1");
            case 3 -> System.out.println("Add name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign tone");
            case 7 -> System.out.println("Send b’card");
            case 8 -> optionMenu();
            case 9 -> System.out.println("Speed dials");
            case 10 -> System.out.println("Voice tags");
            case 0 -> phoneMenu();
        }
    }
    private static void optionMenu() {
        Scanner input = new Scanner(System.in);
            System.out.println("Options Menu");
            System.out.printf("%s%n%s%n%s%n",
                    "1. Type of view",
                    "2. Memory status",
                    "0. Previous");
            System.out.print("navigate through OptionMenus: ");
            int phoneOption = input.nextInt();
            switch (phoneOption) {
                case 1 -> System.out.println("Type of view");
                case 2 -> System.out.println("Memory status");
                case 0 -> phoneBook();
            }
    }
}
