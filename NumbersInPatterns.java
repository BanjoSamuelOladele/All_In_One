public class NumbersInPatterns {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfPrints;
        int numbersAndPreceeding;

         for (numberOfOccurence = 0; numberOfOccurence < 7; numberOfOccurence++){
             numbersAndPreceeding = 1;
             for (numberOfPrints = 0; numberOfPrints < numberOfOccurence; numberOfPrints++){
                 System.out.print(numbersAndPreceeding);
                 System.out.print(" ");
                 numbersAndPreceeding++;
             }
             System.out.println( );
         }
    }
}
