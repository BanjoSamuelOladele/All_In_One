public class AsteriksOnAStraightLIne {
    public static void main(String[] args) {
        int numberOfOccurence;
        int occurenceTime = 5;
        int numberOfOperation;
        int operationTimes = 10;

        for (numberOfOccurence = 0; numberOfOccurence < occurenceTime; numberOfOccurence++){
            for (numberOfOperation = 0; numberOfOperation < operationTimes; numberOfOperation++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println( );
        }
    }
}
