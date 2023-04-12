public class DifferentShapesViaAsterisks {
    public static void main(String[] args) {
        int numberOfOccurence;
        int numberOfPrints;
        for (numberOfOccurence = 0; numberOfOccurence < 9; numberOfOccurence++){
           for (numberOfPrints = 0; numberOfPrints <= numberOfOccurence; numberOfPrints++){
               System.out.print("*");
           }
            System.out.println( );
        }
    }
}
