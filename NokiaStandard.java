import java.util.Scanner;

public class NokiaStandard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int phoneBook, phoneBookOPtionMenu;
        int messages, messagesMessagesSettings, messagesMessagesSettingsSet, messagesMessagesSettingsCommon;
        int callRegister, callRegisterDuration, callRegisterCost, callRegisterSettings;
        int tones;
        int settings, callSettings, phoneSettings,securitySettings;
        int clock;
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
                "13.SIM Services",
                "0. Quit");
        do {
            System.out.print("Welcome to my Phone, Enter number to navigate menu: ");
            userInput = input.nextInt();

            switch (userInput) {
                case 1 -> {
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
                            "0. previous Menu"
                    );
                    do {
                        System.out.print("navigate through PhoneBook: ");
                        phoneBook = input.nextInt();
                        System.out.println(" ");
                        switch (phoneBook) {
                            case 1 -> {System.out.println("search"); System.exit(1);}
                            case 2 -> {System.out.println("Service Nos. 1"); System.exit(1);}
                            case 3 -> {System.out.println("Add name"); System.exit(1);}
                            case 4 -> {System.out.println("Erase"); System.exit(1);}
                            case 5 -> {System.out.println("Edit"); System.exit(1);}
                            case 6 -> {System.out.println("Assign tone"); System.exit(1);}
                            case 7 -> {System.out.println("Send b’card"); System.exit(1);}
                            case 8 -> {
                                System.out.println("Options Menu");
                                System.out.printf("%s%n%s%n%s%n",
                                        "1. Type of view",
                                        "2. Memory status",
                                        "0. previous Menu");
                                do {
                                    System.out.print("navigate through OptionMenus: ");
                                    phoneBookOPtionMenu = input.nextInt();
                                    switch (phoneBookOPtionMenu) {
                                        case 1 -> System.out.println("Type of view");
                                        case 2 -> System.out.println("Memory status");
                                    }
                                } while (phoneBookOPtionMenu != 0);
                            }
                            case 9 -> {System.out.println("Speed dials"); System.exit(1);}
                            case 10 -> {System.out.println("Voice tags"); System.exit(1);}
                            default -> System.out.println("Choose options again");
                        }
                    } while (phoneBook != 0);
                }
                case 2 -> {
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
                    do {
                        System.out.print("navigate through Messages: ");
                        messages = input.nextInt();
                        switch (messages) {
                            case 1 -> {
                                System.out.println("Write messages");
                                System.exit(2);
                            }
                            case 2 -> {
                                System.out.println("Inbox");
                                System.exit(2);
                            }
                            case 3 -> {
                                System.out.println("Outbox");
                                System.exit(2);
                            }
                            case 4 -> {
                                System.out.println("Picture messages");
                                System.exit(2);
                            }
                            case 5 -> {
                                System.out.println("Templates");
                                System.exit(2);
                            }
                            case 6 -> {
                                System.out.println("Smileys");
                                System.exit(2);
                            }
                            case 7 -> {
                                System.out.println("Message settings");
                                System.out.printf("%s%n%s%n%s%n",
                                        "1. Set 1",
                                        "2. Common",
                                        "0. Previous Menu");
                                do {
                                    System.out.print("navigate Message Setting: ");
                                    messagesMessagesSettings = input.nextInt();
                                    switch (messagesMessagesSettings) {
                                        case 1: {
                                            System.out.println("Message settings/Set 1");
                                            System.out.printf("%s%n%s%n%s%n%s%n",
                                                    "1. Message centre number",
                                                    " 2. Messages sent as",
                                                    "3. Message validity",
                                                    "0. Previous Menu");
                                            do {
                                                System.out.print("navigate Message Setting/Set 1: ");
                                                messagesMessagesSettingsSet = input.nextInt();
                                                switch (messagesMessagesSettingsSet) {
                                                    case 1 -> System.out.println("Message centre number");
                                                    case 2 -> System.out.println("Messages sent as");
                                                    case 3 -> System.out.println("Message validity");
                                                }
                                            } while (messagesMessagesSettingsSet != 0);
                                        }
                                         break;
                                        case 2: {
                                            System.out.println("Common");
                                            System.out.printf("%s%n%s%n%s%n%s%n",
                                                    "1. Delivery reports",
                                                    "2. Reply via same centre",
                                                    "3. Character support",
                                                    "0. Previous Menu");

                                            System.out.print("navigate Message Setting/Common: ");
                                            messagesMessagesSettingsCommon = input.nextInt();
                                            switch (messagesMessagesSettingsCommon) {
                                                case 1 -> System.out.println("Delivery reports");
                                                case 2 -> System.out.println("Reply via same centre");
                                                case 3 -> System.out.println("Character support");
                                            }
                                        }
                                        if(messagesMessagesSettingsCommon == 0) break;
                                    }
                                } while (messagesMessagesSettings != 0);
                            }
                            case 8 -> {
                                System.out.println("Info service");
                                System.exit(2);
                            }
                            case 9 -> {
                                System.out.println("Voice mailbox number");
                                System.exit(2);
                            }
                            case 10 -> {
                                System.out.println("Service command editor");
                                System.exit(2);
                            }
                            default -> System.out.println("Choose option again!");
                        }
                    } while (messages != 0);
                }
                case 3 -> {
                    System.out.println("Chat");
                    System.exit(3);
                }
                case 4 -> {
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
                    do {
                        System.out.print("navigate Call register: ");
                        callRegister = input.nextInt();
                        switch (callRegister) {
                            case 1 -> {System.out.println("Missed calls"); System.exit(4);}
                            case 2 -> {System.out.println("Received calls"); System.exit(4);}
                            case 3 -> {System.out.println("Dialled numbers"); System.exit(4);}
                            case 4 -> {System.out.println("Erase recent call lists"); System.exit(4);}
                            case 5 -> {
                                System.out.println("Show call duration");
                                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n",
                                        "1. Last call duration",
                                        "2. All calls’ duration",
                                        "3. Received calls’ duration",
                                        "4. Dialled calls’ duration",
                                        "5. Clear timers",
                                        "0. Previous Menu");
                                do {
                                    System.out.print("navigate Call duration: ");
                                    callRegisterDuration = input.nextInt();
                                    switch (callRegisterDuration) {
                                        case 1 -> System.out.println("Last call duration");
                                        case 2 -> System.out.println("All calls’ duration");
                                        case 3 -> System.out.println("Received calls’ duration");
                                        case 4 -> System.out.println("Dialled calls’ duration");
                                        case 5 -> System.out.println("Clear timers");
                                    }
                                } while (callRegisterDuration != 0);
                            }
                            case 6 -> {
                                System.out.println("Show call costs");
                                System.out.printf("%s%n%s%n%s%n%s%n",
                                        " 1. Last call cost",
                                        "2. All calls’ cost",
                                        "3. Clear counters",
                                        "0. Previous Menu");
                                do {
                                    System.out.print("navigate Call duration: ");
                                    callRegisterCost = input.nextInt();
                                    switch (callRegisterCost) {
                                        case 1 -> System.out.println("Last call cost");
                                        case 2 -> System.out.println("All calls’ cost");
                                        case 3 -> System.out.println("Clear counters");
                                    }
                                } while (callRegisterCost != 0);
                            }
                            case 7 -> {
                                System.out.println("Call cost settings");
                                System.out.printf("%s%n%s%n%s%n",
                                        "1. Call cost limit",
                                        "2. Show costs in",
                                        "0. Previous Menu");
                                do {
                                    System.out.print("navigate Call cost settings: ");
                                    callRegisterSettings = input.nextInt();
                                    switch (callRegisterSettings) {
                                        case 1 -> System.out.println("Call cost limit");
                                        case 2 -> System.out.println("Show costs in");
                                    }
                                } while (callRegisterSettings != 0);
                            }
                            case 8 -> {System.out.println("Prepaid credit"); System.exit(4);}
                            default -> System.out.println("Choose options again");
                        }
                    }while (callRegister != 0);
                }
                case 5 -> {
                    System.out.println("Tones");
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                            "1. Ringing tone",
                            " 2. Ringing volume",
                            "3. Incoming call alert",
                            "4. Composer",
                            "5. Message alert tone",
                            "6. Keypad tones",
                            "7. Warning and game tones",
                            "8. Vibrating alert",
                            "9. Screen saver");
                    do {
                        System.out.print("navigate Tones: ");
                        tones = input.nextInt();
                        switch (tones) {
                            case 1 -> {System.out.println("Ringing tone"); System.exit(5);}
                            case 2 -> {System.out.println("Ringing volume"); System.exit(5);}
                            case 3 -> {System.out.println("Incoming call alert"); System.exit(5);}
                            case 4 -> {System.out.println("Composer"); System.exit(5);}
                            case 5 -> {System.out.println("Message alert tone"); System.exit(5);}
                            case 6 -> {System.out.println("Keypad tones"); System.exit(5);}
                            case 7 -> {System.out.println("Warning and game tones"); System.exit(5);}
                            case 8 -> {System.out.println("Vibrating alert"); System.exit(5);}
                            case 9 -> {System.out.println("Screen saver"); System.exit(5);}
                        }
                    } while (tones != 0);
                }
                case 6 -> {
                    System.out.println("Settings");
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n",
                            "1. Call settings",
                            "2. Phone settings",
                            "3. Security settings",
                            "4. Restore factory settings",
                            "0. Previous Menu");
                    do {
                        System.out.print("navigate Settings: ");
                        settings = input.nextInt();
                        switch (settings) {
                            case 1: {
                                System.out.println("Call settings");
                                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                                        " 1. Automatic redial",
                                        "2. Speed dialling",
                                        "3. Call waiting options",
                                        "4. Own number sending",
                                        "5. Phone line in use",
                                        "6. Automatic answer",
                                        "0. Previous Menu");
                                do {
                                    System.out.print("navigate Settings/Call settings: ");
                                    callSettings = input.nextInt();
                                    switch (callSettings) {
                                        case 1 -> System.out.println("Automatic redial");
                                        case 2 -> System.out.println("Automatic redial");
                                        case 3 -> System.out.println("Call waiting options");
                                        case 4 -> System.out.println("Own number sending");
                                        case 5 -> System.out.println("Phone line in use");
                                        case 6 -> System.out.println("Automatic answer");
                                    }
                                } while (callSettings != 0);
                             }
                                break;
                            case 2: {
                                System.out.println("Phone settings");
                                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                                        "1. Language",
                                        "2. Cell info display",
                                        "3. Welcome note",
                                        "4. Network selection",
                                        " 5. Lights 2",
                                        " 6. Confirm SIM service actions",
                                        "0. Previous Menu");
                                do {
                                    System.out.print("navigate Settings/Phone settings: ");
                                    phoneSettings = input.nextInt();
                                    switch (phoneSettings) {
                                        case 1 -> System.out.println("Language");
                                        case 2 -> System.out.println("Cell info display");
                                        case 3 -> System.out.println("Welcome note");
                                        case 4 -> System.out.println("Network selection");
                                        case 5 -> System.out.println("Lights");
                                        case 6 -> System.out.println("Confirm SIM service actions");
                                    }
                                } while (phoneSettings != 0);
                            }
                                break;
                            case 3: {
                                System.out.println("Security settings");
                                System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                                        "1. PIN code request",
                                        "2. Call barring service",
                                        "3. Fixed dialling",
                                        " 4. Closed user group",
                                        " 5. Phone security",
                                        " 6. Change access codes",
                                        "0. Previous Menu");
                                do {
                                    System.out.print("navigate Settings/Security settings: ");
                                    securitySettings = input.nextInt();
                                    switch (securitySettings) {
                                        case 1 -> System.out.println("PIN code request");
                                        case 2 -> System.out.println("Call barring service");
                                        case 3 -> System.out.println("Fixed dialling");
                                        case 4 -> System.out.println("Closed user group");
                                        case 5 -> System.out.println("Phone security");
                                        case 6 -> System.out.println("Change access codes");
                                    }
                                } while (securitySettings != 0);
                            }
                                break;
                            case 4: {
                                System.out.println("Restore factory settings");
                                System.exit(6);
                            }
                                break;
                        }
                    } while (settings != 0);
                }
                case 7 -> {
                    System.out.println("Call divert");
                    System.exit(7);
                }
                case 8 -> {
                    System.out.println("Games");
                    System.exit(8);
                }
                case 9 -> {
                    System.out.println("Calculator");
                    System.exit(9);
                }
                case 10 -> {
                    System.out.println("Reminders");
                    System.exit(10);
                }
                case 11 -> {
                    System.out.println("Clock");
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                            "1. Alarm clock",
                            "2. Clock settings",
                            "3. Date setting",
                            "4. Stopwatch",
                            "5. Countdown timer",
                            "6. Auto update of date and time",
                            "0. Previous Menu");
                    do {
                        System.out.print("navigate Clock: ");
                        clock = input.nextInt();
                        switch (clock) {
                            case 1 -> System.out.println("Alarm clock");
                            case 2 -> System.out.println("Clock settings");
                            case 3 -> System.out.println("Date setting");
                            case 4 -> System.out.println("Stopwatch");
                            case 5 -> System.out.println("Countdown timer");
                            case 6 -> System.out.println("Auto update of date and time");
                        }
                    } while (clock != 0);
                }
                case 12 -> {
                    System.out.println("Profiles");
                    System.exit(12);
                }
                case 13 -> {
                    System.out.println("SIM services");
                    System.exit(13);
                }
            }
        } while (userInput != 0);
    }
}
