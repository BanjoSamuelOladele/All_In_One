public class DifferentShapesViaAsterisks2 {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfPrints;
        for (numberOfOccurence = 9; numberOfOccurence > 0; numberOfOccurence--){
            for (numberOfPrints = 0; numberOfPrints < numberOfOccurence; numberOfPrints++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}
