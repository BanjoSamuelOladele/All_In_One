public class NumbersInPatterns2 {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfPrints;
        int numbersAndPreceeding;

        for (numberOfOccurence = 7; numberOfOccurence > 0; numberOfOccurence--){
            numbersAndPreceeding = 1;
            for (numberOfPrints = 1; numberOfPrints < numberOfOccurence; numberOfPrints++){
                System.out.print(numbersAndPreceeding);
                System.out.print(" ");
                numbersAndPreceeding++;
            }
            System.out.println( );
        }
    }
}
