public class NUmberInPatterns3 {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfPrints;
        int numberOfPrints2;
        int numbersAndPreceeding;

        for (numberOfOccurence = 1; numberOfOccurence < 7; numberOfOccurence++){
            numbersAndPreceeding = 1;
            for (numberOfPrints = 6; numberOfPrints > numberOfOccurence; numberOfPrints--){
                System.out.print(" ");
            }
            for (numberOfPrints2 = 0; numberOfPrints2 < numberOfOccurence; numberOfPrints2++){
                System.out.print(numbersAndPreceeding);
                numbersAndPreceeding++;
            }
            System.out.println( );
        }
    }
}