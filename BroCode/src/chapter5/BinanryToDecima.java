package chapter5;

public class BinanryToDecima {
    public static void main(String[] args) {
        int userInput = 1000111;
        int sumOfDecimal = 0;

        for (int index = 0; index < userInput; index++){
            int remainder;
            if (index == 0){
                remainder = userInput % 10;
                sumOfDecimal += remainder * Math.pow(2, index);
            }
            if (index > 0){
                userInput = userInput / 10;
                remainder = userInput % 10;
                sumOfDecimal += remainder * Math.pow(2, index);
            }
        }
        System.out.println(sumOfDecimal);
    }
}
