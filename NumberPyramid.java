public class NumberPyramid {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfPrints;
        int numberOfPrints2;
        int numberOfPrints3;
        int numbersAndPreceeding = 1;
        for (numberOfOccurence = 1; numberOfOccurence < 7; numberOfOccurence++){
            for (numberOfPrints = 8; numberOfPrints > numberOfOccurence; numberOfPrints--){
                System.out.print(" ");
            }
            for (numberOfPrints2 = 0; numberOfPrints2 < numberOfOccurence ; numberOfPrints2++){
                System.out.print(numbersAndPreceeding);
            }
            for (numberOfPrints3 = 1; numberOfPrints3 < numberOfPrints2; numberOfPrints3++){
                System.out.print(numbersAndPreceeding);
            }
            numbersAndPreceeding++;
            System.out.println( );
        }
    }
}
