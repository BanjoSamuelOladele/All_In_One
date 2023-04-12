public class DifferentShapesViaAsterisks4 {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfOccurenceBreak = 9;
        int numberOfPrints1;
        int numberOfPrints2;
        for (numberOfOccurence = 0; numberOfOccurence <= numberOfOccurenceBreak; numberOfOccurence++){
            for (numberOfPrints1 = 0; numberOfPrints1 < numberOfOccurence; numberOfPrints1++){
                System.out.print(" ");
            }
            for (numberOfPrints2 = 9; numberOfPrints2 > numberOfPrints1; numberOfPrints2--){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
