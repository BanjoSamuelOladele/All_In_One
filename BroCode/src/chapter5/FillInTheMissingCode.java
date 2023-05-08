package chapter5;

public class FillInTheMissingCode {
    public static void main(String[] args) {
        int userInput = 5;
        for (int index = 0; index < userInput; index++){
            for (int indexx = 0; indexx < userInput; indexx++){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
