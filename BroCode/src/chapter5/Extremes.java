package chapter5;
import java.util.Scanner;
public class Extremes {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
      int maxNumber=0;
      int semiMaxNumber=0;
      for (int index = 0; index < 5; index++){
          System.out.print("Enter a number: ");
          int userChoice = userInput.nextInt();
          if (userChoice > 0){
              if (userChoice > maxNumber) maxNumber = userChoice;
              if (userChoice < maxNumber && semiMaxNumber < userChoice) semiMaxNumber = userChoice;
          }
      }
      System.out.println("The maximum number is: "+maxNumber);
      System.out.println();
        System.out.println("The semi max number is: "+ semiMaxNumber);
    }
}
