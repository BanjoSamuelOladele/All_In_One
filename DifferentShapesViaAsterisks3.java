public class DifferentShapesViaAsterisks3 {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfOccurenceBreak = 9;
        int numberOfPrints1;
        int numberOfPrints2;
        for (numberOfOccurence = 1; numberOfOccurence <= numberOfOccurenceBreak; numberOfOccurence++){
            for (numberOfPrints1 = 9; numberOfPrints1 > numberOfOccurence; numberOfPrints1--){
                System.out.print(" ");
            }
            for (numberOfPrints2 = 0; numberOfPrints2 < numberOfPrints1; numberOfPrints2++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
