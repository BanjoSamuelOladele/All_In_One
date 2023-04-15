public class NumbersInPattern4 {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfPrints;
        int numbersAndPreceeding;
        int secondPrints;

        for (numberOfOccurence = 1; numberOfOccurence < 7; numberOfOccurence++){
            numbersAndPreceeding = 1;
            for (numberOfPrints = 1; numberOfPrints < numberOfOccurence; numberOfPrints++){
                System.out.print(" ");
            }
            for (secondPrints = 7; secondPrints > numberOfOccurence; secondPrints--){
                System.out.print(numbersAndPreceeding);
                numbersAndPreceeding++;
            }
            System.out.println( );
        }
    }
}
