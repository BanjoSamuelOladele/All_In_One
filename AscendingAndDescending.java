public class AscendingAndDescending {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfOccurence1;
        int numberOfOccurence2;
        int numberOfOccurence3;
        for (numberOfOccurence = 0; numberOfOccurence < 6; numberOfOccurence++){
            for (numberOfOccurence1 = 6; numberOfOccurence1 > 1; numberOfOccurence1--){
                System.out.print(" ");
            }
            for (numberOfOccurence2 = 0; numberOfOccurence2 < numberOfOccurence1; numberOfOccurence2++){
                int number1 = 1;
                System.out.print(number1);
                number1++;
            }
            for (numberOfOccurence3 = 1; numberOfOccurence3 < numberOfOccurence2; numberOfOccurence3++){
                int number2 = 1;
                number2++;
                System.out.print(number2);
            }
        }
        System.out.println( );
    }
}
