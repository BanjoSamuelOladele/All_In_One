
        import java.util.Scanner;
        public class CountOfPositiveNegativeAndZero {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int userInput;
                int countOfPositiveNumbers = 0;
                int countOfNegativeNumbers = 0;
                int countOfZeroNumbers = 0;
                //char endOfProcess = '+';
                int breakPoint = 100;

//                System.out.print("Enter a number: ");
//                userInput = input.nextInt();

                do {
                    System.out.print("Enter a number: ");
                    userInput = input.nextInt();
                    if (userInput > 0) countOfPositiveNumbers++;
                    if (userInput == 0) countOfZeroNumbers++;
                    if (userInput < 0) countOfNegativeNumbers++;
                } while (userInput != breakPoint);
//                do{
//                    if(userInput > 0) countOfPositiveNumbers++;
//                    if (userInput == 0) countOfZeroNumbers++;
//                    if (userInput < 0) countOfNegativeNumbers++;
//                } while(userInput != 99);
                System.out.println("Number of positive is: " + countOfPositiveNumbers);
                System.out.println("Number of Negative is: " + countOfNegativeNumbers);
                System.out.println("Number of Zero is: " + countOfZeroNumbers);
            }
        }
